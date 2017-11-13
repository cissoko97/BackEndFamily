package com.example.backendfamily.data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmedia" , nullable = false)
    private Long idmedia;

    @Column
    @ElementCollection(targetClass=String.class)
    List<String> images = new ArrayList<>();

    @Column(name = "dateadd")
    private Date dateadd = new Date();

    @ManyToOne
    Camp camp;
}
