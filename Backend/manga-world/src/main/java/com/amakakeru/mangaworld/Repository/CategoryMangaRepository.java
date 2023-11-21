package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.CategoryManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMangaRepository extends JpaRepository<CategoryManga, Long> {
}
