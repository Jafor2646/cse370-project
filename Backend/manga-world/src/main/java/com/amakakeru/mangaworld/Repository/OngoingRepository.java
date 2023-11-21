package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Ongoing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngoingRepository extends JpaRepository<Ongoing, Long> {
}
