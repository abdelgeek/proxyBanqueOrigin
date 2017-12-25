/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2web.controleur;

import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import com.objis.proxybanquev2.proxybanquev2dto.Result;
import com.objis.proxybanquev2.proxybanquev2dto.VirementDto;
import com.objis.proxybanquev2.proxybanquev2service.impl.ClientServiceImpl;
import com.objis.proxybanquev2.proxybanquev2service.impl.VirementServiceImpl;
import com.objis.proxybanquev2.proxybanquev2service.inter.IClientService;
import com.objis.proxybanquev2.proxybanquev2service.inter.IVirementService;
import com.objis.proxybanquev2.proxybanquev2web.utils.CheckType;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abdel veno vedi vici
 */
@WebServlet(name = "faireVirement", urlPatterns = {"/faireVirement"})
public class faireVirement extends HttpServlet {
private IVirementService service = new VirementServiceImpl();


    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet editerClient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet editerClient at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      Result result = new Result(false, "IMPOSSIBLE D'EFFECTUER LE VIREMENT");
       
        String montant = request.getParameter("montant");
        String numDebiteur = request.getParameter("numDebiteur");
        String numCrediteur = request.getParameter("numDebiteur");
        
        if((CheckType.isInt(montant)) && (montant != null) && (numDebiteur != null) && (numCrediteur != null)){
             
                VirementDto v = new VirementDto();
                 v.setMontant(Integer.parseInt(montant));
                 v.setNumCompteCrediteur(numCrediteur);
                 v.setNumCompteDebiteur(numCrediteur);
                 result = service.save(v);
                 
            }
       request.setAttribute("result", result);
       request.getRequestDispatcher("virement.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
