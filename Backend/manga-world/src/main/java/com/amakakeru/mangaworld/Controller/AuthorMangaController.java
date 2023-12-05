package com.amakakeru.mangaworld.Controller;

import com.amakakeru.mangaworld.Entity.Author;
import com.amakakeru.mangaworld.Entity.AuthorManga;
import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Repository.AuthorMangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
public class AuthorMangaController {

    @Autowired
    private AuthorMangaRepository authorMangaRepository;

    @PostMapping("/authorMangas/getAuthorMangaByManga")
    public List<AuthorManga> getAuthorMangaByManga(@RequestBody Manga manga){
        return authorMangaRepository.findAllByManga(manga);
    }
}
