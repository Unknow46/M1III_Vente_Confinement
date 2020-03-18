package com.marchand.m1iii.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Commande {
    @Id
    private int Id;
    private Float prix_total;
    private Date date_commande;
    private Float montant_frais;

    @OneToMany
    @JoinColumn(name = "id_commande")
    private List<Ligne> ligne;
    @OneToOne
    private Personne personne;

    @OneToOne
    private Adresse adresse;
}
