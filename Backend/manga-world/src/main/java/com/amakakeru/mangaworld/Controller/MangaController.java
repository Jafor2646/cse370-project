package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Repository.MangaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MangaController {

    @Autowired
    MangaRepository mangaRepository;

    @GetMapping("/mangas/getAllManga")
    public List<Manga> getAllManga(){
        return mangaRepository.findAll();
    }

    @GetMapping("/mangas/{mId}")
    public Optional<Manga> getManga(@PathVariable String mId){
        return mangaRepository.findById(Long.parseLong(mId));
    }
}