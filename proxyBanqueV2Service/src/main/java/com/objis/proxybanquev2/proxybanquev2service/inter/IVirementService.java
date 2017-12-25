/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.inter;

import com.objis.proxybanquev2.proxybanquev2domaine.Virement;
import com.objis.proxybanquev2.proxybanquev2dto.Result;
import com.objis.proxybanquev2.proxybanquev2dto.VirementDto;

/**
 *
 * @author Abdel veno vedi vici
 */
public interface IVirementService {
     public Result save(VirementDto v); 
}
