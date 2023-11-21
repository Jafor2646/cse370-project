package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.AuthorPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorPictureRepository extends JpaRepository<AuthorPicture, Long> {
}
