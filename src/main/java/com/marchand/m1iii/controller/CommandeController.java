package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Article;
import com.marchand.m1iii.model.Commande;
import com.marchand.m1iii.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    CommandeRepository commandeRepository;

    @GetMapping()
    public Iterable<Commande>AfficheCommande(@RequestParam("idPersonne") int idPersonne){
        Iterable<Commande> listeCommande = commandeRepository.findCommandesByPersonne(idPersonne);
        return listeCommande;

    }
}
