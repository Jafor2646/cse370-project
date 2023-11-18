package com.amakakeru.mangaworld.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "volume")
public class Volume implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "v_id")
    private Long vId;

    @Column(name = "v_number", nullable = false, columnDefinition = "int default 0")
    private int vNumber;

    @Column(name = "v_title", nullable = false)
    private String vTitle;

    @Column(name = "v_release_date", nullable = false)
    private java.sql.Date vReleaseDate;

    @Column(name = "v_view", nullable = false, columnDefinition = "int default 0")
    private int vView;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "m_id", nullable = false)
    private Manga manga;

    @OneToMany(mappedBy = "volume", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Chapter> chapters;

    @OneToOne(mappedBy = "volume", cascade = CascadeType.ALL, orphanRemoval = true)
    private VolumeCover volumeCover;
}
