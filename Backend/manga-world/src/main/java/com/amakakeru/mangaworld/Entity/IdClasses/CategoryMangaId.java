package com.amakakeru.mangaworld.Entity.IdClasses;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class CategoryMangaId implements Serializable {
    private Long cId;
    private Long mId;
}
