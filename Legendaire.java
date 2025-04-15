public class Legendaire extends Pokemon {
    // String capaciteSpe;
    // private int niveau; // info cachée car Pokemon légendaire
    
    Legendaire(String nom, String type, int pv, int niveau, Technique[] techniques) {
        // constructeur
        super(nom, type, pv, 100, techniques);
        
    }

    /* @Override
    public void attaquerPkmn(Pokemon cible) {
        // attaquerPkmn sans techniques car attaquer seulement suffit à oneshot la cible
        System.out.println(cible.nom + "fait face au Légendaire " + nom + "...");
        cible.pv = 0;
        System.out.println(cible.nom + "a été mis K.O. en un coup !");
    } */
    
}
