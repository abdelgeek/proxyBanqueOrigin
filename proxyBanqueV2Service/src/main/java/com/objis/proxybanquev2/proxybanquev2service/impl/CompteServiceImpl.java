/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.impl;

import com.objis.proxybanquev2.proxybanquev2dao.impl.CompteDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.inter.ICompteDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Compte;
import com.objis.proxybanquev2.proxybanquev2service.inter.ICompteService;
import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public class CompteServiceImpl implements ICompteService{

    private ICompteDao dao = new CompteDaoImpl();
     
    /**
     * Cette methode permet de trouver les comptes d'un client  grace à son id
     * @param client Id
     * @return une liste de compte
     */
    @Override
    public LinkedList<Compte> FindCompteByClient(Long clientId) {
       return dao.FindCompteByClient(clientId);
    }

    /**
     * Cette methode permet de trouver un compte grace qu numero de compte
     * @param numero de  Compte
     * @return un compte
     */
    @Override
    public Compte findOne(String numeroCompte) {
      return dao.findOne(numeroCompte);   }

    
    /**
     * Cette methode permet de mettre a jour un compte
     * @param compte
     * @return boolean
     */
    @Override
    public Boolean update(Compte compte) {
       return dao.update(compte);
    }

    
    @Override
    public LinkedList<String> FindNumCompte(String numCompte) {
    return dao.FindNumCompte(numCompte);
    }
    
}
