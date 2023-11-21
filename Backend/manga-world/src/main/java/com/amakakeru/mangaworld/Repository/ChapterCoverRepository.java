package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.ChapterCover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterCoverRepository extends JpaRepository<ChapterCover, Long> {
}
