package com.amakakeru.mangaworld.dao;

import com.amakakeru.mangaworld.entity.AlreadyRead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlreadyReadRepository extends JpaRepository<AlreadyRead, Long> {

}
