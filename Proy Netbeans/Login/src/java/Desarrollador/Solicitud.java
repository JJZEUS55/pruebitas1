/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.resource.cci.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alan
 */
public class Solicitud extends HttpServlet {

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
            String iduser = request.getParameter("id");
            String idpub = request.getParameter("idpub");
            BD_des objeto = new BD_des();
            String estado = objeto.estado_pub(idpub);
            String nuevoEst;
            if(estado.equals("En espera de desarrollador"))
            {
                objeto.estado_pub_Nuevo(idpub, iduser);
            }
            if(!estado.equals("En espera de desarrollador") && !estado.equals("En desarrollo") && !estado.equals("Terminado"))
            {
                System.out.println("Interesados");
                if(estado.contains(iduser))
                    System.out.println("Usuario ya interesado no se puede registrar de nuevo");
                else
                {
                    System.out.println("User nuevo en el proyecto");
                    estado += ","+iduser+"";
                    objeto.estado_pub_Nuevo(idpub, estado);
                }  
            }
            response.sendRedirect("Publicaciones");
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Solicitud</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Solicitud at " + estado + "</h1>");
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
