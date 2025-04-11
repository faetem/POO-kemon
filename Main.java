public class Main {
    public static void main(String[] args) {
        // Techniques
        Technique charge = new Technique("Charge", "Normal", 5);
        Technique flammeche = new Technique("Flammeche", "Feu", 15);
        Technique eclair = new Technique("Eclair", "Electrique", 10);
        // Technique vol = new Technique("Vol", "Vol", 10);

        // Pokemons
        Pokemon gruikui = new Pokemon("Gruikui", "Feu", 15, 3, new Technique[]{flammeche, charge});
        Pokemon pikachu = new Pokemon("Pikachu", "Electrique", 17, 5, new Technique[]{eclair});
        // Pokemon melofee = new Pokemon("Mélofée", "Feerique", 25, 9);
        // Pokemon roucool = new Pokemon("Roucool", "Vol", 12, 6);
        // Legendaire zekrom = new Legendaire("Zekrom", "Legendaire", 1000, 100);

        // Dresseurs

        // Tests
        gruikui.voirInfos();
        gruikui.changerNom("Cochon");
        gruikui.voirInfos();

        // pikachu.voirInfos();

        // gruikui.attaquerPkmn(pikachu, charge);
    }
}