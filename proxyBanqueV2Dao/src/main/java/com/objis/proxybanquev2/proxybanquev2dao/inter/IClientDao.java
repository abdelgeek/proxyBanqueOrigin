/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.inter;


import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public interface IClientDao extends IDao<Client,Long> {
    
    /**
     * 
     * @param conseillerId
     * @return LinkedList Client
     */
    public LinkedList<Client> FindClientByConseiller(Long conseillerId );
    
    
    
    
}
