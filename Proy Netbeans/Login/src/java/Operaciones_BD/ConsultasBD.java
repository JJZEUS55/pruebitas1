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
            System.out.println("SELECT * FROM usuario WHERE Usuario= '"+Usr+"' AND Password= '"+Pass+"'");
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
    
    public String[] ConsultarDatosUser(String Nombre)
    {
        try {
            //select * from usuario,desarrollador where usuario.Usuario='AngelC45'&& usuario.Id_Usuario=desarrollador.Id_Desarrollador
            //15
            ResultSet resultado=consult.executeQuery("select * from usuario,desarrollador where usuario.Usuario='"+Nombre+"'&& usuario.Id_Usuario=desarrollador.Id_Desarrollador");
            if(!resultado.absolute(1))
                return null;
            String resultadoCons[]=new String[15];
            for(int i =1;i<16;i++)
            {
                resultadoCons[i-1]=resultado.getString(i);
                System.out.println(resultadoCons[i-1]);
            }
            return resultadoCons;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String[] ConsultarDatosUser2(String Nombre)
    {
        try {
            //select * from usuario,desarrollador where usuario.Usuario='AngelC45'&& usuario.Id_Usuario=desarrollador.Id_Desarrollador
            //15
            System.out.println("select * from usuario,cliente where usuario.Usuario='"+Nombre+"'&& usuario.Id_Usuario=cliente.Id_Cliente");
            ResultSet resultado=consult.executeQuery("select * from usuario,cliente where usuario.Usuario='"+Nombre+"'&& usuario.Id_Usuario=cliente.Id_Cliente");
            if(!resultado.absolute(1))
                return null;
            String resultadoCons[]=new String[15];
            for(int i =1;i<15;i++)
            {
                resultadoCons[i-1]=resultado.getString(i);
                System.out.println(resultadoCons[i-1]);
            }
            return resultadoCons;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
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
           // /*
            resultado=consult.executeQuery("select * from usuario,desarrollador where desarrollador.Correo='"+Correo+"' && (usuario.Id_Usuario=desarrollador.Id_Desarrollador)" );
            if(resultado.absolute(1)){
                System.out.println("Correo Existente");
                return 11;
            }//*/
            resultado=consult.executeQuery("select * from usuario,cliente where cliente.Correo='"+Correo+"' && usuario.Id_Usuario=cliente.Id_Cliente" );
            if(resultado.absolute(1)){
                System.out.println("Correo Existente");
                return 11;
            }
            if(!Tipo.equals("Desarrollador") && !Tipo.equals("Cliente")){
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
                //return 1;      
            }
                
            else{
                //consult.executeUpdate("INSERT INTO DESARROLLADOR VALUES(1, 'Angel', 'Chavez', 'Chavez', 'Masculino', '1996-04-05', 1,'avener12@live.com.mx','58987522',10)");
                //INSERT INTO CLIENTE VALUES(3,'Alan', 'Garcia', 'Davila', 'Masculino', '1995-12-05', 1,'nalan@gmail.com','48984522');
                consult.executeUpdate("INSERT INTO CLIENTE VALUES('"+ID+"', '"+Nombre+"', '"+ApellidoP+"',"
                        + " '"+ApellidoM+"', '"+Genero+"',"
                        + " '"+Año+"-"+Mes +"-"+Dia+"', '"+reputacion+"','"+Correo +"','"+Telefono+"')");
            }
            EnvioCorreo mailSender;
            System.out.println("Operaciones_BD.EnvioCorreo.main()");
            String ContenidoCorreo=
                    "Gracias por unirte a Mizzi "+Nombre+"\n"+
                    "Te confirmamos que ahora te encuentras registrado como:\n"+
                    "Usuario: "+Usuario+"\n"+
                    "Contraseña: "+Pass+"\n"+
                    "\nEsperamos que tu experiencia con mizzi sea satisfactoria\n"+
                    "\nAtt: Equipo Mizzi\n"+
                    "\n No responda a este mensaje\n";
                    
            
            mailSender = new EnvioCorreo(Correo,"Verificacion de correo",ContenidoCorreo);
            
            return 1;    
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    
    public int ActualizarDatos(String ID,String Tipo,
            String Usuario,String Pass, String Nombre, String ApellidoP,String ApellidoM,
            String Correo,String Telefono)
 
    {
        //UPDATE desarrollador SET Ap_Paterno='Espinoza' WHERE Id_Desarrollador=1;
        System.out.println("Operaciones_BD.ConsultasBD.ActualizarDatos()"+Tipo);
        try {
            consult.executeUpdate("UPDATE USUARIO SET Password='"+Pass+"' where Id_Usuario='"+ID+"'");
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(Tipo.equals("Des"))
        {
            System.out.println("UPDATE desarrollador SET Nombres='"+Nombre+"' "
                        + ", Ap_Paterno='"+ApellidoP+"', Ap_Materno='"+ApellidoM+"' "
                        + ", Correo='"+Correo+"', Telefono='"+Telefono+"' WHERE Id_Desarrollador='"+ID+"'");
            try {
                consult.executeUpdate("UPDATE desarrollador SET Nombres='"+Nombre+"' "
                        + ", Ap_Paterno='"+ApellidoP+"', Ap_Materno='"+ApellidoM+"' "
                        + ", Correo='"+Correo+"', Telefono='"+Telefono+"' WHERE Id_Desarrollador='"+ID+"'");
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(Tipo=="Cli")
        {
            System.out.println("UPDATE desarrollador SET Nombres='"+Nombre+"' "
                        + ", Ap_Paterno='"+ApellidoP+"', Ap_Materno='"+ApellidoM+"' "
                        + ", Correo='"+Correo+"', Telefono='"+Telefono+"' WHERE Id_Desarrollador='"+ID+"'");
            try {
                consult.executeUpdate("UPDATE CLIENTE SET Nombres='"+Nombre+"' "
                        + ", Ap_Paterno='"+ApellidoP+"', Ap_Materno='"+ApellidoM+"' "
                        + ", Correo='"+Correo+"', Telefono='"+Telefono+"' WHERE Id_Cliente='"+ID+"'");
                return 1;
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
    
    
    public String[][] ObtenerChat(String Usuario1,String Usuario2)
    {
        try {
            //Diseño [0]Origen [1]Destinatario [2]Mensaje [3] Fecha
            //select chat.UserOrigen, chat.Mensaje, chat.Fecha from chat where (UserOrigen='AngelC45' && UserDestino='AlanSLC')||(UserOrigen='AlanSLC' && UserDestino='AngelC45')  ORDER BY chat.Fecha asc;
            ResultSet resultado=consult.executeQuery("select "
                    + "chat.UserOrigen, chat.Mensaje, chat.Fecha "
                    + "from chat "
                    + "where (UserOrigen='AngelC45' && UserDestino='AlanSLC')"
                    + "||(UserOrigen='AlanSLC' && UserDestino='AngelC45')  "
                    + "ORDER BY chat.Fecha asc");
            resultado.last();
            
            int NumeroChat=resultado.getRow();
            String res[][]=new String [NumeroChat][4];
            for(int i=0;i<NumeroChat;i++)
            {
                resultado.absolute(i+1);
                
                res[i][0]=resultado.getString(1);
                //res[i][1]=resultado.getString(1);
                res[i][2]=resultado.getString(2);
                res[i][3]=resultado.getString(3);
                System.out.println(i+res[i][0]+res[i][2]+res[i][3]);
                
            }
            return res;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String[][][] ObtenerChats (String Usuario)
    {
        try {
            System.out.println("select chat.UserDestino "
                    + "from chat where UserOrigen='AngelC45' "
                    + "group by UserDestino union "
                    + "select chat.UserOrigen "
                    + "from chat where UserDestino='AngelC45' group by UserOrigen");
            ResultSet resultado1=consult.executeQuery("select chat.UserDestino "
                    + "from chat where UserOrigen='AngelC45' "
                    + "group by UserDestino union "
                    + "select chat.UserOrigen "
                    + "from chat where UserDestino='AngelC45' group by UserOrigen");
            
            resultado1.last();
            int NumeroChats=resultado1.getRow();
            String restultado[][][];
            restultado = new String[NumeroChats][][];
            for(int i=1;i<=NumeroChats;i++)//NoChats
            {
                
                resultado1.absolute(i);
                System.out.println("Inicio");
                String OtroUser=resultado1.getString(1);
                System.out.println(OtroUser);
                restultado[i-1]=ObtenerChat(Usuario,OtroUser);
                resultado1=consult.executeQuery("select chat.UserDestino "
                    + "from chat where UserOrigen='AngelC45' "
                    + "group by UserDestino union "
                    + "select chat.UserOrigen "
                    + "from chat where UserDestino='AngelC45' group by UserOrigen");
                
            }
            System.out.println("Finalizado");
            System.out.println("Numero de arryas"+restultado.length+" "+restultado[0].length+ " "+restultado[0][0].length);
            return restultado;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        ConsultasBD consultor = new ConsultasBD();
        consultor.ObtenerChats("");
    }
    
    
}
