package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Category;
import com.amakakeru.mangaworld.Entity.User;
import com.amakakeru.mangaworld.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/categories/{cId}")
    public Optional<Category> getMangaByCategory(@PathVariable String cId){
        return categoryRepository.findById(Long.parseLong(cId));
    }

}
