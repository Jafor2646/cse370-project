package com.amakakeru.mangaworld.entity.IdClasses;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class FollowId implements Serializable {
    private Long userId;
    private Long aId;
}