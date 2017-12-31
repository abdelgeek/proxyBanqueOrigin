/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2service.impl;

import com.objis.proxybanquev2.proxybanquev2dao.impl.CompteDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.impl.ConseillerDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.impl.VirementDaoImpl;
import com.objis.proxybanquev2.proxybanquev2dao.inter.ICompteDao;
import com.objis.proxybanquev2.proxybanquev2dao.inter.IConseillerDao;
import com.objis.proxybanquev2.proxybanquev2dao.inter.IVirementDao;
import com.objis.proxybanquev2.proxybanquev2domaine.Compte;
import com.objis.proxybanquev2.proxybanquev2domaine.Conseiller;
import com.objis.proxybanquev2.proxybanquev2domaine.Virement;
import com.objis.proxybanquev2.proxybanquev2dto.VirementDto;
import com.objis.proxybanquev2.proxybanquev2dto.Result;
import com.objis.proxybanquev2.proxybanquev2service.inter.IVirementService;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * VirementServiceImpl implements IVirementService
 *
 * @author Abdel veno vedi vici
 */
public class VirementServiceImpl implements IVirementService {

    private IVirementDao virementDao = new VirementDaoImpl();
    private ICompteDao compteDao = new CompteDaoImpl();
    private IConseillerDao conseillerDao = new ConseillerDaoImpl();

    /**
     *
     * @param VirementDto
     * @return
     */
    @Override
    public Result save(VirementDto v) {
        Conseiller c = new Conseiller();
        Result r = new Result();
        r.setMessage("IMPOSSIBLE D'EFFECTUER LE VIREMENT");
        r.setIsValid(false);

        Integer montant = v.getMontant();

        c = conseillerDao.findByPseudo(v.getPseudoConseiller());
        
        Compte compteCrediteur = new Compte();
        Compte compteDebiteur = new Compte();

        compteCrediteur = compteDao.findOne(v.getNumCompteCrediteur());
        compteDebiteur = compteDao.findOne(v.getNumCompteDebiteur());

        if (montant > compteDebiteur.getSolde()) { //verifie si le montant a transferer est superieur au solde debiteur
            r.setMessage("IMPOSSIBLE D'EFFECTUER LE VIREMENT : LE SOLDE"
                    + " DU COMPTE " + compteDebiteur.getNumeroCompte() + " est inferieur à " + montant);
        } else {

            // debite le compte
            compteDebiteur.setSolde(compteDebiteur.getSolde() - montant);
            compteDao.update(compteDebiteur);

            //credite compte
            compteCrediteur.setSolde(compteCrediteur.getSolde() + montant);
            compteDao.update(compteCrediteur);
            
            Virement virement = new Virement();

            virement.setIdCompteCrediteur(compteCrediteur.getIdClient());
            virement.setIdCompteDebiteur(compteCrediteur.getIdClient());
            virement.setMontant(montant);
             virement.setIdConseiller(c.getIdConseiller());

            virement.setDateVirement(Date.valueOf(LocalDate.now()));

            // virement.setIdConseiller(conseillerDao.findByPseudo(v));
            r.setIsValid(virementDao.save(virement));
            if (r.isIsValid()) {
                r.setMessage("Virement effectué avec succes");
            }
        }
        System.out.println(r.getMessage());

        return r;
    }

}
