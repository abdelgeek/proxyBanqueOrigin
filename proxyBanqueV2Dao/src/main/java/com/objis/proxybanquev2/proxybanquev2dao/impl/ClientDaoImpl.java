/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.impl;

import com.objis.proxybanquev2.proxybanquev2dao.inter.IClientDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Abdel veno vedi vici
 */
public class ClientDaoImpl implements IClientDao {

    private String listSql = "Select *  from client where idConseiller=? ";;
    
    /**
     * Retourner la liste des clients d'un conseiller
     * @param idConseiller
     * @return Collection Client pour un conseiller donné
     */
    @Override
    public LinkedList<Client> FindClientByConseiller(Long idConseiller) {
        LinkedList<Client> clients = new LinkedList<>();
      

        try {
            PreparedStatement ps = ConnexionImpl.getConnexion().prepareStatement(listSql);
            ps.setLong(1, idConseiller);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Client client = new Client();
                client.setIdClient(rs.getLong("idClient"));
                client.setNom(rs.getString("nom"));
                client.setPrenom(rs.getString("prenom"));
                client.setEmail(rs.getString("email"));
                client.setAdresse(rs.getString("adresse"));
                client.setIdConseiller(rs.getLong("idConseiller"));
             
                clients.add(client);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clients;
    }

}
