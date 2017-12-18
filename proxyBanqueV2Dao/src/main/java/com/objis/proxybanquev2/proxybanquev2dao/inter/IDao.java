/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dao.inter;

/**
 *
 * @author Abdel veno vedi vici
 */
public interface IDao<T,Pk>{
    
   public T findOne(Pk pk);
   
   public Boolean Update(T t);
}
