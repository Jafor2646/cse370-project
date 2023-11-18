package com.amakakeru.mangaworld.entity.IdClasses;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class AlreadyReadId implements Serializable {
    private Long userId;
    private Long mId;
}
