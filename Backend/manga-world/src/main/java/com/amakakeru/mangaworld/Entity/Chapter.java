package com.amakakeru.mangaworld.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "chapter")
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long cId;

    @Column(name = "c_number", nullable = false, columnDefinition = "int default 0")
    private int cNumber;

    @Column(name = "c_release_date", nullable = false)
    private java.sql.Date cReleaseDate;

    @Column(name = "c_page_count", nullable = false, columnDefinition = "int default 0")
    private int cPageCount;

    @Column(name = "c_view", nullable = false, columnDefinition = "int default 0")
    private int cView;

    @ManyToOne
    @JoinColumn(name = "v_id", nullable = false)
    private Volume volume;

    @JsonIgnore
    @OneToOne(mappedBy = "chapter", cascade = CascadeType.ALL, orphanRemoval = true)
    private ChapterCover chapterCover;

    @JsonIgnore
    @OneToOne(mappedBy = "chapter", cascade = CascadeType.ALL, orphanRemoval = true)
    private MangaFile mangaFiles;
}
