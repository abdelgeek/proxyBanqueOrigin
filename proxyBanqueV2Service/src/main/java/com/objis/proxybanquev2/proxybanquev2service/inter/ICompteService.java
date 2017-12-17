/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.inter;

import com.objis.proxybanquev2.proxybanquev2domaine.Compte;
import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public interface ICompteService  extends IService<Compte, Long>{
    /**
     * 
     * @param clientId
     * @return  LinkedList Compte
     */
    public LinkedList<Compte> FindCompteByClient(Long clientId );
}
