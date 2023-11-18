package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.AuthorPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorPictureRepository extends JpaRepository<AuthorPicture, Long> {
}
