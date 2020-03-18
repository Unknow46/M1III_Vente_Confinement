package com.marchand.m1iii.Model.Client;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Personne {
    @Id
    private int Id;
    private String nom;
    private String prenom;
    private String date_naissance;
}
