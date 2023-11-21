package com.amakakeru.mangaworld.Entity;

import com.amakakeru.mangaworld.Entity.IdClasses.OngoingId;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@IdClass(OngoingId.class)
@Table(name = "ongoing")
public class Ongoing implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "m_id")
    private Long mId;

    @Column(name = "current_volume", nullable = false)
    private int currentVolume;

    @Column(name = "current_chapter", nullable = false)
    private int currentChapter;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "m_id", insertable = false, updatable = false)
    private Manga manga;

    @ManyToOne
    @JoinColumn(name = "current_volume", insertable = false, updatable = false)
    private Volume volume;

    @ManyToOne
    @JoinColumn(name = "current_chapter", insertable = false, updatable = false)
    private Chapter chapter;
}
