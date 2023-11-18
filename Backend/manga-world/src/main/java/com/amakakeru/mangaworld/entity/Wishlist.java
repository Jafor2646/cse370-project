package com.amakakeru.mangaworld.entity;

import com.amakakeru.mangaworld.entity.IdClasses.WishlistId;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@IdClass(WishlistId.class)
@Table(name = "wishlist")
public class Wishlist implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "m_id")
    private Long mId;

    @Column(name = "added_date", nullable = false)
    private java.sql.Timestamp addedDate;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "m_id", insertable = false, updatable = false)
    private Manga manga;
}
