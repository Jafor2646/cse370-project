package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Manga;
import com.amakakeru.mangaworld.Entity.User;
import com.amakakeru.mangaworld.Entity.Wishlist;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

    Optional<Wishlist> findWishlistByMangaAndUser(Manga manga, User user);

    List<Wishlist> findAllByUserId(Long userId, Pageable pageable);

    Integer countWishlistByUserId(Long userId);
}
