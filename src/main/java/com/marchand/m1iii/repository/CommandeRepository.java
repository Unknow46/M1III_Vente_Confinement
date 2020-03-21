package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Commande;
import com.marchand.m1iii.model.Adresse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface CommandeRepository extends CrudRepository<Commande, Integer> {
    @Query("select c from Commande c inner join Adresse a on a.Id = c.adresse.Id  inner join Personne p on p.Id= a.personne.Id where p.Id =: personneId")
    static Set<Commande>findCommandeByAdresse_Personne(int personneId);
}
