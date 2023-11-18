package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.AuthorManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorMangaRepository extends JpaRepository<AuthorManga, Long> {
}
