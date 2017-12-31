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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @version 1.0
 * @author Abdel veno vedi vici
 */
public class ClientDaoImpl implements IClientDao {

   // query to get liste of client
    private String listSql = "Select client.idClient,client.nom,client.prenom,client.email,"
            + "client.adresse,client.idconseiller  from client,conseiller"
            + " where client.idconseiller = conseiller.idConseiller and pseudo=?"; 
    
    //query to get a client by it id
    private String findOneSql = "Select *  from client where idClient=? ";
    
    //query to update a client
    private String updateSql = "Update client set nom=?,prenom=?,email=?,adresse=? where idClient=? ";

    /**
     * 
     *
     * @param idConseiller
     * @return return list of the client of a advisor
     */
    @Override
    public LinkedList<Client> FindClientByConseiller(String pseudo) {
        LinkedList<Client> clients = new LinkedList<>();

        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(listSql);
            ps.setString(1, pseudo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Client client = new Client();
                client.setIdClient(rs.getLong("idClient"));
                client.setNom(rs.getString("nom"));
                client.setPrenom(rs.getString("prenom"));
                client.setEmail(rs.getString("email"));
                client.setAdresse(rs.getString("adresse"));
                client.setIdConseiller(rs.getLong("idconseiller"));

                clients.add(client);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clients;
    }

    
    /**
     * 
     * @param idClient
     * @return a client by it id
     */
    @Override
    public Client findOne(Long idClient) {
        Client client = new Client();
        try {
            PreparedStatement fps = ConnexionImpl.CreatePrepareStatement(findOneSql);
            fps.setLong(1, idClient);
            ResultSet rs = fps.executeQuery();

            if (rs.next()) {

                client.setIdClient(rs.getLong("idClient"));
                client.setNom(rs.getString("nom"));
                client.setPrenom(rs.getString("prenom"));
                client.setEmail(rs.getString("email"));
                client.setAdresse(rs.getString("adresse"));
                client.setIdConseiller(rs.getLong("idConseiller"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return client;
    }

    /**
     * update client
     * @param client
     * @return true if update client success
     */
    @Override
    public Boolean update(Client client) {

        int executeUpdate=0;
        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(updateSql);
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getEmail());
            ps.setString(4, client.getAdresse());
            ps.setLong(5, client.getIdClient());
            ps.executeUpdate();
          executeUpdate =ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
return executeUpdate>0;
    }
}