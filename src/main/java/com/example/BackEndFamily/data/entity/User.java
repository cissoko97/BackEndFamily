package com.example.backendfamily.data.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor

@AllArgsConstructor
@Data
@Table(name = "users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "iduser")
    private Long iduser;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String prenom;

    @Column(name = "bornof")
    private Date bornof;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "city")
    private String city;

    @Column(name = "phonenumber")
    private String phonenumber;

    @Column(name = "sexe")
    private Boolean sexe;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "isadmin")
    private Boolean isadmin;

    @Column(name = "image")
    private String image;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Participation> participations = new ArrayList<>();

}
