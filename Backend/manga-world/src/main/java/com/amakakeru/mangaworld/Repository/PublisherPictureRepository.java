package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.PublisherPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherPictureRepository extends JpaRepository<PublisherPicture, Long> {
}
