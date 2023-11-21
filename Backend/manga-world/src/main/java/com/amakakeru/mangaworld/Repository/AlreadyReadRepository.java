package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.AlreadyRead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlreadyReadRepository extends JpaRepository<AlreadyRead, Long> {

}
