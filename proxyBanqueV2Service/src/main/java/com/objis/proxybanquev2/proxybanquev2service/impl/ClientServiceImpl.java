/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.impl;

import com.objis.proxybanquev2.proxybanquev2dao.impl.ClientDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.inter.IClientDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import com.objis.proxybanquev2.proxybanquev2service.inter.IClientService;
import java.util.Collection;
import java.util.LinkedList;

/**
 * 
 * @author Abdel veno vedi vici
 */
public class ClientServiceImpl implements IClientService{

    IClientDao dao = new ClientDaoImpl();

    
      /**
     * Retourner la liste des clients d'un conseiller
     * @param conseillerId
     * @return LinkedList Client
     */
    @Override
    public LinkedList<Client> FindClientByConseiller(Long conseillerId) {
         return dao.FindClientByConseiller(conseillerId);    }

    @Override
    public Client findOne(Long idClient) {
       return dao.findOne(idClient);    }

    @Override
    public Boolean update(Client t) {
        return dao.update(t);
    }

  
    
    
    
    
    
}
