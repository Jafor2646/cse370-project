package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.AuthorManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorMangaRepository extends JpaRepository<AuthorManga, Long> {
}
