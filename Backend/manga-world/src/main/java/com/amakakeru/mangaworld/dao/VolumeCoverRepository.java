package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.VolumeCover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolumeCoverRepository extends JpaRepository<VolumeCover, Long> {
}
