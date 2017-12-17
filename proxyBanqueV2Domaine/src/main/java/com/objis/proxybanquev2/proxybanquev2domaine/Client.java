/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2domaine;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Client {
   private Long idClient;
    private String nom;
    private String prenom;
    private String email;
    private String adresse;
    private Long idConseiller;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String contact) {
        this.adresse = contact;
    }

    public Long getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(Long idConseiller) {
        this.idConseiller = idConseiller;
    }

    public Client(Long idClient, String nom, String prenom, String email, String adresse, Long idConseiller) {
        this.idClient = idClient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.adresse = adresse;
        this.idConseiller = idConseiller;
    }

    public Client() {
    }
    
    
}
