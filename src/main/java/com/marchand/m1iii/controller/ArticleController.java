package com.marchand.m1iii.controller;

import com.marchand.m1iii.model.Article;
import com.marchand.m1iii.repository.ArticleRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/articles")
public class ArticleController {

    @Autowired
    ArticleRepository articleRepository;

    @ApiOperation(value = "Récupère les articles d'un modèle")
    @GetMapping()
    public Iterable<Article> getArticleByModele(@RequestParam("idModele") int idModele) {
        Iterable<Article> articles = articleRepository.findArticleByModele(idModele);
        return articles;
    }

    @ApiOperation(value = "Récupère les articles d'une commande")
    @GetMapping("/commande")
    public Iterable<Article> getArticleByCommande(@RequestParam("idCommande") int idCommande) {
        Iterable<Article> articles = articleRepository.findArticlesByCommande(idCommande);
        return articles;
    }
}
