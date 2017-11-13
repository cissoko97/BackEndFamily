package com.example.backendfamily.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Testimony")
public class Testimony {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idtestimony")
    private Long idtestimony;

    @Column(name = "label")
    private String label;

    @ManyToOne()
    private Participation participation;

}
