package com.amakakeru.mangaworld.Controller;

import com.amakakeru.mangaworld.Entity.Combined.SearchComponent;
import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.Volume;
import com.amakakeru.mangaworld.Repository.AuthorRepository;
import com.amakakeru.mangaworld.Repository.MangaRepository;
import com.amakakeru.mangaworld.Repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SearchComponentController {

    @Autowired
    private MangaRepository mangaRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorRepository publisherRepository;

    @Autowired
    private VolumeRepository volumeRepository;

    @Autowired
    private MangaController mangaController;

    public static List<String> extractWords(String input) {
        List<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            words.add(matcher.group());
        }
        return words;
    }

    @PostMapping("/search")
    public SearchComponent search(@RequestBody String keyword) {
        try {
            String decodedString = URLDecoder.decode(keyword, "UTF-8");
//            keyword = decodedString.substring(0, decodedString.length() - 1);
            List<String> tempKeywords = mangaController.getKeywordsFromSearchHistory(keyword);
            List<String> keyWords;
            if (tempKeywords.size() < 2) {
                keyWords = extractWords(keyword);
            } else {
                keyWords = tempKeywords;
            }
            HashMap<Manga, Integer> mangas = new HashMap<>();

            for (String key : keyWords) {
                List<Manga> tempManga = mangaRepository.findAllByMtitleContainingIgnoreCase(key);
                tempManga.addAll(mangaRepository.findAllByMdescriptionContainingIgnoreCase(key));
                List<Volume> tempVolumes = volumeRepository.findAllByVtitleContainingIgnoreCase(key);
                tempVolumes.forEach(volume -> tempManga.add(volume.getManga()));
                for (Manga manga : tempManga) {
                    if (mangas.containsKey(manga)) {
                        mangas.put(manga, mangas.get(manga) + 1);
                    } else {
                        mangas.put(manga, 1);
                    }
                }
            }

            List<Map.Entry<Manga, Integer>> entryList = new ArrayList<>(mangas.entrySet());
            entryList.sort(Map.Entry.<Manga, Integer>comparingByValue().reversed());

            List<Manga> sortedMangaList = entryList.stream()
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());
            sortedMangaList.forEach(System.out::println);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new SearchComponent();
        }
        return new SearchComponent();
    }
}
