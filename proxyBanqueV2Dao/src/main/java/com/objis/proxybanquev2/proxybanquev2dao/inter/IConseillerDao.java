/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.inter;

import com.objis.proxybanquev2.proxybanquev2domaine.Conseiller;

/**
 *
 * @author Abdel veno vedi vici
 */
public interface IConseillerDao extends IDao<Conseiller,Long>{
    public Conseiller findByPseudo(String pseudo);
}
