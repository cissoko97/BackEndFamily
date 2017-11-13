package com.example.backendfamily.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "camps")
@EqualsAndHashCode
public class Camp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcamp")
    private Long id;

    @Column(name = "article")
    private String article;

    @Column(name = "image")
    private String image;

    @Column(name = "agemin")
    private int agemin;

    @Column(name = "agemax")
    private int agemax;

    @Column(name = "datebegin")
    private Date datebagin;

    @Column(name = "dateend")
    private Date dateend;

    @OneToMany(mappedBy = "camp", fetch = FetchType.LAZY)
    private List<Participation> participations = new ArrayList<>();

    @OneToMany(mappedBy = "camp", fetch = FetchType.LAZY)
    private List<Media> medias = new ArrayList<>();

}