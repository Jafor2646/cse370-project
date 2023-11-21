package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}
