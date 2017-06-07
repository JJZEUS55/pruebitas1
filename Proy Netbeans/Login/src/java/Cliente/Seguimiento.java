/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Login.ValidarLogin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge
 */
public class Seguimiento extends HttpServlet {

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
            BD_des objeto = new BD_des();
            BD_des objeto2 = new BD_des();
        ValidarLogin.validar(request, response, "Cli");
        HttpSession sesion=request.getSession();
        String user = (String)sesion.getAttribute("Usuario");
        ResultSet datosUs = objeto.infoCliente(user);
        String id = "";
        try
        {
            datosUs.absolute(1);
            user = datosUs.getString(7)+" ";
            user += datosUs.getString(8)+" ";
            user += datosUs.getString(9);
            id = datosUs.getString(1);
        } catch(SQLException e) {}
        ResultSet info = objeto.Publicaciones(id);
        ResultSet desarrollador;
            /* TODO output your page here. You may use following sample code. */
out.println("<!DOCTYPE html>");
out.println("<html lang='en'>");
out.println("<head>");
out.println("	<meta charset='utf-8'>");
out.println("	<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
out.println("	");
out.println("	<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
out.println("	<meta name='description' content='Neon Admin Panel' />");
out.println("	<meta name='author' content='' />");
out.println("	");
out.println("	<title>MIZZI | Proyectos en progreso</title>");
out.println("	");
out.println("	<link rel='stylesheet' href='assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css'>");
out.println("	<link rel='stylesheet' href='assets/css/font-icons/entypo/css/entypo.css'>");
out.println("	<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic'>");
out.println("	<link rel='stylesheet' href='assets/css/bootstrap.css'>");
out.println("	<link rel='stylesheet' href='assets/css/neon-core.css'>");
out.println("	<link rel='stylesheet' href='assets/css/neon-theme.css'>");
out.println("	<link rel='stylesheet' href='assets/css/neon-forms.css'>");
out.println("	<link rel='stylesheet' href='assets/css/custom.css'>");
out.println("	<script src='assets/js/jquery-1.11.0.min.js'></script>");
out.println("	");
out.println("	");
out.println("</head>");
out.println("<body class='page-body' data-url='http://neon.dev'>");
out.println("<div class='page-container'><!-- add class 'sidebar-collapsed' to close sidebar by default, 'chat-visible' to make chat appear always -->	");
out.println("	");
out.println("	<div class='sidebar-menu'>");
out.println("		");
out.println("			");
out.println("		<header class='logo-env'>");
out.println("			");
out.println("			<!-- logo -->");
out.println("			<div class='logo'>");
out.println("				<a href='InicioCliente'>");
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
out.println("				<a href='NuevaP_Cliente'>");
out.println("					<i class='entypo-gauge'></i>");
out.println("					<span>Nueva publicacion</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='PublicacionesC'>");
out.println("					<i class='entypo-layout'></i>");
out.println("					<span>Publicaciones</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='Desarrolladores' target='_blank'>");
out.println("					<i class='entypo-monitor'></i>");
out.println("					<span>Desarrolladores</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li class='active opened active'>");
out.println("				<a href='Seguimiento'>");
out.println("					<i class='entypo-newspaper'></i>");
out.println("					<span>Proyectos en progreso</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			");
out.println("		</ul>				");
out.println("	</div>	");
out.println("	<div class='main-content'>		");
out.println("<div class='row'>");
out.println("	");
out.println("	<!-- Profile Info and Notifications -->");
out.println("	<div class='col-md-6 col-sm-8 clearfix'>");
out.println("		<ul class='user-info pull-left pull-none-xsm'>");
out.println("		");
out.println("						<!-- Profile Info -->");
out.println("			<li class='profile-info dropdown'>				");
out.println("				<a href='#' class='dropdown-toggle' data-toggle='dropdown'>");
out.println("					<img src='assets/images/thumb-1@2x.png' alt='' class='img-circle' width='44' />");
out.println("					"+user+"");
out.println("				</a>");
out.println("				<ul class='dropdown-menu'>");
out.println("					<li class='caret'></li>");
out.println("					<li>");
out.println("						<a href='FormModificarUser'>");
out.println("							<i class='entypo-user'></i>");
out.println("							Editar Perfil");
out.println("						</a>");
out.println("					</li>");
out.println("					");
out.println("					<li>");
out.println("						<a href='mailbox.html'>");
out.println("							<i class='entypo-mail'></i>");
out.println("							Inbox");
out.println("						</a>");
out.println("					</li>");
out.println("					");
out.println("					<li>");
out.println("						<a href='extra-calendar.html'>");
out.println("							<i class='entypo-calendar'></i>");
out.println("							Calendario");
out.println("						</a>");
out.println("					</li>");
out.println("					");
out.println("					<li>");
out.println("						<a href='#'>");
out.println("							<i class='entypo-clipboard'></i>");
out.println("							Tareas");
out.println("						</a>");
out.println("					</li>");
out.println("				</ul>");
out.println("			</li>");
out.println("		");
out.println("		</ul>");
out.println("				");
out.println("		<ul class='user-info pull-left pull-right-xs pull-none-xsm'>");
out.println("			");
out.println("			<!-- Raw Notifications -->");
out.println("			<li class='notifications dropdown'>");
out.println("				");
out.println("				<a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-close-others='true'>");
out.println("					<i class='entypo-attention'></i>");
out.println("					<span class='badge badge-info'>2</span>");
out.println("				</a>");
out.println("				");
out.println("				<ul class='dropdown-menu'>");
out.println("					<li class='top'>");
out.println("	<p class='small'>");
out.println("		<a href='#' class='pull-right'>Arcar todas como leídas</a>");
out.println("		Usted tiene <strong>3</strong> nuevas notificaciones.");
out.println("	</p>");
out.println("</li>");
out.println("<li>");
out.println("	<ul class='dropdown-menu-list scroller'>");
out.println("		<li class='unread notification-info'>");
out.println("			<a href='#'>");
out.println("				<i class='entypo-user-add pull-right'></i>");
out.println("				<span class='line'>");
out.println("					<strong>Cambios en las políticas de MIIZI</strong>");
out.println("				</span>");
out.println("				");
out.println("				<span class='line small'>");
out.println("					30 seconds ago");
out.println("				</span>");
out.println("			</a>");
out.println("		</li>");
out.println("		");
out.println("		<li class='notification-primary'>");
out.println("			<a href='#'>");
out.println("				<i class='entypo-heart pull-right'></i>");
out.println("				");
out.println("				<span class='line'>");
out.println("					<strong>5  desarrolladores interesados en tu proyecto</strong>");
out.println("				</span>");
out.println("				");
out.println("				<span class='line small'>");
out.println("					Hace 2 minutos");
out.println("				</span>");
out.println("			</a>");
out.println("		</li>");
out.println("	</ul>");
out.println("</li>");
out.println("<li class='external'>");
out.println("	<a href='#'>Ver todas las notificaciones</a>");
out.println("</li>				</ul>");
out.println("				");
out.println("			</li>");
out.println("			");
out.println("			<!-- Message Notifications -->");
out.println("			<li class='notifications dropdown'>");
out.println("				");
out.println("				<a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-close-others='true'>");
out.println("					<i class='entypo-mail'></i>");
out.println("					<span class='badge badge-secondary'>2</span> <!-- Cantidad de notificacion en icono -->");
out.println("				</a>");
out.println("				");
out.println("				<ul class='dropdown-menu'>");
out.println("					<li>");
out.println("	<ul class='dropdown-menu-list scroller'>");
out.println("		<li class='active'>");
out.println("			<a href='#'>");
out.println("				<span class='image pull-right'>");
out.println("					<img src='assets/images/thumb-1.png' alt='' class='img-circle' />");
out.println("				</span>");
out.println("				");
out.println("				<span class='line'>");
out.println("					<strong>Luc Chartier</strong>");
out.println("					- Ayer");
out.println("				</span>");
out.println("				");
out.println("				<span class='line desc small'>");
out.println("					Podrias darme mas informacion acerca del proyecto miiizi...");
out.println("				</span>");
out.println("			</a>");
out.println("		</li>");
out.println("		");
out.println("		<li class='active'>");
out.println("			<a href='#'>");
out.println("				<span class='image pull-right'>");
out.println("					<img src='assets/images/thumb-2.png' alt='' class='img-circle' />");
out.println("				</span>");
out.println("				");
out.println("				<span class='line'>");
out.println("					<strong>Salma Nyberg</strong>");
out.println("					- hace 2 dias");
out.println("				</span>");
out.println("				");
out.println("				<span class='line desc small'>");
out.println("				Ttengo un problema con tu ultimo pago. ");
out.println("				</span>");
out.println("			</a>");
out.println("		</li>");
out.println("		");
out.println("		");
out.println("	</ul>");
out.println("</li>");
out.println("<li class='external'>");
out.println("	<a href='mailbox.html'>Todos los mensajes</a>");
out.println("</li>				</ul>");
out.println("				");
out.println("			</li>");
out.println("			");
out.println("			<!-- Task Notifications -->");
out.println("			<li class='notifications dropdown'>");
out.println("				");
out.println("				<a href='#' class='dropdown-toggle' data-toggle='dropdown' data-hover='dropdown' data-close-others='true'>");
out.println("					<i class='entypo-list'></i>");
out.println("					<span class='badge badge-warning'>1</span> <!-- Cantidad de notificacion en icono -->");
out.println("				</a>");
out.println("				");
out.println("				<ul class='dropdown-menu'>");
out.println("					<li class='top'>");
out.println("	<p>Tienes 2 tareas pendientes</p>");
out.println("</li>");
out.println("<li>");
out.println("	<ul class='dropdown-menu-list scroller'>");
out.println("		<li>");
out.println("			<a href='#'>");
out.println("				<span class='task'>");
out.println("					<span class='desc'>Completar perfil</span>");
out.println("					<span class='percent'>60%</span>");
out.println("				</span>");
out.println("			");
out.println("				<span class='progress'>");
out.println("					<span style='width: 27%;' class='progress-bar progress-bar-success'>");
out.println("						<span class='sr-only'>26% Complete</span>");
out.println("					</span>");
out.println("				</span>");
out.println("			</a>");
out.println("		</li>");
out.println("		<li>");
out.println("			<a href='#'>");
out.println("				<span class='task'>");
out.println("					<span class='desc'>Publicacion</span>");
out.println("					<span class='percent'>83%</span>");
out.println("				</span>");
out.println("				");
out.println("				<span class='progress progress-striped'>");
out.println("					<span style='width: 83%;' class='progress-bar progress-bar-danger'>");
out.println("						<span class='sr-only'>83% Complete</span>");
out.println("					</span>");
out.println("				</span>");
out.println("			</a>");
out.println("		</li>");
out.println("		");
out.println("	</ul>");
out.println("</li>");
out.println("<li class='external'>");
out.println("	<a href='#'>Mirar todas las tareas</a>");
out.println("</li>				</ul>");
out.println("				");
out.println("			</li>");
out.println("		");
out.println("		</ul>");
out.println("	");
out.println("	</div>");
out.println("	");
out.println("	");
out.println("	<!-- Raw Links -->");
out.println("	<div class='col-md-6 col-sm-4 clearfix hidden-xs'>");
out.println("		");
out.println("		<ul class='list-inline links-list pull-right'>");
out.println("			");
out.println("			<!-- Language Selector -->			<li class='dropdown language-selector'>");
out.println("				");
out.println("				Lenguaje: &nbsp;");
out.println("				<a href='#' class='dropdown-toggle' data-toggle='dropdown' data-close-others='true'>");
out.println("					<img src='assets/images/flag-es.png' />");
out.println("				</a>");
out.println("				");
out.println("				<ul class='dropdown-menu pull-right'>");
out.println("					<li>");
out.println("						<a href='#'>");
out.println("							<img src='assets/images/flag-de.png' />");
out.println("							<span>Deutsch</span>");
out.println("						</a>");
out.println("					</li>");
out.println("					<li class='active'>");
out.println("						<a href='#'>");
out.println("							<img src='assets/images/flag-uk.png' />");
out.println("							<span>English</span>");
out.println("						</a>");
out.println("					</li>");
out.println("					<li>");
out.println("						<a href='#'>");
out.println("							<img src='assets/images/flag-fr.png' />");
out.println("							<span>François</span>");
out.println("						</a>");
out.println("					</li>");
out.println("					<li>");
out.println("						<a href='#'>");
out.println("							<img src='assets/images/flag-al.png' />");
out.println("							<span>Shqip</span>");
out.println("						</a>");
out.println("					</li>");
out.println("					<li>");
out.println("						<a href='#'>");
out.println("							<img src='assets/images/flag-es.png' />");
out.println("							<span>Español</span>");
out.println("						</a>");
out.println("					</li>");
out.println("				</ul>");
out.println("				");
out.println("			</li>");
out.println("			");
out.println("			<li class='sep'></li>");
out.println("			");
out.println("						");
out.println("			<li>");
out.println("				<a href='#' data-toggle='chat' data-animate='1' data-collapse-sidebar='1'>");
out.println("					<i class='entypo-chat'></i>");
out.println("					Chat");
out.println("					");
out.println("					<span class='badge badge-success chat-notifications-badge is-hidden'>0</span> <!-- Cantidad de notificacion en icono -->");
out.println("				</a>");
out.println("			</li>");
out.println("			");
out.println("			<li class='sep'></li>");
out.println("			");
out.println("			<li>");
out.println("				<a href='CerrarSesion'>");
out.println("					Cerrar sesión <i class='entypo-logout right'></i>");
out.println("				</a>");
out.println("			</li>");
out.println("		</ul>");
out.println("		");
out.println("	</div>");
out.println("	");
out.println("</div>");
out.println("<hr />");
out.println("			");
out.println("			");
out.println("<h1>Proyectos en progreso</h1>");
out.println("<br />");

try {
    info.last();
    
    int cant = info.getRow();
    System.out.println("Cantidad"+cant);
    String text = "	<div class='panel panel-gradient' data-collapsed='0'>";
    String data = "";
    for (int i = 1; i <= cant; i++) {
        
        info.absolute(i);
        //System.out.println("Iteracion "+i);
        if(info.getString(8).equals("Terminado"))
            text = "	<div class='panel panel-dark' data-collapsed='1'>";
        else if (info.getString(8).equals("En desarrollo"))
            text = "	<div class='panel panel-primary' data-collapsed='0'>";
        else
            text = "	<div class='panel panel-gray' data-collapsed='0'>";
        //System.out.println("llegue "+i);
        out.println(text);
        out.println("		<!-- panel head -->");
        out.println("		<div class='panel-heading'>");
        out.println("			<div class='panel-title'>"+info.getString(3)+"</div>");
        out.println("		");
        out.println("			<div class='panel-options'>");
        out.println("				");
        out.println("				<a href='#' data-rel='collapse'><i class='entypo-down-open'></i></a>");
        out.println("				");
        out.println("			</div>");
        out.println("		</div>");
        out.println("		");
        out.println("		<!-- panel body -->");
        out.println("		<div class='panel-body'>");

        out.println("			<div class='row'>");
        out.println("				<div class='col-md-3'>Descripcion:</div>");
        out.println("				<div class='col-md-3'>"+info.getString(5)+"</div>	");
        out.println("			</div>");
        
        out.println("			<br>");
        out.println("			<div class='row'>");
        out.println("				<div class='col-md-3'>Pago: </div>");
        out.println("				<div class='col-md-3'>"+info.getString(7)+"</div>	");
        out.println("			</div>");
        
        if(info.getString(8).equals("Terminado"))
        {
            text = "	<div class='panel panel-dark' data-collapsed='1'>";
        }
        else if (info.getString(8).equals("En desarrollo"))
        {
            text = "	<div class='panel panel-primary' data-collapsed='0'>";
        }
        else
        {
            out.println("			<br><br><br>");
            out.println("			<div class='row'>");
            out.println("			<center><p> Interesados </p></center>");
            out.println("			</div>");
            if(info.getString(8).equals("En espera de desarrollador"))
            {
                out.println("			<div class='row'>");
                out.println("			<center><p> No hay programadores interesados en tu proyecto de momento </p></center>");
                out.println("			</div>");
            }
            else
            {
                String algo [] = info.getString(8).split(",");
                out.println("				<table class='table table-bordered responsive' id='table-3'>");
                out.println("					<thead>");
                out.println("						<tr>");
                out.println("							<th>Nombre</th>");
                out.println("							<th>Experiencia</th>");
                out.println("							<th>Contrato</th>");
                out.println("						</tr>");
                out.println("					</thead>");
                out.println("					<tbody>");
                for (int j = 0; j < algo.length; j++) 
                {
                    //System.out.println("Lenght"+algo.length+"Algo"+algo[j]+" J "+j);
                    desarrollador = objeto2.DesarroladorporID(algo[j]);
                    desarrollador.absolute(1);
                    out.println("						<tr>");
                    out.println("							<td>"+desarrollador.getString(7)+" "+desarrollador.getString(8)+" "+desarrollador.getString(9)+"</td>");
                    //out.println("							<td>Relleno</td>");
                    
                    out.println("							<td>"+desarrollador.getString(12)+"</td>");
                    //out.println("							<td>Relleno</td>");
                    
                    out.println("							<td><a href='Contrato?IDproyecto="+info.getString(1)+"&IDuser="+desarrollador.getString(1)+"'>Contratar</a></td>");
                    out.println("						</tr>");
                    desarrollador.close();
                }
                out.println("					</tbody>	");
                out.println("				</table>	");
            }
        }

        //contenido
        

        out.println("			");
        out.println("		</div>");
        out.println("	</div>");
    }
} catch (SQLException e) { e.printStackTrace(); }











out.println("<footer class='main'>");
out.println("		");
out.println("	&copy; 2017 <strong>MIZZI</strong>");
out.println("	");
out.println("</footer>	</div>");
out.println("	");
out.println("	");
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
out.println("			<textarea class='form-control autogrow' placeholder='Type your message'></textarea>");
out.println("		</div>");
out.println("		");
out.println("	</div>");
out.println("	");
out.println("</div>");
out.println("<!-- Chat Histories -->");
out.println("<ul class='chat-history' id='sample_history'>");
out.println("	<li>");
out.println("		<span class='user'>Art Ramadani</span>");
out.println("		<p>Prueba historial</p>");
out.println("		<span class='time'>09:00</span>");
out.println("	</li>");
out.println("	");
out.println("	<li class='opponent'>");
out.println("		<span class='user'>Catherine J. Watkins</span>");
out.println("		<p>Mensaje 1</p>");
out.println("		<span class='time'>09:25</span>");
out.println("	</li>");
out.println("	");
out.println("	<li class='opponent'>");
out.println("		<span class='user'>Catherine J. Watkins</span>");
out.println("		<p>Mensaje 2</p>");
out.println("		<span class='time'>09:26</span>");
out.println("	</li>");
out.println("	");
out.println("	<li class='opponent unread'>");
out.println("		<span class='user'>Catherine J. Watkins</span>");
out.println("		<p>Mensaje 3</p>");
out.println("		<span class='time'>09:27</span>");
out.println("	</li>");
out.println("</ul>");
out.println("<!-- Chat Histories -->");
out.println("<ul class='chat-history' id='sample_history_2'>");
out.println("	<li class='opponent unread'>");
out.println("		<span class='user'>Daniel A. Pena</span>");
out.println("		<p>Mensaje 1</p>");
out.println("		<span class='time'>08:21</span>");
out.println("	</li>");
out.println("	");
out.println("	<li class='opponent unread'>");
out.println("		<span class='user'>Daniel A. Pena</span>");
out.println("		<p>Mensaje 2</p>");
out.println("		<span class='time'>08:27</span>");
out.println("	</li>");
out.println("</ul>	");
out.println("	</div>");
out.println("	<!-- Bottom Scripts -->");
out.println("	<script src='assets/js/gsap/main-gsap.js'></script>");
out.println("	<script src='assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js'></script>");
out.println("	<script src='assets/js/bootstrap.js'></script>");
out.println("	<script src='assets/js/joinable.js'></script>");
out.println("	<script src='assets/js/resizeable.js'></script>");
out.println("	<script src='assets/js/neon-api.js'></script>");
out.println("	<script src='assets/js/neon-chat.js'></script>");
out.println("	<script src='assets/js/neon-custom.js'></script>");
out.println("	<script src='assets/js/neon-demo.js'></script>");
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
