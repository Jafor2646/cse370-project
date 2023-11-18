package com.amakakeru.mangaworld.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "chapter_cover")
public class ChapterCover implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cc_id")
    private Long ccId;

    @Lob
    @Column(name = "cc_picture", nullable = false)
    private byte[] ccPicture;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id", nullable = false, unique = true)
    private Chapter chapter;
}
