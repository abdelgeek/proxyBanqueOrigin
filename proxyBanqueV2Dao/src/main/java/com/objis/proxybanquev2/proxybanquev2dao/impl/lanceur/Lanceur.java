/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.impl.lanceur;

import com.objis.proxybanquev2.proxybanquev2dao.impl.ClientDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.impl.CompteDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.impl.ConnexionImpl;
import com.objis.proxybanquev2.proxybanquev2dao.inter.IClientDao;
import com.objis.proxybanquev2.proxybanquev2dao.inter.ICompteDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import com.objis.proxybanquev2.proxybanquev2domaine.Compte;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Lanceur {
    
    
    public static void main(String[] args){
               
         ICompteDao dao = new CompteDaoImpl() ;
         LinkedList<Compte> comptes = new LinkedList<>();
         
         comptes =   dao.FindCompteByClient(24L);
         Iterator<Compte> itcomptes = comptes.iterator();
         
         System.out.println("***Liste");
         while(itcomptes.hasNext()){
            Compte c = (Compte)itcomptes.next(); 
       System.out.println(c.getNumeroCompte());
    }
    }
}
