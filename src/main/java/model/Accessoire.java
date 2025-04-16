package model;

import java.util.List;

public class Accessoire extends Produit {
    private String type;
    private List<String> compatibleAvec;

    // Constructeur
    public Accessoire(int idProduit, String nomProduit, float prixProduit, int stockProduit, String type, List<String> compatibleAvec) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.stockProduit = stockProduit;
        this.type = type;
        this.compatibleAvec = compatibleAvec;
    }

    // Getters
    public String getType() {
        return type;
    }

    public List<String> getCompatibleAvec() {
        return compatibleAvec;
    }

    // Setters
    public void setType(String type) {
        this.type = type;
    }

    public void setCompatibleAvec(List<String> compatibleAvec) {
        this.compatibleAvec = compatibleAvec;
    }

    // Méthode d'affichage des détails (implémentée depuis Produit via Affichable)
    @Override
    public String afficherDetails() {
        String compatibilites = compatibleAvec != null && !compatibleAvec.isEmpty()
                ? String.join(", ", compatibleAvec)
                : "Non spécifiées";
        return "Accessoire : " + nomProduit +
                " | Type : " + type +
                " | Prix : " + prixProduit + " €" +
                " | Stock : " + stockProduit +
                " | Compatibilité : " + compatibilites;
    }
}