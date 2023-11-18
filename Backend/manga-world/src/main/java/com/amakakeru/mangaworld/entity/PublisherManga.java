package com.amakakeru.mangaworld.entity;

import com.amakakeru.mangaworld.entity.IdClasses.PublisherMangaId;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@IdClass(PublisherMangaId.class)
@Table(name = "publisher_manga")
public class PublisherManga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long pId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Long mId;

    @ManyToOne
    @JoinColumn(name = "p_id", insertable = false, updatable = false)
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "m_id", insertable = false, updatable = false)
    private Manga manga;
}
