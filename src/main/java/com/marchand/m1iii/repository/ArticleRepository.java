package com.marchand.m1iii.repository;

import com.marchand.m1iii.model.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

public interface ArticleRepository extends CrudRepository<Article, Integer> {
    @Query("select a from Article a inner join a.modele m  where m.Id= :modeleId")
    Set<Article> findArticleByModele(int modeleId);
}
