import controller.BoutiqueController;

public class Main {
    public static void main(String[] args) {
        BoutiqueController controller = new BoutiqueController();

        // Initialisation des données (démonstration)
        controller.initialiserDonnees();

        // Affichage des données en console
        System.out.println("\n--- LISTE DES CLIENTS ---");
        controller.afficherClients();

        System.out.println("\n--- CATALOGUE PRODUITS ---");
        controller.afficherCatalogue();

        System.out.println("\n--- CONFIGURATIONS DISPONIBLES ---");
        controller.afficherConfigurations();

        System.out.println("\n--- COMMANDES ENREGISTRÉES ---");
        controller.afficherCommandes();
    }
}