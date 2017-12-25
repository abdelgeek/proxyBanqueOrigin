/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2domaine;

import java.util.Date;

/**
 * Classe Compte
 *
 * @version 1.0
 * @author Abdel veno vedi vici
 */
public class Compte {

    private Long idCompte;
    private String NumeroCompte;
    private Date dateOuverture;
    private Integer solde;
    private String typeCompte;
    private float decouvert;
    private Float taux;

    
    private Long idClient;

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public String getNumeroCompte() {
        return NumeroCompte;
    }

    public void setNumeroCompte(String NumeroCompte) {
        this.NumeroCompte = NumeroCompte;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Integer getSolde() {
        return solde;
    }

    public void setSolde(Integer solde) {
        this.solde = solde;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public float getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(float decouvert) {
        this.decouvert = decouvert;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }
    

    public Compte(Long idCompte, String NumeroCompte, Date dateOuverture, Integer solde, String typeCompte, Long idClient) {
        this.idCompte = idCompte;
        this.dateOuverture = dateOuverture;
        this.solde = solde;
        this.typeCompte = typeCompte;
        this.idClient = idClient;
        this.NumeroCompte = NumeroCompte;
    }

    public Compte() {
    }

    @Override
    public String toString() {
        return "Compte{" + "idCompte=" + idCompte + ", NumeroCompte=" + NumeroCompte + ", dateOuverture=" + dateOuverture + ", solde=" + solde + ", typeCompte=" + typeCompte + ", decouvert=" + decouvert + ", taux=" + taux + ", idClient=" + idClient + '}';
    }

}
