package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.MangaPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaPictureRepository extends JpaRepository<MangaPicture, Long> {
}