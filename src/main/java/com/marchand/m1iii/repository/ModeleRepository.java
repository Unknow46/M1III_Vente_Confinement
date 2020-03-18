package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Modele;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

public interface ModeleRepository extends CrudRepository<Modele, Integer> {
    @Query("select m from Modele m inner join m.rayon r where r.Id= :rayonId")
    Set<Modele> findModeleByRayon(int rayonId);
}
