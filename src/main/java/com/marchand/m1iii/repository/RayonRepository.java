package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Rayon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rayon", path = "rayons")
public interface RayonRepository extends CrudRepository<Rayon, Integer> {
}