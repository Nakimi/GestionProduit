package view;

import model.*;

import java.util.List;

public class ConsoleView {

    public void afficherMessage(String message) {
        System.out.println(message);
    }

    public void afficherClient(Client client) {
        System.out.println(client.afficherDetails());
    }

    public void afficherListeClients(List<Client> clients) {
        System.out.println("=== Liste des clients ===");
        for (Client client : clients) {
            afficherClient(client);
        }
    }

    public void afficherProduit(Produit produit) {
        System.out.println(produit.afficherDetails());
    }

    public void afficherListeProduits(List<Produit> produits) {
        System.out.println("=== Catalogue des produits ===");
        for (Produit produit : produits) {
            afficherProduit(produit);
        }
    }

    public void afficherConfiguration(Configuration configuration) {
        System.out.println(configuration.afficherDetails());
    }

    public void afficherListeConfigurations(List<Configuration> configurations) {
        System.out.println("=== Configurations disponibles ===");
        for (Configuration config : configurations) {
            afficherConfiguration(config);
            System.out.println();
        }
    }

    public void afficherCommande(Commande commande) {
        System.out.println("=== Détails de la commande ===");
        System.out.println(commande.afficherDetails());

        // Affichage des configurations
        List<Configuration> configurations = commande.getConfigurations();
        if (configurations != null && !configurations.isEmpty()) {
            System.out.println("--- Configurations commandées ---");
            for (Configuration config : configurations) {
                afficherConfiguration(config);
                System.out.println();
            }
        }

        // Affichage des accessoires individuels
        List<Accessoire> accessoires = commande.getAccessoiresIndividuels();
        if (accessoires != null && !accessoires.isEmpty()) {
            System.out.println("--- Accessoires individuels ---");
            for (Accessoire acc : accessoires) {
                afficherProduit(acc); // Accessoire hérite de Produit
            }
        }

        System.out.println("=== Total commande : " + commande.getTotalCommande() + " € ===");
    }

}