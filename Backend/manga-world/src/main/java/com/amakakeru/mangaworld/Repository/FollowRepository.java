package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Author;
import com.amakakeru.mangaworld.Entity.Follow;
import com.amakakeru.mangaworld.Entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {

    Optional<Follow> findFollowByAuthorAndUser(Author author, User user);

    List<Follow> findAllByAuthor(Author author);

    List<Follow> findAllByUserId(Long userId, Pageable pageable);

    Integer countFollowsByUserId(Long userId);

}
