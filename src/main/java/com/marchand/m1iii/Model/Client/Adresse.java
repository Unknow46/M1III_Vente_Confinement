package com.marchand.m1iii.Model.Client;

import com.marchand.m1iii.Model.Commande.Ligne;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
public class Adresse {
    @Id
    private int Id;
    private String ligne_1;
    private String ligne_2;
    private String cp;
    private String ville;
    private String pays;

    @OneToOne
    private Personne personne;

    @OneToMany
    private Ligne ligne;

}
