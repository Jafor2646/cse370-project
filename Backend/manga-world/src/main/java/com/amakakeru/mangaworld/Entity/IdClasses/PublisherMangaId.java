package com.amakakeru.mangaworld.Entity.IdClasses;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class PublisherMangaId implements Serializable {
    private Long pId;
    private Long mId;
}
