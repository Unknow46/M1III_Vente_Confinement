package com.marchand.m1iii.Model.Produits;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Rayon {
    @Id
    private int Id;
    private String libelle;
}
