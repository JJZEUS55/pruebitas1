/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
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
    
    public ResultSet Desarrolladores()
    {
        try{
            ResultSet resultado = consult.executeQuery("SELECT * FROM Desarrollador");
            System.out.println("Consulata realizada!!!");
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
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
    
    public ResultSet ProyectoActual(String num)
    {   
        try{
            
            ResultSet resultado = consult.executeQuery("select proyecto.Nombre,proyecto.Estado from desarrollador,contrato,proyecto where (desarrollador.Id_Desarrollador="+num+" && desarrollador.Id_Desarrollador=contrato.Id_Desarrollador && proyecto.Estado='En desarrollo' && contrato.Id_Proyecto=proyecto.Id_Proyecto);");
            System.out.println("Consulata realizada Esp!!!"+num);
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
       
    }
    
    public int ProyectosT()
    {
        try{
            ResultSet resultado = consult.executeQuery("SELECT * FROM proyecto");
            resultado.absolute(1);
            int x = Integer.parseInt(resultado.getString(1));
            System.out.println("Consulata realizada!!!");
            return x;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return 0;
    }
    
    public ResultSet infoCliente(String nombre)
    {
        try{
            ResultSet resultado = consult.executeQuery("select * from usuario, cliente where (usuario.id_usuario = cliente.id_cliente && Usuario = \""+nombre+"\")");
            System.out.println("Consulata realizada!!!");
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
        
    }
    
    public ResultSet infoDes(String nombre)
    {
        try{
            ResultSet resultado = consult.executeQuery("select * from usuario, desarrollador where (usuario.id_usuario = desarrollador.id_desarrollador && Usuario = \""+nombre+"\")");
            System.out.println("Consulata realizada!!!");
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
        
    }
   
    
    public ResultSet Publicaciones()
    {
        try{
            ResultSet resultado = consult.executeQuery("select * from proyecto order by pago desc");
            System.out.println("Consulata realizada!!!");
            return resultado;
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        return null;
    }
    
    public void insertPub(String nombreP, String tipo, String desc, String duracion, String pago, String id)
    {
        try{
                                                      //INSERT INTO PROYECTO VALUES(8, 18, 'Sistema de casa inteligente','Android', 'Base de datos de una empresa',4,16000,'En desarrollo');
            ResultSet resultado = consult.executeQuery("INSERT INTO PROYECTO VALUES(default, '"+id+"', '"+nombreP+"','"+tipo+"', '"+desc+"','"+duracion+"','"+pago+"','En espera de desarrollador')");
            System.out.println("Insersion!!!");   
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        
    }
    
    public void insertPub2(String insert)
    {
        try{
            //INSERT INTO PROYECTO VALUES(8, 18, 'Sistema de casa inteligente','Android', 'Base de datos de una empresa',4,16000,'En desarrollo');
            consult.executeUpdate(insert);
            System.out.println("Insersion!!!");   
         } 
         catch(SQLException e)
         {
            e.printStackTrace();
        }
        
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
