/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desarrollador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Alan
 */
public class BD_des {
    static private String NombreBaseDatos="ProyectoIS";
    static private String UsuarioBD="root";
    static private String PASS="1234";
    
    Connection conexion = null;
    Statement consult = null;
    
    public BD_des()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Registro exitoso");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {  System.out.println(e.toString()); }
        try {
           conexion = DriverManager.getConnection("jdbc:mysql://localhost/"+NombreBaseDatos+"?user="+UsuarioBD+"&password="+PASS+"");
           try {
                consult = conexion.createStatement();
                System.out.println("Operaciones_BD.ConsultasBD.<init>()");
            } catch (SQLException e) 
            {
                System.out.println(e.toString());
                System.err.println("NO SE PUDO CONECTAR");
            }        
        } catch(SQLException e) { System.out.println(e.toString()); } 
    }
    
    public ResultSet ProgramadorDestacado()
    {
        try{
            ResultSet resultado = consult.executeQuery("SELECT * FROM Desarrollador WHERE Reputacion > 9");
            System.out.println("Consulata realizada!!!");
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
    }
    
    public ResultSet ProgramadorEspecialidad(String num)
    {   try{
            
            ResultSet resultado = consult.executeQuery("select especialidad.Especialidad from desarrollador_especialidad,especialidad where (Id_Desarrollador="+num+" && desarrollador_especialidad.Id_Especialidad=especialidad.Id_Especialidad);");
            System.out.println("Consulata realizada Esp!!!"+num);
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
        
    }
    
    public ResultSet Proyectos()
    {
        try{
            ResultSet resultado = consult.executeQuery("SELECT * FROM proyecto");
            System.out.println("Consulata realizada!!!");
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
    }
}
