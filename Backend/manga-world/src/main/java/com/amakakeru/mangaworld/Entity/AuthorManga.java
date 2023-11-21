package com.amakakeru.mangaworld.Entity;

import com.amakakeru.mangaworld.Entity.IdClasses.AuthorMangaId;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@IdClass(AuthorMangaId.class)
@Table(name = "author_manga")
public class AuthorManga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long aId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Long mId;

    @ManyToOne
    @JoinColumn(name = "a_id", insertable = false, updatable = false)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "m_id", insertable = false, updatable = false)
    private Manga manga;
}
