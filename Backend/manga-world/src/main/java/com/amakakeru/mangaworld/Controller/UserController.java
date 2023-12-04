package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.User;
import com.amakakeru.mangaworld.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;
}
