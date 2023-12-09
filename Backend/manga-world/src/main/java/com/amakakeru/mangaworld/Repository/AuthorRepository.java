package com.amakakeru.mangaworld.Repository;


import com.amakakeru.mangaworld.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findAllByAnameContainingIgnoreCase(String title);

    List<Author> findAllByAdescriptionContainingIgnoreCase(String description);
}
