package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.Volume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@Repository
public interface VolumeRepository extends JpaRepository<Volume, Long> {
    List<Volume> findAllByManga(Manga manga);

    List<Volume> findAllByVtitleContainingIgnoreCase(String keyword);
}
