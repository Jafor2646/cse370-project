package com.amakakeru.mangaworld.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "manga")
public class Manga implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private Long mId;

    @Column(name = "m_title", nullable = false)
    private String mTitle;

    @Column(name = "m_status", nullable = false)
    private String mStatus;

    @Column(name = "m_publish_date", nullable = false)
    private java.sql.Date mPublishDate;

    @Column(name = "m_view", nullable = false, columnDefinition = "int default 0")
    private int mView;

    @Column(name = "m_description", nullable = false, length = 5120)
    private String mDescription;

    @JsonIgnore
    @OneToOne(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private MangaPicture mangaPicture;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Volume> volumes;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Rate> rates;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AlreadyRead> alreadyReadList;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Wishlist> wishlist;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ongoing> ongoingList;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CategoryManga> categoryMangas;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AuthorManga> authorMangas;

    @JsonIgnore
    @OneToMany(mappedBy = "manga", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PublisherManga> publisherMangas;
}
