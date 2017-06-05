/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Operaciones_BD.ConsultasBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jorge
 */
public class ServRegistroUser extends HttpServlet {

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
        String Usuario=request.getParameter("Usuario_P");
        String Pass=request.getParameter("Pass_P");
        String Tipo=request.getParameter("Tipo"); 
        String Nombre=request.getParameter("Name_P"); 
        String ApellidoP=request.getParameter("Apellido_P");
        String ApellidoM=request.getParameter("Apellido_M");
        String Genero=request.getParameter("Genero");
        String Correo=request.getParameter("Correo_P");
        String Telefono=request.getParameter("Telefono"); 
        //int reputacion=request.getParameter("");
        String FechaNacimiento=request.getParameter("date");
        //int experiencia=request.getParameter("")  
        
        ConsultasBD consultor= new ConsultasBD();
        String Status=consultor.NuevoUser(Usuario, Pass, Tipo, Nombre, ApellidoP, ApellidoM, Genero, Correo, Telefono, 0, FechaNacimiento, 0);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServRegistroUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServRegistroUser at " + Status + "</h1>");
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
