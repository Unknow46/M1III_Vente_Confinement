package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Rayon;
import com.marchand.m1iii.repository.RayonRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path = "/rayons")
public class RayonController {
    @Autowired
    RayonRepository rayonRepository;

    @ApiOperation(value = "Récupère la liste des rayons")
    @GetMapping()
    public Iterable<Rayon> getListRayon() {
        Iterable<Rayon> rayons = rayonRepository.findAll();
        return rayons;
    }
}
