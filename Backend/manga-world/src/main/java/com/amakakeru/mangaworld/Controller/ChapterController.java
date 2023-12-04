package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Chapter;
import com.amakakeru.mangaworld.Repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChapterController {

    @Autowired
    private ChapterRepository chapterRepository;

    @GetMapping("/chapters/getAllChapter")
    public List<Chapter> getAllChapter(){
        return chapterRepository.findAll();
    }

    @GetMapping("/chapters/{cId}")
    public Optional<Chapter> getUser(@PathVariable String cId){
        return chapterRepository.findById(Long.parseLong(cId));
    }
}
