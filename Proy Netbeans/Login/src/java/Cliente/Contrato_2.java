/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alan
 */
public class Contrato_2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            BD_des objeto = new BD_des();
            String idproy = request.getParameter("id_proy");
            String iddes = request.getParameter("id_des");
            String Fecha1 = request.getParameter("date1");
            String Fecha2 = request.getParameter("date2");
            
            String [] FechaC1 = Fecha1.split("/");
            Fecha1 = FechaC1[2]+"-"+FechaC1[0]+"-"+FechaC1[1];
            
            String [] FechaC2 = Fecha2.split("/");
            Fecha2 = FechaC2[2]+"-"+FechaC2[0]+"-"+FechaC2[1];
            
            
            String cad = "INSERT INTO contrato VALUES (default,'"+iddes+"','"+idproy+"','"+Fecha1+"','"+Fecha2+"')";
            objeto.estado_pub_Nuevo(idproy, "En desarrollo");
            objeto.insertContract(cad);
            response.sendRedirect("Seguimiento");
            //INSERT INTO CONTRATO VALUES(1,2,3,'2017-04-10','2017-04-24');
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Contrato_2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+cad+"</h1>");
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
