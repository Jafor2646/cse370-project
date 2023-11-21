package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
}
