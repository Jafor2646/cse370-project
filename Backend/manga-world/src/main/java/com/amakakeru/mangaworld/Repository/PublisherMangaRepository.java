package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.Publisher;
import com.amakakeru.mangaworld.Entity.PublisherManga;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherMangaRepository extends JpaRepository<PublisherManga, Long> {

    PublisherManga findAllByManga(Manga manga);

    List<PublisherManga> findAllByPublisher(Publisher publisher);

    List<PublisherManga> findPublisherMangasByPublisher(Publisher publisher, Pageable pageable);
}
