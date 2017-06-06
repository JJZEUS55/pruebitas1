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
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Alan
 */
@WebServlet(name = "Desarrolladores", urlPatterns = {"/Desarrolladores"})
public class Desarrolladores extends HttpServlet {

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
        ValidarLogin.validar(request, response, "Cli");
        HttpSession sesion=request.getSession();
        String user = (String)sesion.getAttribute("Usuario");
        ResultSet datosUs = objeto.infoCliente(user);
        ResultSet datosDes = objeto.Desarrolladores();
        try
        {
            datosUs.absolute(1);
            user = datosUs.getString(7)+" ";
            user += datosUs.getString(8)+" ";
            user += datosUs.getString(9);
            
        } catch(SQLException e) {}
            out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"	<meta charset=\"utf-8\">\n" +
"	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"	\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
"	<meta name=\"description\" content=\"Neon Admin Panel\" />\n" +
"	<meta name=\"author\" content=\"\" />\n" +
"	\n" +
"	<title>MIZZI | Desarrolladores</title>\n" +
"	\n" +
"\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/css/font-icons/entypo/css/entypo.css\">\n" +
"	<link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/css/bootstrap.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/css/neon-core.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/css/neon-theme.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/css/neon-forms.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/css/custom.css\">\n" +
"\n" +
"\n" +
"	<script src=\"assets/js/jquery-1.11.0.min.js\"></script>\n" +
"\n" +
"	\n" +
"	\n" +
"</head>\n" +
"<body class=\"page-body\" data-url=\"http://neon.dev\">\n" +
"\n" +
"<div class=\"page-container\"><!-- add class \"sidebar-collapsed\" to close sidebar by default, \"chat-visible\" to make chat appear always -->	\n" +
"	\n" +
"	<div class=\"sidebar-menu\">\n" +
"		\n" +
"			\n" +
"		<header class=\"logo-env\">\n" +
"			\n" +
"			<!-- logo -->\n" +
"			<div class=\"logo\">\n" +
"				<a href=\"InicioCliente\">\n" +
"					<h1 style=\"color: aliceblue \"class=\"text-uppercase text-center\"><strong>MIZZI</strong></h1>\n" +
"				</a>\n" +
"			</div>\n" +
"			\n" +
"						<!-- logo collapse icon -->\n" +
"						\n" +
"			<div class=\"sidebar-collapse\">\n" +
"				<a href=\"#\" class=\"sidebar-collapse-icon with-animation\"><!-- add class \"with-animation\" if you want sidebar to have animation during expanding/collapsing transition -->\n" +
"					<i class=\"entypo-menu\"></i>\n" +
"				</a>\n" +
"			</div>\n" +
"			\n" +
"									\n" +
"			\n" +
"			<!-- open/close menu icon (do not remove if you want to enable menu on mobile devices) -->\n" +
"			<div class=\"sidebar-mobile-menu visible-xs\">\n" +
"				<a href=\"#\" class=\"with-animation\"><!-- add class \"with-animation\" to support animation -->\n" +
"					<i class=\"entypo-menu\"></i>\n" +
"				</a>\n" +
"			</div>\n" +
"			\n" +
"		</header>\n" +
"				\n" +
"				\n" +
"		\n" +
"				\n" +
"		<ul id=\"main-menu\" class=\"\">\n" +
"			<li id=\"search\">\n" +
"				<form method=\"get\" action=\"\">\n" +
"					<input type=\"text\" name=\"q\" class=\"search-input\" placeholder=\"Buscar..\"/>\n" +
"					<button type=\"submit\">\n" +
"						<i class=\"entypo-search\"></i>\n" +
"					</button>\n" +
"				</form>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"NuevaP_Cliente\">\n" +
"					<i class=\"entypo-gauge\"></i>\n" +
"					<span>Nueva publicacion</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"PublicacionesC\">\n" +
"					<i class=\"entypo-layout\"></i>\n" +
"					<span>Modificar Publicacion</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li class=\"active opened active\">\n" +
"				<a href=\"Desarrolladores\" target=\"_blank\">\n" +
"					<i class=\"entypo-monitor\"></i>\n" +
"					<span>Desarrolladores</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"Seguimiento\">\n" +
"					<i class=\"entypo-newspaper\"></i>\n" +
"					<span>Proyectos en progreso</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			\n" +
"		</ul>				\n" +
"	</div>	\n" +
"	<div class=\"main-content\">		\n" +
"<div class=\"row\">\n" +
"	\n" +
"	<!-- Profile Info and Notifications -->\n" +
"	<div class=\"col-md-6 col-sm-8 clearfix\">\n" +
"		<ul class=\"user-info pull-left pull-none-xsm\">\n" +
"		\n" +
"						<!-- Profile Info -->\n" +
"			<li class=\"profile-info dropdown\">				\n" +
"				<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n" +
"					<img src=\"assets/images/thumb-1@2x.png\" alt=\"\" class=\"img-circle\" width=\"44\" />\n" +
"					Nombre Usuario\n" +
"				</a>\n" +
"				<ul class=\"dropdown-menu\">\n" +
"					<li class=\"caret\"></li>\n" +
"					<li>\n" +
"						<a href=\"FormModificarUser\">\n" +
"							<i class=\"entypo-user\"></i>\n" +
"							Editar Perfil\n" +
"						</a>\n" +
"					</li>\n" +
"					\n" +
"					<li>\n" +
"						<a href=\"mailbox.html\">\n" +
"							<i class=\"entypo-mail\"></i>\n" +
"							Inbox\n" +
"						</a>\n" +
"					</li>\n" +
"					\n" +
"					<li>\n" +
"						<a href=\"extra-calendar.html\">\n" +
"							<i class=\"entypo-calendar\"></i>\n" +
"							Calendario\n" +
"						</a>\n" +
"					</li>\n" +
"					\n" +
"					<li>\n" +
"						<a href=\"#\">\n" +
"							<i class=\"entypo-clipboard\"></i>\n" +
"							Tareas\n" +
"						</a>\n" +
"					</li>\n" +
"				</ul>\n" +
"			</li>\n" +
"		\n" +
"		</ul>\n" +
"				\n" +
"		<ul class=\"user-info pull-left pull-right-xs pull-none-xsm\">\n" +
"			\n" +
"			<!-- Raw Notifications -->\n" +
"			<li class=\"notifications dropdown\">\n" +
"				\n" +
"				<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n" +
"					<i class=\"entypo-attention\"></i>\n" +
"					<span class=\"badge badge-info\">2</span>\n" +
"				</a>\n" +
"				\n" +
"				<ul class=\"dropdown-menu\">\n" +
"					<li class=\"top\">\n" +
"	<p class=\"small\">\n" +
"		<a href=\"#\" class=\"pull-right\">Arcar todas como leídas</a>\n" +
"		Usted tiene <strong>3</strong> nuevas notificaciones.\n" +
"	</p>\n" +
"</li>\n" +
"\n" +
"<li>\n" +
"	<ul class=\"dropdown-menu-list scroller\">\n" +
"		<li class=\"unread notification-info\">\n" +
"			<a href=\"#\">\n" +
"				<i class=\"entypo-user-add pull-right\"></i>\n" +
"				<span class=\"line\">\n" +
"					<strong>Cambios en las políticas de MIIZI</strong>\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"line small\">\n" +
"					30 seconds ago\n" +
"				</span>\n" +
"			</a>\n" +
"		</li>\n" +
"		\n" +
"		<li class=\"notification-primary\">\n" +
"			<a href=\"#\">\n" +
"				<i class=\"entypo-heart pull-right\"></i>\n" +
"				\n" +
"				<span class=\"line\">\n" +
"					<strong>5  desarrolladores interesados en tu proyecto</strong>\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"line small\">\n" +
"					Hace 2 minutos\n" +
"				</span>\n" +
"			</a>\n" +
"		</li>\n" +
"	</ul>\n" +
"</li>\n" +
"\n" +
"<li class=\"external\">\n" +
"	<a href=\"#\">Ver todas las notificaciones</a>\n" +
"</li>				</ul>\n" +
"				\n" +
"			</li>\n" +
"			\n" +
"			<!-- Message Notifications -->\n" +
"			<li class=\"notifications dropdown\">\n" +
"				\n" +
"				<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n" +
"					<i class=\"entypo-mail\"></i>\n" +
"					<span class=\"badge badge-secondary\">2</span> <!-- Cantidad de notificacion en icono -->\n" +
"				</a>\n" +
"				\n" +
"				<ul class=\"dropdown-menu\">\n" +
"					<li>\n" +
"	<ul class=\"dropdown-menu-list scroller\">\n" +
"		<li class=\"active\">\n" +
"			<a href=\"#\">\n" +
"				<span class=\"image pull-right\">\n" +
"					<img src=\"assets/images/thumb-1.png\" alt=\"\" class=\"img-circle\" />\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"line\">\n" +
"					<strong>Luc Chartier</strong>\n" +
"					- Ayer\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"line desc small\">\n" +
"					Podrias darme mas informacion acerca del proyecto miiizi...\n" +
"				</span>\n" +
"			</a>\n" +
"		</li>\n" +
"		\n" +
"		<li class=\"active\">\n" +
"			<a href=\"#\">\n" +
"				<span class=\"image pull-right\">\n" +
"					<img src=\"assets/images/thumb-2.png\" alt=\"\" class=\"img-circle\" />\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"line\">\n" +
"					<strong>Salma Nyberg</strong>\n" +
"					- hace 2 dias\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"line desc small\">\n" +
"				Ttengo un problema con tu ultimo pago. \n" +
"				</span>\n" +
"			</a>\n" +
"		</li>\n" +
"		\n" +
"		\n" +
"	</ul>\n" +
"</li>\n" +
"\n" +
"<li class=\"external\">\n" +
"	<a href=\"mailbox.html\">Todos los mensajes</a>\n" +
"</li>				</ul>\n" +
"				\n" +
"			</li>\n" +
"			\n" +
"			<!-- Task Notifications -->\n" +
"			<li class=\"notifications dropdown\">\n" +
"				\n" +
"				<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-hover=\"dropdown\" data-close-others=\"true\">\n" +
"					<i class=\"entypo-list\"></i>\n" +
"					<span class=\"badge badge-warning\">1</span> <!-- Cantidad de notificacion en icono -->\n" +
"				</a>\n" +
"				\n" +
"				<ul class=\"dropdown-menu\">\n" +
"					<li class=\"top\">\n" +
"	<p>Tienes 2 tareas pendientes</p>\n" +
"</li>\n" +
"\n" +
"<li>\n" +
"	<ul class=\"dropdown-menu-list scroller\">\n" +
"		<li>\n" +
"			<a href=\"#\">\n" +
"				<span class=\"task\">\n" +
"					<span class=\"desc\">Completar perfil</span>\n" +
"					<span class=\"percent\">60%</span>\n" +
"				</span>\n" +
"			\n" +
"				<span class=\"progress\">\n" +
"					<span style=\"width: 27%;\" class=\"progress-bar progress-bar-success\">\n" +
"						<span class=\"sr-only\">26% Complete</span>\n" +
"					</span>\n" +
"				</span>\n" +
"			</a>\n" +
"		</li>\n" +
"		<li>\n" +
"			<a href=\"#\">\n" +
"				<span class=\"task\">\n" +
"					<span class=\"desc\">Publicacion</span>\n" +
"					<span class=\"percent\">83%</span>\n" +
"				</span>\n" +
"				\n" +
"				<span class=\"progress progress-striped\">\n" +
"					<span style=\"width: 83%;\" class=\"progress-bar progress-bar-danger\">\n" +
"						<span class=\"sr-only\">83% Complete</span>\n" +
"					</span>\n" +
"				</span>\n" +
"			</a>\n" +
"		</li>\n" +
"		\n" +
"	</ul>\n" +
"</li>\n" +
"\n" +
"<li class=\"external\">\n" +
"	<a href=\"#\">Mirar todas las tareas</a>\n" +
"</li>				</ul>\n" +
"				\n" +
"			</li>\n" +
"		\n" +
"		</ul>\n" +
"	\n" +
"	</div>\n" +
"	\n" +
"	\n" +
"	<!-- Raw Links -->\n" +
"	<div class=\"col-md-6 col-sm-4 clearfix hidden-xs\">\n" +
"		\n" +
"		<ul class=\"list-inline links-list pull-right\">\n" +
"			\n" +
"			<!-- Language Selector -->			<li class=\"dropdown language-selector\">\n" +
"				\n" +
"				Lenguaje: &nbsp;\n" +
"				<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" data-close-others=\"true\">\n" +
"					<img src=\"assets/images/flag-es.png\" />\n" +
"				</a>\n" +
"				\n" +
"				<ul class=\"dropdown-menu pull-right\">\n" +
"					<li>\n" +
"						<a href=\"#\">\n" +
"							<img src=\"assets/images/flag-de.png\" />\n" +
"							<span>Deutsch</span>\n" +
"						</a>\n" +
"					</li>\n" +
"					<li class=\"active\">\n" +
"						<a href=\"#\">\n" +
"							<img src=\"assets/images/flag-uk.png\" />\n" +
"							<span>English</span>\n" +
"						</a>\n" +
"					</li>\n" +
"					<li>\n" +
"						<a href=\"#\">\n" +
"							<img src=\"assets/images/flag-fr.png\" />\n" +
"							<span>François</span>\n" +
"						</a>\n" +
"					</li>\n" +
"					<li>\n" +
"						<a href=\"#\">\n" +
"							<img src=\"assets/images/flag-al.png\" />\n" +
"							<span>Shqip</span>\n" +
"						</a>\n" +
"					</li>\n" +
"					<li>\n" +
"						<a href=\"#\">\n" +
"							<img src=\"assets/images/flag-es.png\" />\n" +
"							<span>Español</span>\n" +
"						</a>\n" +
"					</li>\n" +
"				</ul>\n" +
"				\n" +
"			</li>\n" +
"			\n" +
"			<li class=\"sep\"></li>\n" +
"			\n" +
"						\n" +
"			<li>\n" +
"				<a href=\"#\" data-toggle=\"chat\" data-animate=\"1\" data-collapse-sidebar=\"1\">\n" +
"					<i class=\"entypo-chat\"></i>\n" +
"					Chat\n" +
"					\n" +
"					<span class=\"badge badge-success chat-notifications-badge is-hidden\">0</span> <!-- Cantidad de notificacion en icono -->\n" +
"				</a>\n" +
"			</li>\n" +
"			\n" +
"			<li class=\"sep\"></li>\n" +
"			\n" +
"			<li>\n" +
"				<a href=\"CerrarSesion\">\n" +
"					Cerrar sesión <i class=\"entypo-logout right\"></i>\n" +
"				</a>\n" +
"			</li>\n" +
"		</ul>\n" +
"		\n" +
"	</div>\n" +
"	\n" +
"</div>\n" +
"\n" +
"<hr />\n" +
"			\n" +
"			\n" +
"<h1>Todos los Desarrolladores</h1>\n" +
"\n" +
"<br />\n" +
"\n" +
"<div class=\"row\">\n" +
"	<div class=\"col-md-12\">\n" +
"		\n" +
"		<table class=\"table table-bordered responsive\" id=\"table-3\">\n" +
"			<thead>\n" +
"    			<tr class=\"replace-inputs\">\n" +
"      				<th>Nombre</th>\n" +
"      				<th>Experiencia</th>\n" +
"      				<th>Reputacion</th>\n" +
"      				<th>Contacto</th>\n" +
"    			</tr>\n" +
"    			<tr>\n" +
"    				<th>Nombre</th>\n" +
"      				<th>Experiencia</th>\n" +
"      				<th>Reputacion</th>\n" +
"      				<th>Contacto</th>\n" +
"    			</tr>\n" +
"  			</thead>\n" +
"  			<tbody>\n"); 
                        try
                        {
                            datosDes.last();
                            int cantidad = datosDes.getRow();
                            //int cantidad = 10;
                            
                            for (int i = 1; i <= cantidad; i++) 
                            {
                                datosDes.absolute(i);
                                //out.println("<tr>");
                                out.println("<td>"+datosDes.getString(2)+" "+datosDes.getString(3)+" "+datosDes.getString(4)+"</td>");
                                //out.println("<td>name</td>");
                                out.println("<td>"+datosDes.getString(7)+"</td>");
                                //out.println("<td>xp</td>");
                                out.println("<td>"+datosDes.getString(10)+"</td>");
                                //out.println("<td>rep</td>");
                                out.println("<td><a href='#'>Contacto</a></td>");
                                out.println("</tr>");
                            }
                        }
                        catch (SQLException e) { System.out.println("Exception"+e);   }
                        
            

                out.println("	</tbody>\n" +
"		</table>\n" +
"		<script type=\"text/javascript\">\n" +
"		jQuery(document).ready(function($)\n" +
"		{\n" +
"			var table = $(\"#table-3\").dataTable({\n" +
"				\"sPaginationType\": \"bootstrap\",\n" +
"				\"aLengthMenu\": [[10, 25, 50, -1], [10, 25, 50, \"All\"]],\n" +
"				\"bStateSave\": true\n" +
"			});\n" +
"		\n" +
"			table.columnFilter({\n" +
"				\"sPlaceHolder\" : \"head:after\"\n" +
"			});\n" +
"		});\n" +
"</script>\n" +
"\n" +
"	</div>\n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<footer class=\"main\">\n" +
"\n" +
"		\n" +
"	&copy; 2017 <strong>MIZZI</strong>\n" +
"\n" +
"	\n" +
"</footer>	</div>\n" +
"	\n" +
"	\n" +
"<div id=\"chat\" class=\"fixed\" data-current-user=\"Art Ramadani\" data-order-by-status=\"1\" data-max-chat-history=\"25\">\n" +
"	\n" +
"	<div class=\"chat-inner\">\n" +
"	\n" +
"		\n" +
"		<h2 class=\"chat-header\">\n" +
"			<a href=\"#\" class=\"chat-close\" data-animate=\"1\"><i class=\"entypo-cancel\"></i></a>\n" +
"			\n" +
"			<i class=\"entypo-users\"></i>\n" +
"			Chat\n" +
"			<span class=\"badge badge-success is-hidden\">0</span>\n" +
"		</h2>\n" +
"		\n" +
"		\n" +
"		<div class=\"chat-group\" id=\"group-1\">\n" +
"			<strong>Favorites</strong>\n" +
"			\n" +
"			<a href=\"#\" id=\"sample-user-123\" data-conversation-history=\"#sample_history\"><span class=\"user-status is-online\"></span> <em>Catherine J. Watkins</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-online\"></span> <em>Nicholas R. Walker</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-busy\"></span> <em>Susan J. Best</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-offline\"></span> <em>Brandon S. Young</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-idle\"></span> <em>Fernando G. Olson</em></a>\n" +
"		</div>\n" +
"		\n" +
"		\n" +
"		<div class=\"chat-group\" id=\"group-2\">\n" +
"			<strong>Work</strong>\n" +
"			\n" +
"			<a href=\"#\"><span class=\"user-status is-offline\"></span> <em>Robert J. Garcia</em></a>\n" +
"			<a href=\"#\" data-conversation-history=\"#sample_history_2\"><span class=\"user-status is-offline\"></span> <em>Daniel A. Pena</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-busy\"></span> <em>Rodrigo E. Lozano</em></a>\n" +
"		</div>\n" +
"		\n" +
"		\n" +
"		<div class=\"chat-group\" id=\"group-3\">\n" +
"			<strong>Social</strong>\n" +
"			\n" +
"			<a href=\"#\"><span class=\"user-status is-busy\"></span> <em>Velma G. Pearson</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-offline\"></span> <em>Margaret R. Dedmon</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-online\"></span> <em>Kathleen M. Canales</em></a>\n" +
"			<a href=\"#\"><span class=\"user-status is-offline\"></span> <em>Tracy J. Rodriguez</em></a>\n" +
"		</div>\n" +
"	\n" +
"	</div>\n" +
"	\n" +
"	<!-- conversation template -->\n" +
"	<div class=\"chat-conversation\">\n" +
"		\n" +
"		<div class=\"conversation-header\">\n" +
"			<a href=\"#\" class=\"conversation-close\"><i class=\"entypo-cancel\"></i></a>\n" +
"			\n" +
"			<span class=\"user-status\"></span>\n" +
"			<span class=\"display-name\"></span> \n" +
"			<small></small>\n" +
"		</div>\n" +
"		\n" +
"		<ul class=\"conversation-body\">	\n" +
"		</ul>\n" +
"		\n" +
"		<div class=\"chat-textarea\">\n" +
"			<textarea class=\"form-control autogrow\" placeholder=\"Type your message\"></textarea>\n" +
"		</div>\n" +
"		\n" +
"	</div>\n" +
"	\n" +
"</div>\n" +
"\n" +
"\n" +
"<!-- Chat Histories -->\n" +
"<ul class=\"chat-history\" id=\"sample_history\">\n" +
"	<li>\n" +
"		<span class=\"user\">Art Ramadani</span>\n" +
"		<p>Prueba historial</p>\n" +
"		<span class=\"time\">09:00</span>\n" +
"	</li>\n" +
"	\n" +
"	<li class=\"opponent\">\n" +
"		<span class=\"user\">Catherine J. Watkins</span>\n" +
"		<p>Mensaje 1</p>\n" +
"		<span class=\"time\">09:25</span>\n" +
"	</li>\n" +
"	\n" +
"	<li class=\"opponent\">\n" +
"		<span class=\"user\">Catherine J. Watkins</span>\n" +
"		<p>Mensaje 2</p>\n" +
"		<span class=\"time\">09:26</span>\n" +
"	</li>\n" +
"	\n" +
"	<li class=\"opponent unread\">\n" +
"		<span class=\"user\">Catherine J. Watkins</span>\n" +
"		<p>Mensaje 3</p>\n" +
"		<span class=\"time\">09:27</span>\n" +
"	</li>\n" +
"</ul>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<!-- Chat Histories -->\n" +
"<ul class=\"chat-history\" id=\"sample_history_2\">\n" +
"	<li class=\"opponent unread\">\n" +
"		<span class=\"user\">Daniel A. Pena</span>\n" +
"		<p>Mensaje 1</p>\n" +
"		<span class=\"time\">08:21</span>\n" +
"	</li>\n" +
"	\n" +
"	<li class=\"opponent unread\">\n" +
"		<span class=\"user\">Daniel A. Pena</span>\n" +
"		<p>Mensaje 2</p>\n" +
"		<span class=\"time\">08:27</span>\n" +
"	</li>\n" +
"</ul>	\n" +
"	</div>\n" +
"\n" +
"\n" +
"\n" +
"	<!-- Bottom Scripts -->\n" +
"	<script src=\"assets/js/gsap/main-gsap.js\"></script>\n" +
"	<script src=\"assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js\"></script>\n" +
"	<script src=\"assets/js/bootstrap.js\"></script>\n" +
"	<script src=\"assets/js/joinable.js\"></script>\n" +
"	<script src=\"assets/js/resizeable.js\"></script>\n" +
"	<script src=\"assets/js/neon-api.js\"></script>\n" +
"	<script src=\"assets/js/jquery.dataTables.min.js\"></script>\n" +
"	<script src=\"assets/js/datatables/TableTools.min.js\"></script>\n" +
"	<script src=\"assets/js/dataTables.bootstrap.js\"></script>\n" +
"	<script src=\"assets/js/datatables/jquery.dataTables.columnFilter.js\"></script>\n" +
"	<script src=\"assets/js/datatables/lodash.min.js\"></script>\n" +
"	<script src=\"assets/js/datatables/responsive/js/datatables.responsive.js\"></script>\n" +
"	<script src=\"assets/js/select2/select2.min.js\"></script>\n" +
"	<script src=\"assets/js/neon-chat.js\"></script>\n" +
"	<script src=\"assets/js/neon-custom.js\"></script>\n" +
"	<script src=\"assets/js/neon-demo.js\"></script>\n" +
"\n" +
"</body>\n" +
"</html>");
            
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
