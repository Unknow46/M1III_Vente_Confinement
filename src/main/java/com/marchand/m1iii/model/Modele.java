package com.marchand.m1iii.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor

public class Modele {
    @Id
    private int Id;
    private String libelle;
    private String taille;
    @OneToOne
    private Rayon rayon;

}
