/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxybanquev2.proxybanquev2web.controleur;

import com.objis.proxybanquev2.proxybanquev2domaine.Client;
import com.objis.proxybanquev2.proxybanquev2service.impl.ClientServiceImpl;
import com.objis.proxybanquev2.proxybanquev2service.inter.IClientService;
import com.objis.proxybanquev2.proxybanquev2service.inter.IService;
import com.objis.proxybanquev2.proxybanquev2web.utils.CheckType;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;
import java.util.LinkedList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abdel veno vedi vici
 */
@WebServlet(name = "listeClients", urlPatterns = {"/listeClients"})
public class ListeClient extends HttpServlet {

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
            out.println("<title>Servlet listeClient</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listeClient at " + request.getContextPath() + "</h1>");
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
        String pseudo;
       
            pseudo = request.getUserPrincipal().getName();
         

            LinkedList<Client> clients = new LinkedList<>();
            clients = service.FindClientByConseiller(pseudo); // get client list

            request.setAttribute("clients", clients); //send result to ui
            request.getRequestDispatcher("listeClients.jsp").forward(request, response);

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
        processRequest(request, response);
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
