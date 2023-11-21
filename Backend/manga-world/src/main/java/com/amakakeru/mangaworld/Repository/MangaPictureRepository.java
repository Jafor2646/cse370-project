package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.MangaPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangaPictureRepository extends JpaRepository<MangaPicture, Long> {
}
