import java.util.ArrayList; // on importe la librairie

public class Dresseur {
    String nom;
    ArrayList<Pokemon> equipe;

    Dresseur(String nom) {
        this.nom = nom;
        this.equipe = new ArrayList<>();
    }

    public void ajouterPkmn(Pokemon pokemon) {
        equipe.add(pokemon);
    }
    
    public void retirerPkmn(Pokemon pokemon) {
        equipe.remove(pokemon);
    }
    
    public void afficherEquipe() {
        System.out.println("Pokemons de " + this.nom + " :");
        for (Pokemon pokemon : equipe) {
            System.out.println(pokemon.nom);
        }
        System.out.println("");
    }
    
}
