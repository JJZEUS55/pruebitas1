/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

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
 * @author Alan
 */
public class NuevaP_Cliente extends HttpServlet {

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
//        BD_des objeto = new BD_des();
//        HttpSession sesion=request.getSession();
//        String user = (String)sesion.getAttribute("Usuario");
//        ResultSet datosUs = objeto.infoCliente(user);
        String id = "";
        String user= "";
//        try
//        {
//            datosUs.absolute(1);
//            user = datosUs.getString(7)+" ";
//            user += datosUs.getString(8)+" ";
//            user += datosUs.getString(9);
//            id = datosUs.getString(1);
//        } catch(SQLException e) {}
            /* TODO output your page here. You may use following sample code. */
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
"	<title>MIZZI | Nueva publicación</title>\n" +
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
"    <script src=\"validaciones.js\"></script>\n" +
"\n" +
"	<script src=\"assets/js/jquery-1.11.0.min.js\"></script>\n" +
"\n" +
"	\n" +
"	\n" +
"</head>\n" +
"<body class=\"page-body\" data-url=\"http://neon.dev\">\n" +
"\n" +
"<script language=\"javascript\" type=\"text/javascript\">\n" +
"	function FobtenPreciouno(){\n" +
"		var vprecio = 0;\n" +
"		var vnumcheck = 0;\n" +
"		var jhtml = document.getElementById(\"cbhtml\");\n" +
"		var jsql = document.getElementById(\"cbsql\");\n" +
"		var jC = document.getElementById(\"cbC\");\n" +
"		var jjava = document.getElementById(\"cbjava\");\n" +
"		var jphyton = document.getElementById(\"cbphyton\");\n" +
"		var jvisual = document.getElementById(\"cbvisual\");\n" +
"		var jensamblador = document.getElementById(\"cbensamblador\");\n" +
"		var jandroid = document.getElementById(\"cbandroid\");\n" +
"		var jios = document.getElementById(\"cbios\");\n" +
"		var jprecio = document.getElementById(\"etprecio\");\n" +
"		\n" +
"		if(jhtml.checked) {    	\n" +
"			vprecio = vprecio + 30;\n" +
"			vnumcheck++;\n" +
"		} \n" +
"		if(jsql.checked) {\n" +
"    		vprecio = vprecio + 50;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jC.checked) {\n" +
"    		vprecio = vprecio + 60;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jjava.checked) {\n" +
"    		vprecio = vprecio + 30;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jphyton.checked) {\n" +
"    		vprecio = vprecio + 60;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jvisual.checked) {\n" +
"    		vprecio = vprecio + 45;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jensamblador.checked) {\n" +
"    		vprecio = vprecio + 100;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jandroid.checked) {\n" +
"    		vprecio = vprecio + 50;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		if(jios.checked) {\n" +
"    		vprecio = vprecio + 50;\n" +
"			vnumcheck++;\n" +
"		}\n" +
"		\n" +
"		if(vnumcheck >= 3){\n" +
"			vprecio = vprecio + 200;\n" +
"			\n" +
"		}\n" +
"		\n" +
"		//alert(\"Suma: \" + vprecio + \"\\nSeleccionados: \" + vnumcheck);\n" +
"		//jprecio.value = \"$\" + vprecio + \".00\";\n" +
"		\n" +
"		return vprecio;		\n" +
"			\n" +
"		}\n" +
"	\n" +
"	function FobtenPreciodos(){\n" +
"		var vprecio = FobtenPreciouno();\n" +
"		var numche = 0;\n" +
"		var jdweb = document.getElementById(\"cbhtml\");\n" +
"		var jdbd = document.getElementById(\"cbhtml\");\n" +
"		var jdjava = document.getElementById(\"cbhtml\");\n" +
"		var jdC = document.getElementById(\"cbhtml\");\n" +
"		var jdmodelado = document.getElementById(\"cbhtml\");\n" +
"		var jdandroid = document.getElementById(\"cbhtml\");\n" +
"		var jdensamblador = document.getElementById(\"cbhtml\");\n" +
"		var jdmedvis = document.getElementById(\"cbhtml\");\n" +
"		var jdphyton = document.getElementById(\"cbhtml\");\n" +
"		var jprecio = document.getElementById(\"etprecio\");\n" +
"		\n" +
"		if(jdweb.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdbd.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdjava.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdC.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdmodelado.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdandroid.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdensamblador.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdmedvis.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		if(jdphyton.checked){\n" +
"			vprecio = vprecio + 120;\n" +
"			numche++;\n" +
"		}\n" +
"		alert(\"Esto ya es el precio 2\");\n" +
"		jprecio.value = \"$\" + vprecio + \".00\";\n" +
"	}\n" +
"	\n" +
"	\n" +
"	\n" +
"</script>\n" +
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
"				<a href=\"ClienteInicio.html\">\n" +
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
"			<li class=\"active opened active\">\n" +
"				<a href=\"ClienteNuevaP.html\">\n" +
"					<i class=\"entypo-gauge\"></i>\n" +
"					<span>Nueva publicacion</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"ContratosR.html\">\n" +
"					<i class=\"entypo-layout\"></i>\n" +
"					<span>Contratos realizados</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"Desarrolladores.html\" target=\"_blank\">\n" +
"					<i class=\"entypo-monitor\"></i>\n" +
"					<span>Desarrolladores</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"Seguimiento.html\">\n" +
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
"						<a href=\"extra-timeline.html\">\n" +
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
"				<a href=\"extra-login.html\">\n" +
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
"<h1>Nueva Publicación</h1>\n" +
"\n" +
"<br />\n" +
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
"<div class=\"container\">\n" +
"    \n" +
"    <form role=\"form\" class=\"form-horizontal form-groups-bordered\" id=\"nuevaP\" method=\"get\">\n" +
"	<div class=\"panel panel-gradient\" data-collapsed=\"0\">\n" +
"		<!-- panel head -->\n" +
"		<div class=\"panel-heading\">\n" +
"			<div class=\"panel-title\">Información general</div>\n" +
"		\n" +
"			<div class=\"panel-options\">\n" +
"				\n" +
"				<a href=\"#\" data-rel=\"collapse\"><i class=\"entypo-down-open\"></i></a>\n" +
"				\n" +
"			</div>\n" +
"		</div>\n" +
"        \n" +
"		<!-- panel body -->\n" +
"		<div class=\"panel-body\">\n" +
"			\n" +
"			\n" +
"				<div class=\"form-group\">\n" +
"					<label for=\"field-1\" class=\"col-sm-3 control-label\">Nombre del proyecto</label>\n" +
"						\n" +
"					<div class=\"col-sm-5\">\n" +
"						<input type=\"text\" class=\"form-control\" name=\"Name_P\" placeholder=\"Nombre\">\n" +
"					</div>\n" +
"				</div>\n" +
"\n" +
"				<div class=\"form-group\">\n" +
"					<label for=\"field-ta\" class=\"col-sm-3 control-label\">Ingresa una descripcion</label>\n" +
"						\n" +
"					<div class=\"col-sm-5\">\n" +
"						<textarea class=\"form-control\" name=\"Descripcion\" placeholder=\"....\"></textarea>\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"form-group\">\n" +
"					<label for=\"field-ta\" class=\"col-sm-3 control-label\">Tipo</label>\n" +
"						\n" +
"					<div class=\"col-sm-3\">\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbhtml\" type=\"checkbox\" name=\"cb1\" value=\"HTML\">HTML\n" +
"							</label>\n" +
"						</div>\n" +
"						\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbsql\" type=\"checkbox\" name=\"cb1\" value=\"MySQL\">MySQL\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbC\" type=\"checkbox\" name=\"cb1\" value=\"C,C++\">C, C++\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbjava\" type=\"checkbox\" name=\"cb1\" value=\"Java\">Java\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbphyton\" type=\"checkbox\" name=\"cb1\" value=\"Phyton\">Phyton\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"					</div>\n" +
"\n" +
"					<div class=\"col-sm-3\">\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbvisual\" type=\"checkbox\" name=\"cb1\" value=\"Visual Basic\">Visual Basic\n" +
"							</label>\n" +
"						</div>\n" +
"						\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbensamblador\" type=\"checkbox\" name=\"cb1\" value=\"Ensamblador\"> Ensamblador\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbandroid\" type=\"checkbox\" name=\"cb1\" value=\"Android\">Android\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input id=\"cbios\" type=\"checkbox\" name=\"cb1\" value=\"iOS\">iOS\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb1\" value=\"Otro\">Otro\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"					</div>\n" +
"				</div>\n" +
"				\n" +
"\n" +
"\n" +
"			\n" +
"			\n" +
"			\n" +
"		</div>\n" +
"	</div>\n" +
"\n" +
"	<div class=\"panel panel-gradient\" data-collapsed=\"0\">		\n" +
"		<!-- panel head -->\n" +
"		<div class=\"panel-heading\">\n" +
"			<div class=\"panel-title\">Requisitos</div>\n" +
"			\n" +
"			<div class=\"panel-options\">\n" +
"				\n" +
"				<a href=\"#\" data-rel=\"collapse\"><i class=\"entypo-down-open\"></i></a>\n" +
"\n" +
"			</div>\n" +
"		</div>\n" +
"		\n" +
"		<!-- panel body -->\n" +
"		<div class=\"panel-body\">\n" +
"\n" +
"			\n" +
"				<div class=\"form-group\">\n" +
"					<label for=\"field-1\" class=\"col-sm-3 control-label\">Duracion de proyecto</label>\n" +
"						\n" +
"					<div class=\"col-sm-5\">\n" +
"						<input type=\"text\" class=\"form-control\" name=\"Duracion\" placeholder=\"Semanas\">\n" +
"					</div>\n" +
"				</div>\n" +
"\n" +
"				<div class=\"form-group\">\n" +
"					<label for=\"field-ta\" class=\"col-sm-3 control-label\">Especialidades necesarias</label>\n" +
"						\n" +
"					<div class=\"col-sm-3\">\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Desarrollo Web\">Desarrollo WEB\n" +
"							</label>\n" +
"						</div>\n" +
"						\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Base de datos\">Base de Datos\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Java\">Programacion en Java\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"C\">Programacion en C\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Modelado\">Modelado\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"					</div>\n" +
"\n" +
"					<div class=\"col-sm-3\">\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Android\">Android\n" +
"							</label>\n" +
"						</div>\n" +
"						\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Ensamblador\">Programacion en ensamblador\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Medios Audiovisuales\">Medios audiovisuales\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Phyton\">Programacion en Phyton\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"						<div class=\"checkbox\">\n" +
"							<label>\n" +
"								<input type=\"checkbox\" name=\"cb2\" value=\"Otro\">Otro\n" +
"							</label>\n" +
"						</div>\n" +
"\n" +
"					</div>\n" +
"				</div>\n" +
"				<div class=\"form-group\">\n" +
"					<label class=\"col-sm-3 control-label\">Rango aproximado de inicio a fin</label>\n" +
"					\n" +
"					<div class=\"col-sm-5\">\n" +
"						<div class=\"daterange daterange-inline\" data-format=\"MMMM D, YYYY\" data-start-date=\"June 13, 2017\" data-end-date=\"June 27, 2017\" name=\"fecha\">\n" +
"							<i class=\"entypo-calendar\"></i>\n" +
"							<span>June 13, 2017 - June 27, 2017</span>\n" +
"						</div>\n" +
"						\n" +
"					</div>\n" +
"				</div>\n" +
"   \n" +
"\n" +
"        </div>\n" +
"\n" +
"			\n" +
"					\n" +
"		</div>			\n" +
"	\n" +
"\n" +
"	<div class=\"panel panel-gradient\" data-collapsed=\"0\">		\n" +
"		<!-- panel head -->\n" +
"		<div class=\"panel-heading\">\n" +
"			<div class=\"panel-title\">Precio</div>\n" +
"			\n" +
"			<div class=\"panel-options\">\n" +
"				<a href=\"#\" data-rel=\"collapse\"><i class=\"entypo-down-open\"></i></a>\n" +
"				\n" +
"			</div>\n" +
"		</div>\n" +
"		\n" +
"		<!-- panel body -->\n" +
"		<div class=\"panel-body\">\n" +
"			<center><button type=\"button\" onClick=\"FobtenPreciodos()\"  class=\"btn btn-primary\">Aproximar precio</button></center>\n" +
"			\n" +
"				<div class=\"form-group\">\n" +
"					<label for=\"field-1\" class=\"col-sm-3 control-label\">Precio</label>\n" +
"						\n" +
"					<div class=\"col-sm-5\">\n" +
"						<input type=\"text\" class=\"form-control\" id=\"etprecio\" placeholder=\"Precio\" name=\"precio\">\n" +
"					</div>\n" +
"				</div>\n" +
"			\n" +
"					\n" +
"		</div>			\n" +
"	</div>\n" +
"    </form>\n" +
"</div>\n" +
"\n" +
"    \n" +
"\n" +
"<center><button type=\"submit\"  onclick=\"validacion()\" form=\"nuevaP\" class=\"btn btn-primary\" >Publicar</button></center>\n" +
"\n" +
"\n" +
"\n" +
"</div>\n" +
"        \n" +
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
"			<textarea class=\"form-control autogrow\" placeholder=\".....\"></textarea>\n" +
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
"	<link rel=\"stylesheet\" href=\"assets/js/select2/select2-bootstrap.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/select2/select2.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/selectboxit/jquery.selectBoxIt.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/daterangepicker/daterangepicker-bs3.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/icheck/skins/minimal/_all.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/icheck/skins/square/_all.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/icheck/skins/flat/_all.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/icheck/skins/futurico/futurico.css\">\n" +
"	<link rel=\"stylesheet\" href=\"assets/js/icheck/skins/polaris/polaris.css\">\n" +
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
"	<script src=\"assets/js/select2/select2.min.js\"></script>\n" +
"	<script src=\"assets/js/bootstrap-tagsinput.min.js\"></script>\n" +
"	<script src=\"assets/js/typeahead.min.js\"></script>\n" +
"	<script src=\"assets/js/selectboxit/jquery.selectBoxIt.min.js\"></script>\n" +
"	<script src=\"assets/js/bootstrap-datepicker.js\"></script>\n" +
"	<script src=\"assets/js/bootstrap-timepicker.min.js\"></script>\n" +
"	<script src=\"assets/js/bootstrap-colorpicker.min.js\"></script>\n" +
"	<script src=\"assets/js/daterangepicker/moment.min.js\"></script>\n" +
"	<script src=\"assets/js/daterangepicker/daterangepicker.js\"></script>\n" +
"	<script src=\"assets/js/jquery.multi-select.js\"></script>\n" +
"	<script src=\"assets/js/icheck/icheck.min.js\"></script>\n" +
"	<script src=\"assets/js/neon-chat.js\"></script>\n" +
"	<script src=\"assets/js/neon-custom.js\"></script>\n" +
"	<script src=\"assets/js/neon-demo.js\"></script>\n" +
"\n" +
"\n" +
"\n" +
"</body>\n" +
"</html>\n" +
"");
            
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
