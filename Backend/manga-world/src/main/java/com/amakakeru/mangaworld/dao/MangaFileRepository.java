package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.MangaFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaFileRepository extends JpaRepository<MangaFile, Long> {
}
