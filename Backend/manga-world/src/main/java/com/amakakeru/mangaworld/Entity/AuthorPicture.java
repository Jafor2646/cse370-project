package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "author_picture")
public class AuthorPicture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ap_id")
    private Long apId;

    @Lob
    @Column(name = "ap_picture", nullable = false)
    private byte[] apPicture;

    @OneToOne
    @JoinColumn(name = "a_id", nullable = false, unique = true)
    private Author author;
}
