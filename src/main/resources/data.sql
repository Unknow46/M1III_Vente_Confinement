// j'ai un doute pour la valeur Ligne dans la table Commande
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais, ligne, personne, adresse) VALUES (1, '17/03/2020', 42, 12, 1, 3, 1);
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais, ligne, personne, adresse) VALUES (2, '13/03/2020', 36, 12, 2, 2, 3);
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais, ligne, personne, adresse) VALUES (3, '16/03/2020', 12, 5, 3, 1, 2);

INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (1, 'toto', 'titi', '02/03/1994');
INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (2, 'Tutu', 'Tyty', '02/05/1986');
INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (3, 'foo', 'bar', '05/11/1983');

INSERT INTO Rayon(Id, libelle) VALUES (1, 'vetements');
INSERT INTO Rayon(Id, libelle) VALUES (2, 'nourriture');
INSERT INTO Rayon(Id, libelle) VALUES (3, 'jeux-video');

INSERT INTO Modele(Id, libelle, taille, rayon) VALUES (1, 'pantalon', 'xl', 1);
INSERT INTO Modele(Id, libelle, taille, rayon) VALUES (2, 't-shirt', 'xl', 1);
INSERT INTO Modele(Id, libelle, taille, rayon) VALUES (3, 'chemise', 'xl', 1);

INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article) VALUES (1, 36, 420, 1);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article) VALUES (2, 36, 420, 2);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire, article) VALUES (3, 36, 420, 3);

INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele) VALUES (1, 'pantalon', 'vert', 34, 1);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele) VALUES (2, 'pantalon', 'rouge', 34, 1);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire, modele) VALUES (3, 'chemise', 'jaune', 34, 3);

INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays) VALUES (1, '41 rue du port', 'rizom', '59000', 'Lille', 'France');
INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays) VALUES (2, '60 Boulevard Vauban', 'hotal academique', '59800', 'Lille', 'France');
INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays) VALUES (3, '2 rue d Isly', ' ', '59000', 'Lille', 'France');
