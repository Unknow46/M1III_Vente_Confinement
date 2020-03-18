package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Modele;
import com.marchand.m1iii.repository.ModeleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/modeles")
public class ModeleController {
    @Autowired
    ModeleRepository modeleRepository;

    @GetMapping()
    public Iterable<Modele> getModeleByRayon(@RequestParam("idRayon") int idRayon) {
        Iterable<Modele> modeles = modeleRepository.findModeleByRayon(idRayon);
        return modeles;
    }
}
