package com.amakakeru.mangaworld.Entity;

import com.amakakeru.mangaworld.Entity.IdClasses.FollowId;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@IdClass(FollowId.class)
@Table(name = "follow")
public class Follow implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long userId;

    @Id
    @Column(name = "a_id")
    private Long aId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "a_id", insertable = false, updatable = false)
    private Author author;
}
