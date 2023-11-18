package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.CategoryManga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMangaRepository extends JpaRepository<CategoryManga, Long> {
}
