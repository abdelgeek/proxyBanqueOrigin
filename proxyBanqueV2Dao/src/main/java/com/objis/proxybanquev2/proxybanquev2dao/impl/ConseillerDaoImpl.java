/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.impl;

import com.objis.proxybanquev2.proxybanquev2dao.inter.IConseillerDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Conseiller;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Abdel veno vedi vici
 */
public class ConseillerDaoImpl implements IConseillerDao{

    private String findByPseudoSql ="select * from conseiller where pseudo =?";
    
    /**
     * 
     * @param pseudo
     * @return a advisor by it pseudo
     */
    @Override
    public Conseiller findByPseudo(String pseudo) {
        Conseiller c = new Conseiller();
        
        try{
            PreparedStatement ps =  ConnexionImpl.CreatePrepareStatement(findByPseudoSql);
            ps.setString(1, pseudo);
            ResultSet  rs =    ps.executeQuery();
            while(rs.next()){
                c.setContact(rs.getString("contact"));
                c.setIdConseiller(rs.getLong("idconseiller"));
                c.setMotdePasse(rs.getString("motdepasse"));
                c.setNom(rs.getString("nom"));
                c.setPrenom(rs.getString("prenom"));
             
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return c;
        
    }

    /**
     * 
     * @param long
     * @return an advisor by it id
     */
    @Override
    public Conseiller findOne(Long pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param conseiller
     * @return true if update is success
     */
    @Override
    public Boolean update(Conseiller t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
