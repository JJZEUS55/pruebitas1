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
public class NuevaPreg extends HttpServlet {

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
            String dato1 = request.getParameter("Name_P");
            String dato2 = request.getParameter("Descripcion");
            String dato3 = request.getParameter("cb1");
            String dato4 = request.getParameter("Duracion");
            String dato5 = request.getParameter("precio");
            String dato6 = request.getParameter("date");
            String dato7 = request.getParameter("id_des");
            String dato8 = request.getParameter("cb2");
            String cad = "INSERT INTO PROYECTO VALUES(default, '"+dato7+"', '"+dato1+"','"+dato3+"', '"+dato2+"','"+dato4+"','"+dato5+"','En espera de desarrollador')";
            
            BD_des objeto = new BD_des();
            //objeto.insertPub(dato1, dato2, dato3, dato4, dato5, dato7);
            objeto.insertPub2(cad);
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NuevaPreg</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NuevaPreg at " + dato1+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato2+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato3+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato8+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato4+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato5+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato6+ "--------</h1>");
            out.println("<h1>Servlet NuevaPreg at " + dato7+ "--------</h1>");
            out.println("<h1>"+ cad +"</h1>");
            
            out.println("</body>");
            out.println("</html>");
            response.sendRedirect("InicioCliente");
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
