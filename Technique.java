public class Technique {
    String nom;
    String type; 
    int puissance;

    Technique(String nom, String type, int puissance) {
        this.nom = nom;
        this.type = type;
        this.puissance = puissance;
    }

    public void afficherStats() {
        System.out.println("Nom de la technique : " + nom);
        System.out.println("Type : " + type);
        System.out.println("Dégâts infligés : " + puissance);
        System.out.println("\n");
    }
}
