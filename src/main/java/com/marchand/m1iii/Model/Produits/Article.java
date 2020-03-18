package com.marchand.m1iii.Model;

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
    private int prix_unitaire;
}
