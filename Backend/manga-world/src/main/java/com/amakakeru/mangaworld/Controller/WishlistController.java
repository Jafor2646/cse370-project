package com.amakakeru.mangaworld.Controller;

import com.amakakeru.mangaworld.Entity.AlreadyRead;
import com.amakakeru.mangaworld.Entity.Ongoing;
import com.amakakeru.mangaworld.Entity.Wishlist;
import com.amakakeru.mangaworld.Repository.AlreadyReadRepository;
import com.amakakeru.mangaworld.Repository.OngoingRepository;
import com.amakakeru.mangaworld.Repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.Date;

@CrossOrigin("http://localhost:3000")
@RestController
public class WishlistController {

    @Autowired
    private WishlistRepository wishlistRepository;

    @Autowired
    private OngoingRepository ongoingRepository;

    @Autowired
    private AlreadyReadRepository alreadyReadRepository;

    @PostMapping("/currentStatusChecker")
    public String currentStatusChecker(@RequestBody Wishlist wishlist) {
        if (wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            return "wishlist";
        } else if (ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            return "ongoing";
        } else if (alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            return "alreadyread";
        } else {
            return "interested";
        }
    }

    @PostMapping("/addToWishList")
    public void addToWishList(@RequestBody Wishlist wishlist) {
        if (ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            ongoingRepository.delete(ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        if (alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            alreadyReadRepository.delete(alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        Timestamp currentTimestamp = new Timestamp(currentDate.getTime());
        wishlist.setAddedDate(currentTimestamp);
        wishlist.setUserId(wishlist.getUser().getUserId());
        wishlist.setMid(wishlist.getManga().getMid());
        wishlistRepository.save(wishlist);
    }

    @PostMapping("/addToOngoing")
    public void addToOngoing(@RequestBody Wishlist wishlist) {
        if (wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            wishlistRepository.delete(wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        if (alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            alreadyReadRepository.delete(alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        Timestamp currentTimestamp = new Timestamp(currentDate.getTime());
        Ongoing ongoing = new Ongoing();
        ongoing.setUser(wishlist.getUser());
        ongoing.setManga(wishlist.getManga());
        ongoing.setMid(wishlist.getManga().getMid());
        ongoing.setUserId(wishlist.getUser().getUserId());
        ongoing.setAddedDate(currentTimestamp);
        ongoingRepository.save(ongoing);
    }

    @PostMapping("/addToAlreadyRead")
    public void addToAlreadyRead(@RequestBody Wishlist wishlist) {
        if (wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            wishlistRepository.delete(wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        if (ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            ongoingRepository.delete(ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        long currentTimeMillis = System.currentTimeMillis();
        Date currentDate = new Date(currentTimeMillis);
        Timestamp currentTimestamp = new Timestamp(currentDate.getTime());

        AlreadyRead alreadyRead = new AlreadyRead();
        alreadyRead.setUser(wishlist.getUser());
        alreadyRead.setManga(wishlist.getManga());
        alreadyRead.setUserId(wishlist.getUser().getUserId());
        alreadyRead.setMid(wishlist.getManga().getMid());
        alreadyRead.setAddedDate(currentTimestamp);
        alreadyReadRepository.save(alreadyRead);
    }

    @PostMapping("/removeAllInterest")
    public void removeAllInterest(@RequestBody Wishlist wishlist) {
        if (wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            wishlistRepository.delete(wishlistRepository.findWishlistByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        if (ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            ongoingRepository.delete(ongoingRepository.findOngoingByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
        if (alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).isPresent()) {
            alreadyReadRepository.delete(alreadyReadRepository.findAlreadyReadByMangaAndUser(wishlist.getManga(), wishlist.getUser()).get());
        }
    }
}
