package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ArticleRepository extends CrudRepository<Article, Integer> {
    @Query("select a from Article a inner join a.modele m  where m.Id= :modeleId")
    Set<Article> findArticleByModele(int modeleId);

    @Query("select l.article from Commande c join c.ligne l where c.Id = :commandeId")
    Set<Article> findArticlesByCommande(int commandeId);

}

