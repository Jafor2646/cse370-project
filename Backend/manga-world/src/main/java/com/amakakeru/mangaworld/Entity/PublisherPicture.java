package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "publisher_picture")
public class PublisherPicture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pp_id")
    private Long ppId;

    @Lob
    @Column(name = "pp_picture", nullable = false)
    private byte[] ppPicture;

    @OneToOne
    @JoinColumn(name = "p_id", nullable = false, unique = true)
    private Publisher publisher;
}
