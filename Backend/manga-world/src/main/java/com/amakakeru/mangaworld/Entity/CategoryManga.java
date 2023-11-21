package com.amakakeru.mangaworld.Entity;

import com.amakakeru.mangaworld.Entity.IdClasses.CategoryMangaId;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@IdClass(CategoryMangaId.class)
@Table(name = "category_manga")
public class CategoryManga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long cId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Long mId;

    @ManyToOne
    @JoinColumn(name = "c_id", insertable = false, updatable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "m_id", insertable = false, updatable = false)
    private Manga manga;
}
