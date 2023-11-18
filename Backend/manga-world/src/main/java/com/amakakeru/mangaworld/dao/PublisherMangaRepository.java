package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.PublisherManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherMangaRepository extends JpaRepository<PublisherManga, Long> {
}
