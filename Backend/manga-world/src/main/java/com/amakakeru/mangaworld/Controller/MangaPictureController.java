package com.amakakeru.mangaworld.Controller;

import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.MangaPicture;
import com.amakakeru.mangaworld.Repository.MangaPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MangaPictureController {

    @Autowired
    private MangaPictureRepository mangaPictureRepository;

    @PostMapping("/mangaPictures/getByManga")
    public MangaPicture getMangaPictureByMangaId(@RequestBody Manga manga){
        return mangaPictureRepository.findMangaPictureByManga(manga);
    }
}
