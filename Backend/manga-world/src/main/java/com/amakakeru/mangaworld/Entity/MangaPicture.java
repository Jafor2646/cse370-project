package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "manga_picture")
public class MangaPicture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mp_id")
    private Long mpId;

    @Lob
    @Column(name = "mp_picture", nullable = false)
    private byte[] mpPicture;

    @OneToOne
    @JoinColumn(name = "m_id", nullable = false, unique = true)
    private Manga manga;
}
