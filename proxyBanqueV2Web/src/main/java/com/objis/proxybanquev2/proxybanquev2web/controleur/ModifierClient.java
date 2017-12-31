/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2web.controleur;

import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import com.objis.proxybanquev2.proxybanquev2dto.Result;
import com.objis.proxybanquev2.proxybanquev2service.impl.ClientServiceImpl;
import com.objis.proxybanquev2.proxybanquev2service.inter.IClientService;
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
@WebServlet(name = "modifierClient", urlPatterns = {"/modifierClient"})
public class ModifierClient extends HttpServlet {

     private IClientService service = new ClientServiceImpl();
     
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
            out.println("<title>Servlet ModifierClient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ModifierClient at " + request.getContextPath() + "</h1>");
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
       if(CheckType.isLong(request.getParameter("id"))){
           Long idClient =Long.parseLong(request.getParameter("id"));
           Client client = new  Client();
           client = service.findOne(idClient);
           System.out.println(client.getIdClient());
           request.setAttribute("client", client);
           request.getRequestDispatcher("modifierClient.jsp").forward(request, response);
                   
       }
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
        Result r = new Result();
       Client c = new Client();
       c.setNom(request.getParameter("nom"));
       c.setPrenom(request.getParameter("prenom"));
       c.setEmail(request.getParameter("email"));
       c.setAdresse(request.getParameter("adresse"));
       c.setIdClient(Long.parseLong(request.getParameter("id")));
       c.setIdConseiller(2L);
       r = service.update(c);
       request.setAttribute("result", r);
       
       request.getRequestDispatcher("message.jsp").forward(request, response);
        
      
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
