/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones_BD;

import Login.ValidarLogin;
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
public class ServChat extends HttpServlet {

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
        int NumeroChats=0;
        HttpSession sesion=request.getSession();
        //ValidarLogin.validar(request, response, "any");
        String user = (String)sesion.getAttribute("Usuario");
        user="";
        ConsultasBD consultor=new ConsultasBD();
        
        String Chats[][][]=consultor.ObtenerChats(user);
        NumeroChats=Chats.length;
        
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='chat' class='fixed' data-current-user='Art Ramadani' data-order-by-status='1' data-max-chat-history='25'>");
out.println("	");
out.println("	<div class='chat-inner'>");
out.println("	");
out.println("		");
out.println("		<h2 class='chat-header'>");
out.println("			<a href='#' class='chat-close' data-animate='1'><i class='entypo-cancel'></i></a>");
out.println("			");
out.println("			<i class='entypo-users'></i>");
out.println("			Chat");
out.println("			<span class='badge badge-success is-hidden'>0</span>");
out.println("		</h2>");
out.println("		");
out.println("		");
out.println("		<div class='chat-group' id='group-1'>");
out.println("			<strong>Favorites</strong>");
out.println("			");
out.println("			<a href='#' id='sample-user-123' data-conversation-history='#sample_history'><span class='user-status is-online'></span> <em>Catherine J. Watkins</em></a>");
out.println("			<a href='#'><span class='user-status is-online'></span> <em>Nicholas R. Walker</em></a>");
out.println("			<a href='#'><span class='user-status is-busy'></span> <em>Susan J. Best</em></a>");
out.println("			<a href='#'><span class='user-status is-offline'></span> <em>Brandon S. Young</em></a>");
out.println("			<a href='#'><span class='user-status is-idle'></span> <em>Fernando G. Olson</em></a>");
out.println("		</div>");
out.println("		");
out.println("		");
out.println("		<div class='chat-group' id='group-2'>");
out.println("			<strong>Work</strong>");
out.println("			");
out.println("			<a href='#'><span class='user-status is-offline'></span> <em>Robert J. Garcia</em></a>");
out.println("			<a href='#' data-conversation-history='#sample_history_2'><span class='user-status is-offline'></span> <em>Daniel A. Pena</em></a>");
out.println("			<a href='#'><span class='user-status is-busy'></span> <em>Rodrigo E. Lozano</em></a>");
out.println("		</div>");
out.println("		");
out.println("		");
out.println("		<div class='chat-group' id='group-3'>");
out.println("			<strong>Social</strong>");
out.println("			");
out.println("			<a href='#'><span class='user-status is-busy'></span> <em>Velma G. Pearson</em></a>");
out.println("			<a href='#'><span class='user-status is-offline'></span> <em>Margaret R. Dedmon</em></a>");
out.println("			<a href='#'><span class='user-status is-online'></span> <em>Kathleen M. Canales</em></a>");
out.println("			<a href='#'><span class='user-status is-offline'></span> <em>Tracy J. Rodriguez</em></a>");
out.println("		</div>");
out.println("	");
out.println("	</div>");
out.println("	");
out.println("	<!-- conversation template -->");
out.println("	<div class='chat-conversation'>");
out.println("		");
out.println("		<div class='conversation-header'>");
out.println("			<a href='#' class='conversation-close'><i class='entypo-cancel'></i></a>");
out.println("			");
out.println("			<span class='user-status'></span>");
out.println("			<span class='display-name'></span> ");
out.println("			<small></small>");
out.println("		</div>");
out.println("		");
out.println("		<ul class='conversation-body'>	");
out.println("		</ul>");
out.println("		");
out.println("		<div class='chat-textarea'>");
out.println("			<textarea class='form-control autogrow' placeholder='Escribe Algo'></textarea>");
out.println("		</div>");
out.println("		");
out.println("	</div>");
out.println("	");
out.println("</div>");
out.println("<!-- Chat Histories -->");

//Cargamos Historiales de Conversacion
for(int i=0;i<NumeroChats;i++)
{
    out.println("<ul class='chat-history' id='sample_history_"+i+"'>"); //Cada chat tiene su propio registro
    for(int j=0;j<Chats[i].length && Chats[i]!=null;j++)//Mensajes
    {
        System.out.print("i="+i+" "+"j="+j);
        if(user.equals(Chats[i][j][0]))
        out.println("	<li>");
        else
        out.println("	<li class='opponent'>");    
        out.println("		<span class='user'>"+Chats[i][j][0]+"</span>");
        out.println("		<p>"+Chats[i][j][2]+"</p>");
        out.println("		<span class='time'>"+Chats[i][j][3]+"</span>");
        out.println("	</li>");
    }
    out.println("	<li class='opponent unread'>");
out.println("		<span class='user'>Catherine J. Watkins</span>");
out.println("		<p>Mensaje 3</p>");
out.println("		<span class='time'>09:27</span>");
out.println("	</li>");
    out.println("</ul>");
}











out.println("	");
out.println("</div>");

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
