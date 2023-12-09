package com.amakakeru.mangaworld.Entity.IdClasses;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class AlreadyReadId implements Serializable {
    private Long userId;
    private Long mid;
}
