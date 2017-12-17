/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2domaine;

import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Conseiller {
   private Long idConseiller;
    private String pseudo;
    private String motdePasse;
    private String nom;
    private String prenom;
    private String contact;
    private Role role;   

    public Long getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(Long idConseiller) {
        this.idConseiller = idConseiller;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getMotdePasse() {
        return motdePasse;
    }

    public void setMotdePasse(String motdePasse) {
        this.motdePasse = motdePasse;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Conseiller(Long idConseiller, String pseudo, String motdePasse, String nom, String prenom, String contact,Role role) {
        this.idConseiller = idConseiller;
        this.pseudo = pseudo;
        this.motdePasse = motdePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.contact = contact;
         this.role = role;
    }

    public Conseiller() {
    }
    
    
}
