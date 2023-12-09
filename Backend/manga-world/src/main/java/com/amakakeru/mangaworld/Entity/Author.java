package com.amakakeru.mangaworld.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long aid;

    @Column(name = "a_name", nullable = false)
    private String aname;

    @Column(name = "a_website", nullable = false)
    private String awebsite;

    @Column(name = "a_description", nullable = false, length = 5120)
    private String adescription;

    @JsonIgnore
    @OneToOne(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private AuthorPicture authorPicture;

    @JsonIgnore
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AuthorManga> authorMangas;

    @JsonIgnore
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Follow> follower;
}
