INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (1, 'toto', 'titi', '02/03/1994');
INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (2, 'Tutu', 'Tyty', '02/05/1986');
INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (3, 'foo', 'bar', '05/11/1983');

INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays, personne_id) VALUES (1, '41 rue du port', 'rizom', '59000', 'Lille', 'France', 1);
INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays, personne_id) VALUES (2, '60 Boulevard Vauban', 'hotal academique', '59800', 'Lille', 'France', 2);
INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays, personne_id) VALUES (3, '2 rue d Isly', ' ', '59000', 'Lille', 'France', 3);

INSERT INTO Rayon(Id, libelle) VALUES (1, 'vetements');
INSERT INTO Rayon(Id, libelle) VALUES (2, 'nourriture');
INSERT INTO Rayon(Id, libelle) VALUES (3, 'jeux-video');

INSERT INTO Modele(Id, libelle, taille, rayon_id) VALUES (1, 'pantalon', 'xl', 1);
INSERT INTO Modele(Id, libelle, taille, rayon_id) VALUES (2, 'chemise', 'xl', 1);
INSERT INTO Modele(Id, libelle, taille, rayon_id) VALUES (3, 't-shirt', 'xl', 2);
INSERT INTO Modele(Id, libelle, taille, rayon_id) VALUES (4, 'chemise', 'xl', 3);

INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele_id) VALUES (1, 'pantalon', 'vert', 34, 1);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele_id) VALUES (2, 'pantalon', 'rouge', 34, 1);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele_id) VALUES (3, 'pantalon', 'noir', 32, 2);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele_id) VALUES (4, 'chemise', 'jaune', 34, 3);


INSERT INTO Commande(Id, date_commande, prix_total, montant_frais, adresse_id) VALUES (1, '2020-01-01', 42, 12, 1);
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais, adresse_id) VALUES (2, '2020-01-01', 36, 12, 3);
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais, adresse_id) VALUES (3, '2020-01-01', 12, 5, 2);

INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article_id, id_commande) VALUES (1, 36, 420, 1, 1);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article_id, id_commande) VALUES (2, 36, 420, 2, 1);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article_id, id_commande) VALUES (3, 36, 420, 3, 2);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article_id, id_commande) VALUES (4, 36, 420, 3, 2);



