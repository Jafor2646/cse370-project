package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;


@Data
@Entity
@Table(name = "volume_cover")
public class VolumeCover implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vc_id")
    private Long vcId;

    @Lob
    @Column(name = "vc_picture", nullable = false)
    private byte[] vcPicture;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "v_id", nullable = false, unique = true)
    private Volume volume;
}
