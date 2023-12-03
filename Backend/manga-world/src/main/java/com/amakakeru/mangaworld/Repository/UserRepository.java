package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    select u1_0.user_id from user u1_0 where u1_0.email=email
    boolean existsByEmail(String email);

    @Query("select u from User u where u.email = ?1")
    User findUserByEmail(String email);
}
