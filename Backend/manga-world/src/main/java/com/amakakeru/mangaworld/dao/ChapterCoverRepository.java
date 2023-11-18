package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.ChapterCover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterCoverRepository extends JpaRepository<ChapterCover, Long> {
}
