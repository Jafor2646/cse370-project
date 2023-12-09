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
    private Long pid;

    @Column(name = "p_name", nullable = false)
    private String pname;

    @Column(name = "p_website", nullable = false)
    private String pwebsite;

    @Column(name = "p_description", nullable = false, length = 5120)
    private String pdescription;

    @JsonIgnore
    @OneToOne(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    private PublisherPicture publisherPicture;

    @JsonIgnore
    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PublisherManga> publisherMangas;
}
