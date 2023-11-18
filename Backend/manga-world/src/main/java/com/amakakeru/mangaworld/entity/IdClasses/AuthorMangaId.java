package com.amakakeru.mangaworld.entity.IdClasses;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
@Data
public class AuthorMangaId implements Serializable {
    private Long aId;
    private Long mId;
}
