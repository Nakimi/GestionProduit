package controller;

import model.*;
import view.ConsoleView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoutiqueController {
    private List<Client> clients = new ArrayList<>();
    private List<Produit> produits = new ArrayList<>();
    private List<Configuration> configurations = new ArrayList<>();
    private List<Commande> commandes = new ArrayList<>();

    private ConsoleView view = new ConsoleView();

    public void initialiserDonnees() {
        // Clients
        Client client1 = new Client(1, "Alice Dupont", "alice@example.com");
        clients.add(client1);

        // Ordinateur
        Ordinateur pc1 = new Ordinateur(1, "Dell XPS", 1299.99f, 5, "Dell", "XPS 13");

        // Accessoires
        Accessoire souris = new Accessoire(2, "Souris Logitech", 29.99f, 30, "Souris", List.of("Dell", "HP"));
        Accessoire casque = new Accessoire(3, "Casque JBL", 79.99f, 15, "Audio", List.of("Dell", "MacBook"));

        produits.add(pc1);
        produits.add(souris);
        produits.add(casque);

        // Configuration
        Configuration config1 = new Configuration(1, pc1, List.of(souris, casque));
        configurations.add(config1);

        // Commande : une config + un accessoire en plus
        Commande commande1 = new Commande(1, client1, List.of(config1), List.of());
        commandes.add(commande1);
    }

    public void afficherCatalogue() {
        view.afficherListeProduits(produits);
    }

    public void afficherClients() {
        view.afficherListeClients(clients);
    }

    public void afficherConfigurations() {
        view.afficherListeConfigurations(configurations);
    }

    public void afficherCommandes() {
        for (Commande commande : commandes) {
            view.afficherCommande(commande);
            System.out.println("-------------------------");
        }
    }
}