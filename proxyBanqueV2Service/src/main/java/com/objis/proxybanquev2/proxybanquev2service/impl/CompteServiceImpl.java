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
            
    @Override
    public LinkedList<Compte> FindCompteByClient(Long clientId) {
       return dao.FindCompteByClient(clientId);
    }

    
    @Override
    public Compte findOne(String pk) {
      return dao.findOne(pk);   }

    @Override
    public Boolean Update(Compte t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
