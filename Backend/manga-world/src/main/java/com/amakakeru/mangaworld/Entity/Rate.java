package com.amakakeru.mangaworld.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "rate")
public class Rate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private Long rId;

    @Column(name = "r_value", nullable = false, columnDefinition = "DECIMAL(2,1)")
    private BigDecimal rValue;

    @Column(name = "r_date", nullable = false)
    private java.sql.Timestamp rDate;

    @Column(name = "r_comment", length = 5120)
    private String rComment;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "m_id", nullable = false)
    private Long mId;

    @ManyToOne
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "m_id", insertable = false, updatable = false)
    private Manga manga;
}
