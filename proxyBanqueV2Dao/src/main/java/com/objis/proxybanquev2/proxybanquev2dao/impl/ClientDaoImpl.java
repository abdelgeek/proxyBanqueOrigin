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
 *
 * @author Abdel veno vedi vici
 */
public class ClientDaoImpl implements IClientDao {

    private String listSql = "Select *  from client where idConseiller=? ";
    private String findOneSql = "Select *  from client where idClient=? ";
    private String updateSql = "Update client set nom=?,prenom=?,email=?,adresse=? where idClient=? ";

    /**
     * Retourner la liste des clients d'un conseiller
     *
     * @param idConseiller
     * @return Collection Client pour un conseiller donné
     */
    @Override
    public LinkedList<Client> FindClientByConseiller(Long idConseiller) {
        LinkedList<Client> clients = new LinkedList<>();

        try {
            PreparedStatement ps = ConnexionImpl.CreatePrepareStatement(listSql);
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
        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return clients;
    }

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