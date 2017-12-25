/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dto;

import com.objis.proxybanquev2.proxybanquev2domaine.Compte;

/**
 *
 * @author Abdel veno vedi vici
 */
public class VirementDto {
    private String NumCompteDebiteur;
    private String NumCompteCrediteur;
    private Integer montant ;
    private Long idConseiller;

    public Long getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(Long idConseiller) {
        this.idConseiller = idConseiller;
    }

    public String getNumCompteDebiteur() {
        return NumCompteDebiteur;
    }

    public void setNumCompteDebiteur(String NumCompteDebiteur) {
        this.NumCompteDebiteur = NumCompteDebiteur;
    }

    public String getNumCompteCrediteur() {
        return NumCompteCrediteur;
    }

    public void setNumCompteCrediteur(String NumCompteCrediteur) {
        this.NumCompteCrediteur = NumCompteCrediteur;
    }
    
   

   

    public Integer getMontant() {
        return montant;
    }

    public void setMontant(Integer montant) {
        this.montant = montant;
    }

    public VirementDto() {
    }
    
    
}
