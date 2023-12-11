package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.AlreadyRead;
import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AlreadyReadRepository extends JpaRepository<AlreadyRead, Long> {

    Optional<AlreadyRead> findAlreadyReadByMangaAndUser(Manga manga, User user);

}
