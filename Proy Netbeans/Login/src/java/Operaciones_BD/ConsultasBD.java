/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jorge
 */
public class ConsultasBD {
    static private String NombreBaseDatos="ProyectoIS";
    static private String UsuarioBD="root";
    static private String PASS="1234";
    
    Connection conexion = null;
    Statement consult = null;
    
    public ConsultasBD()
    {
         try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro exitoso");
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {  System.out.println(e.toString()); }
        try {
           conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+NombreBaseDatos+"?user="+UsuarioBD+"&password="+PASS+"");
           try {
                consult = conexion.createStatement();
                System.out.println("Operaciones_BD.ConsultasBD.<init>()");
            } 
            catch (SQLException e) 
            {
                System.out.println(e.toString());
                System.err.println("NO SE PUDO CONECTAR");
            }        
        } 
        catch(SQLException e) { System.out.println(e.toString()); } 
        
    }
     private ResultSet ConsultaGeneralTabla(String tabla)
    {
        try{
            ResultSet resultado = consult.executeQuery("SELECT * FROM "+tabla);
            return resultado;
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return null;     
    }
    
    
    public int Login(String Usr, String Pass)
    {
        //this.ConsultaGeneralTabla("USUARIO")
        try{
            ResultSet resultado = consult.executeQuery("SELECT * FROM usuario WHERE Usuario= '"+Usr+"' AND Password= '"+Pass+"'");
            System.out.println("Consulata realizada!!!");
            //return resultado;
            if(!resultado.absolute(1))
                return 0;
            String tipo=resultado.getString("Tipo");
            switch (tipo)
            {
                case "Desarrollador":
                    return 1;
                case "Cliente":
                    return 2;
                case "Administrador":
                    return 3;
                    
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        return 0;
    }
    
}
