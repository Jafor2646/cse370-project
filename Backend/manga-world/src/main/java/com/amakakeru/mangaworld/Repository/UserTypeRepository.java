package com.amakakeru.mangaworld.Repository;

import com.amakakeru.mangaworld.Entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
