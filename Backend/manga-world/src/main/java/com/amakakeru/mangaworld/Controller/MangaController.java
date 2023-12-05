package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Repository.MangaRepository;
import com.amakakeru.mangaworld.Repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MangaController {

    @Autowired
    private MangaRepository mangaRepository;

    @Autowired
    private RateRepository rateRepository;

    @GetMapping("/mangas/getAllMangaNames")
    public List<String> getAllMangaNames() {
        List<Manga> mangas = mangaRepository.getMangasForPlaceholder();
        List<String> mangaNames = new ArrayList<>();
        for (Manga manga : mangas) {
            mangaNames.add(manga.getMTitle());
        }
        return mangaNames;
    }

    @GetMapping("/mangas/getMostViewedManga")
    public List<Manga> getMostViewedManga() {
        return mangaRepository.getMostViewedManga();
    }

    @GetMapping("/mangas/getMostRatedManga")
    public List<Manga> getMostRatedManga() {
        return mangaRepository.getMostRatedManga();
    }

    @GetMapping("/mangas/getNewManga")
    public List<Manga> getNewManga() {
        return mangaRepository.getNewManga();
    }

    @GetMapping("/mangas/getMostReadMangas")
    public List<Manga> getMostReadMangas() {
        return mangaRepository.getMostReadMangas();
    }

    @GetMapping("/mangas/getTodayPickMangas")
    public List<Manga> getTodayPickMangas() {
        Integer totalMangaCount = mangaRepository.allMangaCount();
        List<Manga> mangas = new ArrayList<>();
        if (totalMangaCount < 50) {
            return mangaRepository.findAll();
        } else {
            while (mangas.size() != 50) {
                Random random = new Random();
                int min = 1;
                int max = totalMangaCount;
                int randomValueInRange = random.nextInt(max - min + 1) + min;
                Manga manga = mangaRepository.findById((long) randomValueInRange).get();
                if (!mangas.contains(manga)) {
                    mangas.add(manga);
                }
            }
        }
        return mangas;
    }

}
