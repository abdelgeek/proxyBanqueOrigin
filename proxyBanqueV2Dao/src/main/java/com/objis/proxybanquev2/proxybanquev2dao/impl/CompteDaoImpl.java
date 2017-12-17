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

    /**
     * Retourner la liste des compte d'un client
     *
     * @param clientId
     * @return LinkedList Compte
     */
    @Override
    public LinkedList<Compte> FindCompteByClient(Long clientId) {
        LinkedList<Compte> comptes = new LinkedList<>();

        try {
            PreparedStatement ps = ConnexionImpl.getConnexion().prepareStatement(listSql);
            ps.setLong(1, clientId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Compte compte = new Compte();
                compte.setIdCompte(rs.getLong("idCompte"));
                compte.setDateOuverture(rs.getDate("dateOuverture"));
                compte.setSolde(rs.getDouble("solde"));
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

}
