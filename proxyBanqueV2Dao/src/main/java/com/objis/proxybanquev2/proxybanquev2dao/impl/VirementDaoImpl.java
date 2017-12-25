/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.impl;

import com.objis.proxybanquev2.proxybanquev2dao.inter.IVirementDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Virement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdel veno vedi vici
 */
public class VirementDaoImpl implements IVirementDao {
 private String saveSql ="insert into virement(dateVirement,montant,idCompteDebiteur,idCompteCrediteur,idConseiller) values(?,?,?,?,?)";

    @Override
    public boolean save(Virement v) {
        int executeUpdate = -1;
     try {
         PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(saveSql);
         ps.setDate(1, v.getDateVirement());
         ps.setDouble(2,v.getMontant());
         ps.setLong(3,v.getIdCompteDebiteur());
         ps.setLong(4,v.getIdCompteCrediteur());
         ps.setLong(5,v.getIdConseiller());
         
         executeUpdate =ps.executeUpdate();
         
     } catch (SQLException ex) {
         Logger.getLogger(VirementDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        return executeUpdate>0;
    }
    
}
