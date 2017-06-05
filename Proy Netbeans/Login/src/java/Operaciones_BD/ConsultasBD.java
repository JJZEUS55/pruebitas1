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
import java.util.logging.Level;
import java.util.logging.Logger;

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
                //System.out.println("Operaciones_BD.ConsultasBD.<init>()");
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
    
    public int NuevoUser
    (String Usuario,String Pass,String Tipo, String Nombre, String ApellidoP,String ApellidoM,String Genero,
            String Correo,String Telefono, int reputacion,String FechaNacimiento,int experiencia)
    {   
        //return 1;
        String Mes=FechaNacimiento.substring(0, 2);
        String Dia=FechaNacimiento.substring(3, 5);
        String Año=FechaNacimiento.substring(6,10);
        System.out.println("Inicio de Inserccion");
        try {
            /*
            INSERT INTO USUARIO VALUES(4,'George55', '123', 'Administrador');
            INSERT INTO DESARROLLADOR VALUES(1, 'Angel', 'Chavez', 'Chavez', 'Masculino', '1996-04-05', 1,'avener12@live.com.mx','58987522',10);
            INSERT INTO CLIENTE VALUES(3,'Alan', 'Garcia', 'Davila', 'Masculino', '1995-12-05', 1,'nalan@gmail.com','48984522');
            */
            ResultSet resultado=consult.executeQuery("SELECT * FROM usuario WHERE Usuario='"+Usuario+"'" );
            if(resultado.absolute(1)){
                System.out.println("usuario Existente");
                return 10;
            }
            /*
            resultado=consult.executeQuery("SELECT * FROM DESARROLLADOR WHERE Usuario='"+Usuario+"'" );
            if(resultado.absolute(1)){
                System.out.println("Correo Existente");
                return 11;
            }*/
            if(!Tipo.equals("Desarrollador") && Tipo!="Cliente"){
                System.out.println("Tipo no valido"+Tipo);
                return -2;
            }
            consult.executeUpdate("INSERT INTO USUARIO (Usuario,Password,Tipo,Estado) VALUES('"+Usuario+"', '"+Pass+"', '"+Tipo +"',2)");//2 para marcar no validado
            resultado=consult.executeQuery("SELECT * FROM usuario WHERE Usuario='"+Usuario+"'" );
            if(!resultado.absolute(1))
                return -1;
            
            String ID=resultado.getString(1);
            System.out.println("Operaciones_BD.ConsultasBD.NuevoUser() "+ID);
            if(Tipo.equals("Desarrollador"))
            {
                System.out.println("INSERT INTO DESARROLLADOR VALUES('"+ID+"', '"+Nombre+"', '"+ApellidoP+"',"
                        + " '"+ApellidoM+"', '"+Genero+"',"
                        + " '"+Año+"-"+Mes +"-"+Dia+"', '"+"0"+"','"+Correo +"','"+Telefono +"','"+reputacion+"')");
                consult.executeUpdate("INSERT INTO DESARROLLADOR VALUES('"+ID+"', '"+Nombre+"', '"+ApellidoP+"',"
                        + " '"+ApellidoM+"', '"+Genero+"',"
                        + " '"+Año+"-"+Mes +"-"+Dia+"', '"+"0"+"','"+Correo +"','"+Telefono +"','"+reputacion+"')");
                System.out.println("it works!");
                return 1;      
            }
                
            else{
                //consult.executeUpdate("INSERT INTO DESARROLLADOR VALUES(1, 'Angel', 'Chavez', 'Chavez', 'Masculino', '1996-04-05', 1,'avener12@live.com.mx','58987522',10)");
                //INSERT INTO CLIENTE VALUES(3,'Alan', 'Garcia', 'Davila', 'Masculino', '1995-12-05', 1,'nalan@gmail.com','48984522');
                consult.executeUpdate("INSERT INTO CLIENTE VALUES('"+ID+"', '"+Nombre+"', '"+ApellidoP+"',"
                        + " '"+ApellidoM+"', '"+Genero+"',"
                        + " '"+FechaNacimiento +"', '"+reputacion+"','"+Correo +"','"+Telefono+"')");
            }  
            
            return 1;    
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
}
