package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "profile_picture")
public class ProfilePicture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "picture_id")
    private Long pictureId;

    @Lob
    @Column(name = "picture", nullable = false)
    private byte[] picture;

    @OneToOne
    @JoinColumn(name = "user_id", unique = true)
    private User user;
}
