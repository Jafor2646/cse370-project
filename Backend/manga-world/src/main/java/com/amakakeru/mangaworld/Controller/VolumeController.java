package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Volume;
import com.amakakeru.mangaworld.Repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VolumeController {
    @Autowired
    private VolumeRepository volumeRepository;

    @GetMapping("/volumes/getAllVolume")
    List<Volume> getAllVolume(){return volumeRepository.findAll();}

    @GetMapping("/volumes/{vId}")
    Optional<Volume> getVolume(@PathVariable String vId){
        return volumeRepository.findById(Long.parseLong(vId));
    }
}
