package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Volume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolumeRepository extends JpaRepository<Volume, Long> {
}
