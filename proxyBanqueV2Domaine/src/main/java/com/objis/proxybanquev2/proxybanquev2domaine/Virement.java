/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2domaine;

import java.util.Date;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Virement {
    private Long idVirement;
    private String numeroVirement;
    private Date dateVirement;
    private Double montant;
    private Compte idCompteDebiteur;
    private Compte idCompteCrediteur;
    private Long idConseiller;

    public Long getIdVirement() {
        return idVirement;
    }

    public void setIdVirement(Long idVirement) {
        this.idVirement = idVirement;
    }

    public String getNumeroVirement() {
        return numeroVirement;
    }

    public void setNumeroVirement(String numeroVirement) {
        this.numeroVirement = numeroVirement;
    }

    public Date getDateVirement() {
        return dateVirement;
    }

    public void setDateVirement(Date dateVirement) {
        this.dateVirement = dateVirement;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Compte getIdCompteDebiteur() {
        return idCompteDebiteur;
    }

    public void setIdCompteDebiteur(Compte idCompteDebiteur) {
        this.idCompteDebiteur = idCompteDebiteur;
    }

    public Compte getIdCompteCrediteur() {
        return idCompteCrediteur;
    }

    public void setIdCompteCrediteur(Compte idCompteCrediteur) {
        this.idCompteCrediteur = idCompteCrediteur;
    }

    public Long getConseiller() {
        return idConseiller;
    }

    public void setConseiller(Long conseiller) {
        this.idConseiller = conseiller;
    }

    public Virement() {
    }
    
    
}
