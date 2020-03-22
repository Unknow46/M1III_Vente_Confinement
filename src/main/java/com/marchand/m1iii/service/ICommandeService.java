package com.marchand.m1iii.service;

import com.marchand.m1iii.model.Commande;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public interface ICommandeService{
    Set<Commande> getCommandesByPersonne(int personneId);

}
