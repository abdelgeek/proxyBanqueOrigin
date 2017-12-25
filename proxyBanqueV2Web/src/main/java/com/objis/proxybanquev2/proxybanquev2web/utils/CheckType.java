/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2web.utils;

/**
 *
 * @author Abdel veno vedi vici
 */
public class CheckType {
    
    
    public static Boolean isLong(String s ){
     
        try{
            Long.parseLong(s);
            return true;
        }catch(NumberFormatException e){
            e.printStackTrace();
             return false;
        }
  
    }
    
    public static Boolean isInt(String s ){
       
        try{
            Integer.parseInt(s);
            return true;
        }catch(NumberFormatException e){
        //    e.printStackTrace();
            return false;
        }
        
    }
}
