package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "manga_picture")
public class MangaPicture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mp_id")
    private Long mpId;

    @Lob
    @Column(name = "mp_picture", nullable = false)
    private byte[] mpPicture;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "m_id", nullable = false, unique = true)
    private Manga manga;
}
