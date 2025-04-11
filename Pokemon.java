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
        // demander à l'user qu'elle technique ? mais non après faut un scanner 
        // dcp on laisse tomber les techniques ??? 
        // ou alors ça donne attaquer(Pokemon cible, Technique technique) *
        // yeahhh
        // faire une condition pour s'assurer que la technique est bien dans l'array 
        // si oui, executer le code suivant, sinon dire que le pkmn ne possede pas l'attaque !
        // verifier que la cible n'est pas KO
        cible.pv -= attaque.puissance;
        System.out.println(nom + " lance " + attaque.nom);
        System.out.println(cible.nom + " perd " + attaque.puissance + " PV !");
        System.out.println("Il lui reste " + cible.pv + " PV");
    }

    public void voirInfos() {
        // voir infos du pokemon
        System.out.println("Nom : " + nom);
        System.out.println("Type : " + type);
        System.out.println("Niveau " + niveau);
        System.out.println(pv + " PV");
        // faire une boucle pour afficher les techniques 
        // System.out.println(techniques[0].nom);
        System.out.println("\n");

    }

    public void changerNom(String surnom) {
        System.out.println(nom  + " change de nom...");
        nom = surnom;
        System.out.println("Il s'appelle " + surnom + " maintenant !\n");
    }

}
