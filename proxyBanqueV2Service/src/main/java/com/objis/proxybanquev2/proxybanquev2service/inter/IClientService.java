/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.inter;

import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import java.util.LinkedList;
/**
 *
 * @author Abdel veno vedi vici
 */
public interface IClientService extends IService<Client,Long>{
     /**
      * Retourner la liste des clients d'un conseiller
      * @param conseillerId
      * @return   LinkedList Client
      */
    public LinkedList<Client> FindClientByConseiller(Long conseillerId );
 
}
