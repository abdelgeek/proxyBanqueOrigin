/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2dto;

/**
 *
 * @author Abdel veno vedi vici
 */
public class Result {
    private boolean isValid;
    private String message;

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result() {
    }

    public Result(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }
    
    
}
