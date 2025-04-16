package model;

public class Client {
    private int idClient;
    private String nomClient;
    private String emailClient;

    // Constructeur
    public Client(int idClient, String nomClient, String emailClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.emailClient = emailClient;
    }

    // Getters
    public int getIdClient() {
        return idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    // Setters
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    // Méthode d'affichage des informations client
    public String afficherDetails() {
        return "Client #" + idClient + " : " + nomClient + " (" + emailClient + ")";
    }
}