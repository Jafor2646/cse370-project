package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.User;
import com.amakakeru.mangaworld.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/getUserById/{userId}")
    public User getUserById(@PathVariable String userId) {
        return userRepository.findUserByUserId(Long.parseLong(userId));
    }
}
