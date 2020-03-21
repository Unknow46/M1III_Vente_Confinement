package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Article;
import com.marchand.m1iii.model.Commande;
import com.marchand.m1iii.repository.CommandeRepository;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/commandes")
@RestController
public class CommandeController {

    @GetMapping()
    public Iterable<Commande>AfficheCommande(@RequestParam("idPersonne") int idPersonne){
        Iterable<Commande> listeCommande = CommandeRepository.findCommandeByAdresse_Personne(idPersonne);

        return listeCommande;

    }




}
