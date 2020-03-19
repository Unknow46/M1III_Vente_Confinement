package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Modele;
import com.marchand.m1iii.model.Personne;
import com.marchand.m1iii.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(path = "/personnes")
public class PersonneController {

    @Autowired
    PersonneRepository PersonneRepository;

    @GetMapping("/clients")
    public Set<Personne> getPersonne(@RequestParam("idPersonne") int Id) {
        Set<Personne> personne = PersonneRepository.findPersonneById(Id);
        return personne;
    }

    @PostMapping
    public void addPersonne(@RequestBody Personne newclient){
        PersonneRepository.save(newclient);

    }




}
