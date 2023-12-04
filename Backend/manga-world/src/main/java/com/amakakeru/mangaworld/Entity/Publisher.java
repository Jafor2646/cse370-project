package com.amakakeru.mangaworld.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "p_id")
    private Long pId;

    @Column(name = "p_name", nullable = false)
    private String pName;

    @Column(name = "p_website", nullable = false)
    private String pWebsite;

    @Column(name = "p_description", nullable = false, length = 5120)
    private String pDescription;

    @JsonIgnore
    @OneToOne(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    private PublisherPicture publisherPicture;

    @JsonIgnore
    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PublisherManga> publisherMangas;
}
