package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "manga_file")
public class MangaFile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mf_id")
    private Long mfId;

    @Lob
    @Column(name = "mf_file", nullable = false)
    private byte[] mfFile;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id", nullable = false)
    private Chapter chapter;
}
