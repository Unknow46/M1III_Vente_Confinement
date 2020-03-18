
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais) VALUES (1, '17/03/2020', 42, 12);
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais) VALUES (2, '13/03/2020', 36, 12);
INSERT INTO Commande(Id, date_commande, prix_total, montant_frais) VALUES (3, '16/03/2020', 12, 5);

INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (1, 'toto', 'titi', '02/03/1994');
INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (2, 'Tutu', 'Tyty', '02/05/1986');
INSERT INTO Personne(Id, nom, prenom, date_naissance) VALUES (3, 'foo', 'bar', '05/11/1983');

INSERT INTO Rayon(Id, libelle) VALUES (1, 'vetements');
INSERT INTO Rayon(Id, libelle) VALUES (2, 'nourriture');
INSERT INTO Rayon(Id, libelle) VALUES (3, 'jeux-video');

INSERT INTO Modele(Id, libelle, taille) VALUES (1, 'pantalon', 'xl');
INSERT INTO Modele(Id, libelle, taille) VALUES (2, 't-shirt', 'xl');
INSERT INTO Modele(Id, libelle, taille) VALUES (3, 'chemise', 'xl');

INSERT INTO Ligne(Id, quantite, prix_facture_unitaire) VALUES (1, 36, 420);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire) VALUES (2, 36, 420);
INSERT INTO Ligne(Id, quantite, prix_facture_unitaire) VALUES (3, 36, 420);

INSERT INTO Article(Id, libelle, couleur, prix_unitaire) VALUES (1, 'pantalon', 'vert', 34);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire) VALUES (2, 'pantalon', 'rouge', 34);
INSERT INTO Article(Id, libelle, couleur, prix_unitaire) VALUES (3, 'pantalon', 'jeune', 34);

INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays) VALUES (1, '41 rue du port', 'rizom', '59000', 'Lille', 'France');
INSERT INTO Adresse(Id, ligne_1, ligne_2, cp, ville, pays) VALUES (1, '60 Boulevard Vauban', 'hotal academique', '59800', 'Lille', 'France');
