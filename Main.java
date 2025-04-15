public class Main {
    public static void main(String[] args) {
        // Techniques
        Technique charge = new Technique("Charge", "Normal", 5);
        Technique ecrasface = new Technique("Écras'Face", "Normal", 20);
        Technique flammeche = new Technique("Flammeche", "Feu", 15);
        Technique eclair = new Technique("Eclair", "Electrique", 10);
        Technique vol = new Technique("Vol", "Vol", 10);
        Technique surf = new Technique("Surf", "Eau", 7);
        Technique trempette = new Technique("Trempette", "Normal", 1);

        // Pokemons
        Pokemon gruikui = new Pokemon("Gruikui", "Feu", 15, 3, new Technique[]{charge, flammeche});
        Pokemon pikachu = new Pokemon("Pikachu", "Électrik", 17, 5, new Technique[]{charge, eclair});
        Pokemon melofee = new Pokemon("Mélofée", "Fée", 25, 9, new Technique[]{charge, ecrasface});
        Pokemon roucool = new Pokemon("Roucool", "Vol", 12, 6, new Technique[]{charge, vol});
        Pokemon moustillon = new Pokemon("Moustillon", "Eau", 14, 5, new Technique[]{charge, surf});
        Pokemon magicarpe = new Pokemon("Magicarpe", "Eau", 5, 2, new Technique[]{trempette})

        // Legendaires
        Legendaire zekrom = new Legendaire("Zekrom", "Dragon", 100, 100, new Technique[]{charge});
        Legendaire reshiram = new Legendaire("Reshiram", "Dragon", 100, 1, new Technique[]{});

        // Dresseurs
        /* Dresseur sacha = new Dresseur("Sacha");
        Dresseur ondine = new Dresseur("Ondine");

        sacha.ajouterPkmn(pikachu);
        sacha.ajouterPkmn(melofee);
        ondine.ajouterPkmn(magicarpe);

        sacha.afficherEquipe(); 
        sacha.ajouterPkmn(gruikui);
        sacha.ajouterPkmn(melofee);
        sacha.afficherEquipe();
        sacha.retirerPkmn(moustillon);

        ondine.afficherEquipe()
        sacha.afficherEquipe(); */ 

        // Tests
        /* gruikui.voirInfos();
        pikachu.voirInfos();
        melofee.voirInfos();
        roucool.voirInfos(); */
        zekrom.voirInfos();
        reshiram.voirInfos();

        gruikui.changerNom("Mignon");
        gruikui.voirInfos();

        zekrom.changerNom("Drago");

        // flammeche.afficherStats();

        // gruikui.attaquerPkmn(pikachu, charge);
        // gruikui.attaquerPkmn(gruikui, charge);
        // gruikui.attaquerPkmn(pikachu, flammeche);

        // gruikui.attaquerPkmn(roucool, vol);
        zekrom.attaquerPkmn(gruikui, charge);
    }
}