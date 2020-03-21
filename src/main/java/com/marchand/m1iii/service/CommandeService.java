package com.marchand.m1iii.service;

import com.marchand.m1iii.model.Commande;
import com.marchand.m1iii.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class CommandeService implements ICommandeService {


    @Autowired
    CommandeRepository commandeRepository;


    private Commande reductionOnCommande(Commande commande){


        return commande;
    }

    private Commande reductionNbArticle(Commande commande){
        return commande;
    }


    private Commande reductionLieu(Commande commande){
        var addresse = commande.getAdresse().getCp();
        var emplacement = commande.getAdresse().getPays();
        var firstCpHautFrance = addresse.substring(0,2);
        List<String> region = List.of("59","02","60","62","80");
        var firstCpDomTom = addresse.substring(0,3);
        List<String> regionDomTom = List.of("971","972","973","974","976");


        if ("France".equals(emplacement)) {
            if (region.contains(firstCpHautFrance)) {
                commande.setMontant_frais((float) 5);
                return commande;
            }
            if (regionDomTom.contains(firstCpDomTom)) {
                commande.setMontant_frais((float) 15);
                return commande;
            } else {
                commande.setMontant_frais((float) 10);
                return commande;
            }
        }
        commande.setMontant_frais((float) 20);
        return commande;


    }

    @Override
    public Set<Commande> getCommande(Commande commande) {
        return null;
    }
}
