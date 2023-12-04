package com.amakakeru.mangaworld.Controller;


import com.amakakeru.mangaworld.Entity.Category;
import com.amakakeru.mangaworld.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/allCategories")
    public List<Category> getMangaByCategory(){
//        select c1_0.c_id,c1_0.c_name from category c1_0
        return categoryRepository.findAll();
    }

}
