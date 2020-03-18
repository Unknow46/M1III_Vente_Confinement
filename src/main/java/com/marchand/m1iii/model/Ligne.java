package com.marchand.m1iii.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Ligne {
    @Id
    private int Id;
    private int quantite;
    private float prix_facture_unitaire;

    @OneToOne
    private Article article;
}
