package com.example.backendfamily.data.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idparticipation;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    Camp camp;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "iduser")
    @JsonIdentityReference(alwaysAsId = true)
    @ManyToOne
    User user;

    //@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idtestimony")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "iduser")
    @JsonIdentityReference(alwaysAsId = true)
    @OneToMany()
    List<Testimony> testimony = new ArrayList<>();

    public Participation(Long idparticipation, Camp camp, User user) {
        this.idparticipation = idparticipation;
        this.camp = camp;
        this.user = user;
    }
}
