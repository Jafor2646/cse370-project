package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {
}
