package com.marchand.m1iii.Model.Commande;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Commande {
    @Id
    private int Id;
}
