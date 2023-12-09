package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    List<Publisher> findAllByPnameContainingIgnoreCase(String name);

    List<Publisher> findAllByPdescriptionContainingIgnoreCase(String description);
}
