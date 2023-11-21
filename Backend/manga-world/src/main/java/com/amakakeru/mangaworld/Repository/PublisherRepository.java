package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
