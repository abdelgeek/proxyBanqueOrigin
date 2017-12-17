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
public class Role {
    private Long idRole;
    private String libelle;

    public Long getIdRole() {
        return idRole;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Role() {
    }

    public Role(Long idRole, String libelle) {
        this.idRole = idRole;
        this.libelle = libelle;
    }
    
    

}
