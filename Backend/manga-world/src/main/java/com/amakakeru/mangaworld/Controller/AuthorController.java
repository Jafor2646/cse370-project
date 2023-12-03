package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Author;
import com.amakakeru.mangaworld.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @GetMapping("/authors/getAllAuthors")
    public List<Author> getAllAuthors(){return authorRepository.findAll();}

    @GetMapping("/authors/{aId}")
    public Optional<Author> getAuthor(@PathVariable String aId){
        return authorRepository.findById(Long.parseLong(aId));
    }
}
