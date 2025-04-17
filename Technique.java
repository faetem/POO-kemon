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
        System.out.println("Nom : " + this.nom);
        System.out.println("Type : " + this.type);
        System.out.println("Dégâts infligés : " + this.puissance + "\n");
    }
}
