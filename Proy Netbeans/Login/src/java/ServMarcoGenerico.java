/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class ServMarcoGenerico extends HttpServlet {

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
            out.println("<title>Servlet ServMarcoGenerico</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            
            out.println("<div id='PrimeraParte'>");
out.println("<div class='page-container'><!-- add class 'sidebar-collapsed' to close sidebar by default, 'chat-visible' to make chat appear always -->	");
out.println("	");
out.println("	<div class='sidebar-menu'>");
out.println("		");
out.println("			");
out.println("		<header class='logo-env'>");
out.println("			");
out.println("			<!-- logo -->");
out.println("			<div class='logo'>");
out.println("				<a href='InicioDesarrollador.html'>");
out.println("					<h1 style='color: aliceblue 'class='text-uppercase text-center'><strong>MIZZI</strong></h1>");
out.println("				</a>");
out.println("			</div>");
out.println("			");
out.println("						<!-- logo collapse icon -->");
out.println("						");
out.println("			<div class='sidebar-collapse'>");
out.println("				<a href='#' class='sidebar-collapse-icon with-animation'><!-- add class 'with-animation' if you want sidebar to have animation during expanding/collapsing transition -->");
out.println("					<i class='entypo-menu'></i>");
out.println("				</a>");
out.println("			</div>");
out.println("			");
out.println("									");
out.println("			");
out.println("			<!-- open/close menu icon (do not remove if you want to enable menu on mobile devices) -->");
out.println("			<div class='sidebar-mobile-menu visible-xs'>");
out.println("				<a href='#' class='with-animation'><!-- add class 'with-animation' to support animation -->");
out.println("					<i class='entypo-menu'></i>");
out.println("				</a>");
out.println("			</div>");
out.println("			");
out.println("		</header>");
out.println("				");
out.println("				");
out.println("		");
out.println("				");
out.println("		<ul id='main-menu' class=''>");
out.println("			<li id='search'>");
out.println("				<form method='get' action=''>");
out.println("					<input type='text' name='q' class='search-input' placeholder='Buscar..'/>");
out.println("					<button type='submit'>");
out.println("						<i class='entypo-search'></i>");
out.println("					</button>");
out.println("				</form>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='TrabajosInt.html'>");
out.println("					<i class='entypo-gauge'></i>");
out.println("					<span>Trabajos que te pueden interesar</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='Publicaciones.html'>");
out.println("					<i class='entypo-layout'></i>");
out.println("					<span>Publicaciones</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li >");
out.println("				<a href='clientes.html'>");
out.println("					<i class='entypo-monitor'></i>");
out.println("					<span>Clientes</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='seg_trabajo.html'>");
out.println("					<i class='entypo-newspaper'></i>");
out.println("					<span>Seguimiento de trabajo</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li class='active opened active'>");
out.println("				<a href='cobros.html'>");
out.println("					<i class='entypo-attach'></i>");
out.println("					<span>Cobros realizados</span>");
out.println("				</a>");
out.println("			</li>");
out.println("		</ul>				");
out.println("	</div>	");
out.println("	");
out.println("	</div>");

            
            
            
            
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
