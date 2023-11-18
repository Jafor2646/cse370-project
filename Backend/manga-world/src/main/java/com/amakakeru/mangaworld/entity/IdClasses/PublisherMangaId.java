package com.amakakeru.mangaworld.entity.IdClasses;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class PublisherMangaId implements Serializable {
    private Long pId;
    private Long mId;
}
