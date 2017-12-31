/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.impl;

import com.objis.proxybanquev2.proxybanquev2dao.inter.ICompteDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import com.objis.proxybanquev2.proxybanquev2domaine.Compte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Abdel veno vedi vici
 */
public class CompteDaoImpl implements ICompteDao {

    private String listSql = "Select *  from compte where idClient=? ";
     private String findOneSql = "Select *  from compte where numeroCompte=? ";
    private String updateSql = "update compte set solde =? where numeroCompte=? ";
    private String listNum = "select * from compte where numeroCompte like ? limit 5";

    /**
     * @param long
     * @return a client's accounts
     */
    @Override
    public LinkedList<Compte> FindCompteByClient(Long clientId) {
        LinkedList<Compte> comptes = new LinkedList<>();

        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(listSql);
            ps.setLong(1, clientId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compte compte = new Compte();
                compte.setIdCompte(rs.getLong("idCompte"));
                compte.setDateOuverture(rs.getDate("dateOuverture"));
                compte.setSolde(rs.getInt("solde"));
                compte.setTypeCompte(rs.getString("typeCompte"));
                compte.setIdClient(rs.getLong("idClient"));
                compte.setNumeroCompte(rs.getString("numeroCompte"));
                compte.setDecouvert(rs.getFloat("decouvert"));
                compte.setTaux(rs.getFloat("taux"));

                comptes.add(compte);
            }

        } catch (SQLException ex) {

        }

        return comptes;
    }

    /**
     * 
     * @param numeroCompte
     * @return an account by it number
     */
    @Override
    public Compte findOne(String numeroCompte) {
        Compte compte = new Compte();

        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(findOneSql);
            ps.setString(1, numeroCompte);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                compte.setIdCompte(rs.getLong("idCompte"));
                compte.setDateOuverture(rs.getDate("dateOuverture"));
                compte.setSolde(rs.getInt("solde"));
                compte.setTypeCompte(rs.getString("typeCompte"));
                compte.setIdClient(rs.getLong("idClient"));
                compte.setNumeroCompte(rs.getString("numeroCompte"));
                compte.setDecouvert(rs.getFloat("decouvert"));
                compte.setTaux(rs.getFloat("taux"));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return compte;
    }

    
    /**
     * update compte
     * @param compte
     * @return a boolean if update success
     */
    @Override
    public Boolean update(Compte compte) {
        int executeUpdate = 0;
        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(updateSql);
            ps.setDouble(1, compte.getSolde());
            ps.setString(2, compte.getNumeroCompte());

            executeUpdate = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return executeUpdate > 0;
    }
    
    /**
     * 
     * @param string
     * @returnr an account list based on a string of characters
     */
    @Override
    public LinkedList<String> FindNumCompte(String n) {
        LinkedList<String> numComptes = new LinkedList<>();

        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(listNum);
            ps.setString(1, n + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                numComptes.add(rs.getString("numeroCompte"));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return numComptes;
    }

}
