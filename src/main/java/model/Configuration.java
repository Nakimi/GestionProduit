package model;

import java.util.List;

public class Configuration {
    private int idConfigu;
    private Ordinateur ordinateur;
    private List<Accessoire> accessoires;

    // Constructeur
    public Configuration(int idConfigu, Ordinateur ordinateur, List<Accessoire> accessoires) {
        this.idConfigu = idConfigu;
        this.ordinateur = ordinateur;
        this.accessoires = accessoires;
    }

    // Getters
    public int getIdConfigu() {
        return idConfigu;
    }

    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public List<Accessoire> getAccessoires() {
        return accessoires;
    }

    // Setters
    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    public void setAccessoires(List<Accessoire> accessoires) {
        this.accessoires = accessoires;
    }

    // Méthode pour calculer le prix total de la configuration
    public float getPrixTotal() {
        float total = 0.0f;
        if (ordinateur != null) {
            total += ordinateur.prixProduit;
        }
        if (accessoires != null) {
            for (Accessoire acc : accessoires) {
                total += acc.prixProduit;
            }
        }
        return total;
    }

    // Affichage des détails de la configuration
    public String afficherDetails() {
        StringBuilder details = new StringBuilder("Configuration #" + idConfigu + "\n");
        details.append("Ordinateur : ").append(ordinateur.afficherDetails()).append("\n");
        if (accessoires != null && !accessoires.isEmpty()) {
            details.append("Accessoires :\n");
            for (Accessoire acc : accessoires) {
                details.append("  - ").append(acc.afficherDetails()).append("\n");
            }
        } else {
            details.append("Aucun accessoire.\n");
        }
        details.append("Prix total : ").append(getPrixTotal()).append(" €");
        return details.toString();
    }
}