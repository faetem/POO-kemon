// import java.util.ArrayList;

public class Pokemon {
    String nom; 
    String type; 
    int pv;
    int niveau;
    // ArrayList<Technique> techniques; // utiliser arraylist ou juste une liste de types Techniques avec les techniques ?  mieux une liste comme ça on instancie directement avec l'obj Pokemon
    Technique[] techniques; 

    Pokemon(String nom, String type, int pv, int niveau, Technique[] techniques) {
        this.nom  = nom; 
        this.type = type; 
        this.pv = pv;
        this.niveau = niveau;
        // this.techniques = new ArrayList<>();
        this.techniques = techniques;
    }

    public void attaquerPkmn(Pokemon cible, Technique attaque) {

        // for (int i = 0; i < techniques.length; i++) {
        //     if (attaque != techniques[i]) {
        //         System.out.println(nom + " ne connaît pas cette attaque");
        //     } else {
        //         System.out.println(nom + " attaque normalement");
        //     }
        // }

        System.out.println(nom + " lance " + attaque.nom + "...");
        cible.pv -= attaque.puissance;
        System.out.println(cible.nom + " perd " + attaque.puissance + " PV !");

        if (cible.pv <= 0) { // on verifie que le Pokemon a toujours des PV
            cible.pv = pv; // on réinitialise les PV à 0 pour ne pas avoir de PV negatifs lorsqu'on check les infos du Pokemon cible après le combat 
            System.out.println(cible.nom + " est K.O !\n");
        } else {
            System.out.println("Il lui reste " + cible.pv + " PV\n");
        }
    }

    public void voirInfos() {
        System.out.println("Nom : " + nom);
        System.out.println("Type : " + type);
        System.out.println("Niveau " + niveau);
        System.out.println(pv + " PV");
        System.out.println("Attaques : ");
        for (int i = 0; i < techniques.length; i++) {
            System.out.println((i+1) + ". " + techniques[i].nom);
        }
        System.out.println("");
    }

    public void changerNom(String surnom) {
        System.out.println(nom  + " change de nom...");
        nom = surnom;
        System.out.println("Il s'appelle " + surnom + " maintenant !\n");
    }

}
