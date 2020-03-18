package com.marchand.m1iii.Model.Commande;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
@Data
@NoArgsConstructor
public class Ligne {
    @Id
    private int Id;

    @JoinColumn(name="id_commande")
    @JoinColumn(name="id_article")

    private int quantite;
    private float prix_facture_unitaire;
}
