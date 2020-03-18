package com.marchand.m1iii.Model.Client;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

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
}
