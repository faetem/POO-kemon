import java.util.ArrayList;

public class Pokemon {
    String nom; 
    String type; 
    int pointsDeVie;
    ArrayList<Pokemon> equipe; 

    Pokemon(String nom, String type, int pointsDeVie) {
        this.nom  = nom; 
        this.type = type; 
        this.pointsDeVie = pointsDeVie;
        this.equipe = new ArrayList<>();
    }
}
