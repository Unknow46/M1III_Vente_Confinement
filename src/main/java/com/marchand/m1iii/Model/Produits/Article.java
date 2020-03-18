package com.marchand.m1iii.Model.Produits;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

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
}
