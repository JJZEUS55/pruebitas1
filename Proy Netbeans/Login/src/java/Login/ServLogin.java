
package Login;

import Operaciones_BD.ConsultasBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServLogin extends HttpServlet {
    private static final String PagInicioAdministrador="index.html";
    private static final String PagInicioCliente="index.html";
    private static final String PagInicioDearollador="index.html";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String usr=request.getParameter("username");
        String pass=request.getParameter("password");
        
        ConsultasBD consultor= new ConsultasBD();
        
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");  
                       
            
            out.println("<title>Servlet Login no visible</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //if("log".equals(usr)&&"log".equals(pass))
            switch(consultor.Login(usr, pass))
            {
                case 0:
                    out.println("<div id='status'>invalid</div>");
                    break;
                case 1:
                    out.println("<div id='status'>success</div>");
                    out.println("<div id='redirec'>"+PagInicioDearollador+"</div>");
                    break;
                case 2:
                    out.println("<div id='status'>success</div>");
                    out.println("<div id='redirec'>"+PagInicioCliente+"</div>");
                    break;   
                case 3:
                    out.println("<div id='status'>success</div>");
                    out.println("<div id='redirec'>"+PagInicioAdministrador+"</div>");
                    break;   
            }
            
            //else
            
            
            
            
            out.println("<h1>Servlet ServLogin at " + request.getContextPath() + "</h1>");
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
