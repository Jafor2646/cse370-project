package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Author;
import com.amakakeru.mangaworld.Entity.AuthorManga;
import com.amakakeru.mangaworld.Entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorMangaRepository extends JpaRepository<AuthorManga, Long> {

    List<AuthorManga> findAllByManga(Manga manga);
}
