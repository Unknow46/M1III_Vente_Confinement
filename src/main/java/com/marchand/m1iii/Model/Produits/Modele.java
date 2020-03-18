package com.marchand.m1iii.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor

public class Modele {
    @Id
    private int Id;
    private String libelle;
    private String
}
