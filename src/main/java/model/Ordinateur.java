package model;

public class Ordinateur extends Produit {
    private String marque;
    private String modele;

    // Constructeur
    public Ordinateur(int idProduit, String nomProduit, float prixProduit, int stockProduit, String marque, String modele) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.stockProduit = stockProduit;
        this.marque = marque;
        this.modele = modele;
    }

    // Getters
    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    // Setters
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    // Méthode d'affichage des détails (hérite d’Affichable via Produit)
    @Override
    public String afficherDetails() {
        return "Ordinateur : " + nomProduit +
                " | Marque : " + marque +
                " | Modèle : " + modele +
                " | Prix : " + prixProduit + " €" +
                " | Stock : " + stockProduit;
    }
}