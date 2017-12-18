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
        boolean isLong =false;
        try{
            Long.parseLong(s);
            isLong = true;
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        return isLong;
    }
}
