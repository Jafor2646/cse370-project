package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.Ongoing;
import com.amakakeru.mangaworld.Entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OngoingRepository extends JpaRepository<Ongoing, Long> {

    Optional<Ongoing> findOngoingByMangaAndUser(Manga manga, User user);

    List<Ongoing> findAllByUserId(Long userId, Pageable pageable);

    Integer countOngoingByUserId(Long userId);
}
