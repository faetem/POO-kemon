public class Pokemon {
    String nom; // attribut
    String type; 
    int pv;
    int niveau;
    Technique[] techniques; 

    // constructeur
    Pokemon(String nom, String type, int pv, int niveau, Technique[] techniques) { 
        this.nom  = nom; 
        this.type = type; 
        this.pv = pv;
        this.niveau = niveau;
        this.techniques = techniques;
    }

    public void attaquerPkmn(Pokemon cible, Technique attaque) {

        System.out.println(this.nom + " lance " + attaque.nom + "...");
        cible.pv -= attaque.puissance;
        System.out.println(cible.nom + " perd " + attaque.puissance + " PV !");

        if (cible.pv <= 0) { // on vérifie que le Pokemon a toujours des PV
            cible.pv = pv; // on réinitialise les PV à 0 pour ne pas avoir de PV négatifs lorsqu'on check les infos du Pokemon cible après le combat 
            System.out.println(cible.nom + " est K.O !\n");
        } else {
            System.out.println("Il lui reste " + cible.pv + " PV\n");
        }
    }

    public void voirInfos() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Type : " + this.type);
        System.out.println("Niveau " + this.niveau);
        System.out.println(this.pv + " PV");
        if (techniques.length == 0) {
            System.out.println(this.nom + " ne connaît aucune technique pour l'instant !");
        } else {
            System.out.println("Attaques : ");
            for (int i = 0; i < techniques.length; i++) {
                System.out.println((i + 1) + ". " + techniques[i].nom);
            }
        }
        System.out.println("");
    }

    public void changerNom(String surnom) {
        System.out.println(this.nom  + " change de nom...");
        this.nom = surnom;
        System.out.println("Il s'appelle " + surnom + " maintenant !\n");
    }

}
