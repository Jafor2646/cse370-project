package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {

    @Query(value = "select * from manga ORDER BY m_view desc LIMIT 10", nativeQuery = true)
    List<Manga> getMangasForPlaceholder();
}
