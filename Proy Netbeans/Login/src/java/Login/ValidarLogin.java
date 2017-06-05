/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge
 */
public class ValidarLogin {
    public static void validar(HttpServletRequest request,HttpServletResponse response,String TipoEsperado)
    {
        HttpSession sesion=request.getSession();
        String user = (String)sesion.getAttribute("Usuario");
        String tipo = (String)sesion.getAttribute("Tipo");
        try{
        if(user==null)
        {
            
                response.sendRedirect("inicio_sesion.html");
                return;
        }
        if(TipoEsperado.equals("any"))
            return;
        if(TipoEsperado.equals(tipo))
            return;
        switch(tipo)
        {
            case "Des":
                response.sendRedirect("InicioDesarrollador");
                break;
            case "Cli":
                response.sendRedirect("InicioCliente");
                break;
            case "Adm":
                response.sendRedirect("InicioAdmin");
                break; 
            default:
                response.sendRedirect("inicio_sesion.html");

        }
        //return;
        }
        catch (IOException ex) {
                Logger.getLogger(ValidarLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
