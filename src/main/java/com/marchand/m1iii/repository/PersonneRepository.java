package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Personne;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "personne", path = "personnes")
public interface PersonneRepository extends CrudRepository<Personne, Integer> {
}
