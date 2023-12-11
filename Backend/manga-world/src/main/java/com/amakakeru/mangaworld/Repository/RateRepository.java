package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.Rate;
import com.amakakeru.mangaworld.Entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {

    List<Rate> findAllByManga(Manga manga);

    List<Rate> findAllByMangaOrderByRdateDesc(Manga manga, Pageable pageable);

    Optional<Rate> findRateByMangaAndUser(Manga manga, User user);
}
