package model;

import model.interfaces.Affichable;

public abstract class Produit implements Affichable {
    protected int idProduit;
    protected String nomProduit;
    protected float prixProduit;
    protected int stockProduit;

    // Getters
    public int getIdProduit() {
        return idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public float getPrixProduit() {
        return prixProduit;
    }

    public int getStockProduit() {
        return stockProduit;
    }

    // Setters
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public void setPrixProduit(float prixProduit) {
        this.prixProduit = prixProduit;
    }

    public void setStockProduit(int stockProduit) {
        this.stockProduit = stockProduit;
    }

    // Méthode à implémenter dans les sous-classes
    @Override
    public abstract String afficherDetails();
}