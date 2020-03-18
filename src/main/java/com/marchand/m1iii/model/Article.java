package com.marchand.m1iii.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Article {
    @Id
    private int id;
    private String libelle;
    private String couleur;
    private Float prix_unitaire;
    @OneToOne
    private Modele modele;
}
