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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge
 */
public class ServModificarUser extends HttpServlet {

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
        //Confirmamos la sesion del usuario
        ValidarLogin.validar(request, response, "any"); //Des, Cli, Adm, any
        
        HttpSession sesion= request.getSession();
        String Usuario = (String)sesion.getAttribute("Usuario");
        String Tipo = (String)sesion.getAttribute("Tipo");
        String ID = (String)sesion.getAttribute("ID");
        //String Usuario=request.getParameter("Usuario_P");
        //String Tipo=request.getParameter("Tipo"); 
        
        String Pass=request.getParameter("Pass_P");
        String PassVieja=request.getParameter("oldpass");
        String Nombre=request.getParameter("Name_P"); 
        String ApellidoP=request.getParameter("Apellido_P");
        String ApellidoM=request.getParameter("Apellido_M");
        //String Genero=request.getParameter("Genero");
        String Correo=request.getParameter("Correo_P");
        String Telefono=request.getParameter("Telefono"); 
        //int reputacion=request.getParameter("");
        //String FechaNacimiento=request.getParameter("date");
        //int experiencia=request.getParameter("")  
        
        ConsultasBD consultor= new ConsultasBD();
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            if(consultor.Login(Usuario, PassVieja)==0)
            {
                out.println("<div id='status'>invalid</div>");
            }
            else
            {
                out.println("<div id='status'>Valid</div>");
                if(consultor.ActualizarDatos(ID, Tipo, Usuario, Pass, Nombre, ApellidoP, ApellidoM, Correo, Telefono)==1)
                {
                    out.println("<div id='status2'>Valid</div>");
                }
                else
                {
                    out.println("<div id='status2'>invalid</div>");
                }
            }
            out.println("<title>Servlet ServModificarUser</title>");            
            
            out.println("<h1>Serv modificar invocado" + request.getContextPath() + "</h1>");
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
