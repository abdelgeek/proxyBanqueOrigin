/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp.BasicDataSource;

/**
 *
 * @author Abdel veno vedi vici
 */
public class ConnexionImpl {

    private static BasicDataSource bds = new BasicDataSource();

    private static Connection conn = null;

    private ConnexionImpl() {

    }

    /**
     * Creer la connexion avec la base de donnée
     * @return un objet Connection
     */
    public static Connection getConnexion() {

        if (conn == null) {
            try {

                bds.setDriverClassName("com.mysql.jdbc.Driver");
                bds.setUrl("jdbc:mysql://localhost:3306/proxyBanqueBd");
                bds.setUsername("root");
                bds.setPassword("");

                bds.setInitialSize(10); //nbre initial de connexion crees quand le pool est initialisé
                bds.setMaxIdle(2); //nbre max de connx qui peuvent rester inactif dans le pool sans etre détruites

                conn = bds.getConnection();
                System.out.println("*********** connexion reussie ***********");
                return conn;
            } catch (SQLException ex) {
                System.out.println("*********** erreur de connexion ********* : " + ex);
            }
        }
        return conn;
    }
}
