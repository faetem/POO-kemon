public class Main {
    public static void main(String[] args) {
        // Instanciation des Techniques
        Technique charge = new Technique("Charge", "Normal", 5);
        Technique ecrasface = new Technique("Écras'Face", "Normal", 20);
        Technique flammeche = new Technique("Flammèche", "Feu", 15);
        Technique eclair = new Technique("Éclair", "Électrik", 10);
        Technique vol = new Technique("Vol", "Vol", 10);
        Technique surf = new Technique("Surf", "Eau", 7);
        Technique trempette = new Technique("Trempette", "Normal", 1);

        // Instanciation des Pokémons
        Pokemon gruikui = new Pokemon("Gruikui", "Feu", 15, 3, new Technique[]{charge, flammeche});
        Pokemon pikachu = new Pokemon("Pikachu", "Électrik", 17, 5, new Technique[]{charge, eclair});
        Pokemon melofee = new Pokemon("Mélofée", "Fée", 25, 9, new Technique[]{charge, ecrasface});
        Pokemon roucool = new Pokemon("Roucool", "Vol", 12, 6, new Technique[]{charge, vol});
        Pokemon moustillon = new Pokemon("Moustillon", "Eau", 14, 5, new Technique[]{charge, surf});
        Pokemon magicarpe = new Pokemon("Magicarpe", "Eau", 5, 2, new Technique[]{trempette});

        // Instanciation Légendaires
        Legendaire zekrom = new Legendaire("Zekrom", "Dragon", 100, 100, new Technique[]{charge});
        Legendaire reshiram = new Legendaire("Reshiram", "Dragon", 100, 1, new Technique[]{}); // le niveau est initialisé à 100 dans le constructeur donc reshiram.niveau n'est pas 1 mais 100

        // Instanciation des Dresseurs
        Dresseur sacha = new Dresseur("Sacha");
        Dresseur ondine = new Dresseur("Ondine"); 
        
        // Tests
        // Méthoodes de Technique
        flammeche.afficherStats();
        trempette.afficherStats();


        // Méthodes de Pokemon et Legendaire
        gruikui.voirInfos();
        pikachu.voirInfos();
        zekrom.voirInfos();
        reshiram.voirInfos();
        
        gruikui.changerNom("Toto");
        gruikui.voirInfos();
        zekrom.changerNom("Drago");
        
        gruikui.attaquerPkmn(pikachu, charge);
        gruikui.attaquerPkmn(pikachu, flammeche);


        // Méthodes de Dresseur
        sacha.ajouterPkmn(pikachu);
        sacha.ajouterPkmn(melofee);
        ondine.ajouterPkmn(magicarpe);

        sacha.afficherEquipe(); 
        ondine.afficherEquipe();

        sacha.retirerPkmn(melofee); 
        sacha.afficherEquipe();

    }
}