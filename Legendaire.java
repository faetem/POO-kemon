public class Legendaire extends Pokemon {

    Legendaire(String nom, String type, int pv, int niveau, Technique[] techniques) {
        super(nom, type, pv, 100, techniques);
        
    }

    @Override
    public void changerNom(String surnom) {
        System.out.println("Impossible de changer le nom de " + this.nom + " car c'est un Pokémon légendaire\n");
    }
    
}
