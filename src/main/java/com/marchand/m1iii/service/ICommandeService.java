package com.marchand.m1iii.service;

import com.marchand.m1iii.model.Commande;

import java.util.Set;

public interface ICommandeService  {
    Set<Commande> getCommande(Commande commande);

}
