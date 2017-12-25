/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.lanceur;

import com.objis.proxybanquev2.proxybanquev2dao.impl.CompteDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.impl.VirementDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.inter.ICompteDao;
import com.objis.proxybanquev2.proxybanquev2dao.inter.IVirementDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Compte;
import com.objis.proxybanquev2.proxybanquev2domaine.Virement;
import com.objis.proxybanquev2.proxybanquev2dto.Result;
import com.objis.proxybanquev2.proxybanquev2dto.VirementDto;
import com.objis.proxybanquev2.proxybanquev2service.impl.CompteServiceImpl;
import com.objis.proxybanquev2.proxybanquev2service.impl.VirementServiceImpl;
import com.objis.proxybanquev2.proxybanquev2service.inter.ICompteService;
import com.objis.proxybanquev2.proxybanquev2service.inter.IVirementService;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Lanceur {

    public static void main(String[] args) {
        ICompteService cs = new CompteServiceImpl();
        
        LinkedList<String> n = new LinkedList<>();
        n = cs.FindNumCompte("p");
        
        for(String s : n){
            System.out.println(s);
        }
       
    }
}
