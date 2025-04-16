package model;

import java.util.List;

public class Commande {
    private int idCommande;
    private float totalCommande;
    private Client client;
    private List<Configuration> configurations;
    private List<Accessoire> accessoiresIndividuels;

    // Constructeur
    public Commande(int idCommande, Client client, List<Configuration> configurations, List<Accessoire> accessoiresIndividuels) {
        this.idCommande = idCommande;
        this.client = client;
        this.configurations = configurations;
        this.accessoiresIndividuels = accessoiresIndividuels;
        this.totalCommande = calculerTotal();
    }

    // Getters
    public int getIdCommande() {
        return idCommande;
    }

    public float getTotalCommande() {
        return totalCommande;
    }

    public Client getClient() {
        return client;
    }

    public List<Configuration> getConfigurations() {
        return configurations;
    }

    public List<Accessoire> getAccessoiresIndividuels() {
        return accessoiresIndividuels;
    }

    // Setters
    public void setConfigurations(List<Configuration> configurations) {
        this.configurations = configurations;
        this.totalCommande = calculerTotal(); // Recalcul du total
    }

    public void setAccessoiresIndividuels(List<Accessoire> accessoiresIndividuels) {
        this.accessoiresIndividuels = accessoiresIndividuels;
        this.totalCommande = calculerTotal(); // Recalcul du total
    }

    // Méthode pour calculer le total de la commande
    private float calculerTotal() {
        float total = 0.0f;
        if (configurations != null) {
            for (Configuration config : configurations) {
                total += config.getPrixTotal();
            }
        }
        if (accessoiresIndividuels != null) {
            for (Accessoire acc : accessoiresIndividuels) {
                total += acc.prixProduit;
            }
        }
        return total;
    }

    // Affichage des détails de la commande
    public String afficherDetails() {
        return "Commande #" + idCommande + " | Client : " + client.getNomClient() +
                " | Total : " + totalCommande + "€";
    }
}