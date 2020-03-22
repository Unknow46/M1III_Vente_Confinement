package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Commande;
import com.marchand.m1iii.service.ICommandeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commandes")
public class CommandeController {

    @Autowired
    ICommandeService commandeService;

    @ApiOperation(value = "Récupère les commandes d'un client")
    @GetMapping()
    public Iterable<Commande>AfficheCommande(@RequestParam("idPersonne") int idPersonne){
        Iterable<Commande> listeCommande = commandeService.getCommandesByPersonne(idPersonne);
        return listeCommande;

    }
}
