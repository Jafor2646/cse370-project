package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.PublisherManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherMangaRepository extends JpaRepository<PublisherManga, Long> {
}
