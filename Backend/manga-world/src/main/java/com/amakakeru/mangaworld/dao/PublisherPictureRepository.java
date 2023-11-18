package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.PublisherPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherPictureRepository extends JpaRepository<PublisherPicture, Long> {
}
