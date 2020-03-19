package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Adresse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "adresse", path = "adresses")
public interface AdresseRepository extends CrudRepository<Adresse, Integer> {

}
