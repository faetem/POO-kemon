# Présentation du projet Java - POO-kemon
## Introduction
Pour ce projet Java, on a décidé de créer un système inspiré de l’univers Pokémon qu’on a appelé POO-kemon (jeu de mot avec la Programmation Orientée Objet). 

Le but était de permettre à des dresseurs de composer leurs équipes de Pokémon chacun ayant ses propres caractéristiques et de simuler des combats entre eux.

Chaque Pokémon possède un nom, un type (feu, eau, etc.), des points de vie, un niveau, ainsi qu’un tableau de techniques avec une puissance et un type. Le joueur peut donc attaquer un autre Pokémon avec une technique spécifique. 

On a aussi une classe Legendaire qui hérite de la classe Pokemon. Ces Pokémon ont une particularité : leur nom ne peut pas être changé, ce qu’on a géré avec une redéfinition de la méthode changerNom().

Le projet respecte toutes les contraintes demandées :
Il contient 5 classes : `Main`, `Pokemon`, `Legendaire`, `Technique` et `Dresseur`.

## Objets du projet
On a instancié 17 objets au total :
* 2 dresseurs (sacha, ondine)
* 6 Pokémons classiques (gruikui, pikachu, melofee, roucool, moustillon, magicarpe)
* 2 Pokémons légendaires (zekrom, reshiram)
* 7 techniques (charge, flammeche, eclair, ecrasface, vol, surf, trempette)

## Héritage et polymorphisme
L’héritage est utilisé avec la classe `Legendaire` qui hérite de `Pokemon`, et on met bien en œuvre le polymorphisme avec la méthode `changerNom()` qui a un comportement différent dans la sous-classe.

L’annotation `@Override` est utilisée pour montrer clairement qu’on redéfinit une méthode existante de la classe parente. C’est utile pour éviter les erreurs et rendre le code plus lisible.

On utilise aussi les mots-clés `this` et `super` dans les constructeurs et méthodes, pour accéder aux attributs et méthodes de la classe actuelle ou parente.

## Composition
La composition est respectée : un `Dresseur` contient une équipe d’objets `Pokemon`, et chaque `Pokemon` contient un tableau d’objets `Technique`.

La méthode `attaquerPkmn(Pokemon cible, Technique attaque)` prend bien un objet en paramètre, comme demandé.

## Tests
Pour montrer que notre projet fonctionne, on a intégré plusieurs scénarios de test dans la classe Main : attaques, affichage des infos, changement de nom, utilisation des techniques, et gestion des équipes de dresseurs.

## Aller plus loin 
Dans le futur, nous aimerions implémenter les fonctionnalités suivantes : 
* Implémenter une condition dans `attaquerPkmn(Pokemon cible, Technique attaque)` qui vérifie que l'attaque que l'on souhaite utiliser est bien dans le tableau de techniques du Pokémon instancié 
* Affichage ASCII du Pokémon lorsqu'on utilise Pokemon.voirInfos()
* GUI avec Swing par exemple

On vous remercie pour votre temps, tout en espérant que le projet vous ait plu !

Pascal, Samuel, Faetem 
