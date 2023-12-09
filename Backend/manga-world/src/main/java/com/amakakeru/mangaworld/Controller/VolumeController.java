package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.Volume;
import com.amakakeru.mangaworld.Entity.VolumeCover;
import com.amakakeru.mangaworld.Repository.VolumeCoverRepository;
import com.amakakeru.mangaworld.Repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VolumeController {
    @Autowired
    private VolumeRepository volumeRepository;

    @Autowired
    private VolumeCoverRepository volumeCoverRepository;

    @PostMapping("/volumes/findAllByManga")
    private List<Volume> findAllByManga(@RequestBody Manga manga) {
        return volumeRepository.findAllByManga(manga);
    }

    @PostMapping("/volumes/findVolumePicture")
    private VolumeCover findVolumePicture(@RequestBody Volume volume) {
        return volumeCoverRepository.findVolumeCoverByVolume(volume);
    }

    @PostMapping("/volumes/addNewVolume")
    private Volume addNewVolume(@RequestBody Volume volume) {
        return volumeRepository.save(volume);
    }

    @PostMapping("/volumes/addVolumeCover")
    private VolumeCover addVolumeCover(@RequestBody VolumeCover volumeCover) {
        return volumeCoverRepository.save(volumeCover);
    }
}
