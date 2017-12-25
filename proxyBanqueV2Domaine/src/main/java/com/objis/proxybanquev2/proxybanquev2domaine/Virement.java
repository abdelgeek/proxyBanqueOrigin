/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2domaine;

import java.sql.Date;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Virement {
    private Long idVirement;
    private Date dateVirement;
    private Integer montant;
    private Long idCompteDebiteur;
    private Long idCompteCrediteur;
    private Long idConseiller;

    public Long getIdVirement() {
        return idVirement;
    }

    public void setIdVirement(Long idVirement) {
        this.idVirement = idVirement;
    }

    public Date getDateVirement() {
        return dateVirement;
    }

    public void setDateVirement(Date dateVirement) {
        this.dateVirement = dateVirement;
    }

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public Long getIdCompteDebiteur() {
        return idCompteDebiteur;
    }

    public void setIdCompteDebiteur(Long idCompteDebiteur) {
        this.idCompteDebiteur = idCompteDebiteur;
    }

    public Long getIdCompteCrediteur() {
        return idCompteCrediteur;
    }

    public void setIdCompteCrediteur(Long idCompteCrediteur) {
        this.idCompteCrediteur = idCompteCrediteur;
    }

    public Long getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(Long idConseiller) {
        this.idConseiller = idConseiller;
    }

    public Virement() {
    }
    
    
}
