package Desarrollador;
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
 * @author Alan
 */
public class InicioDesarrollador extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BD_des objeto = new BD_des();
        ValidarLogin.validar(request, response, "Des");
        HttpSession sesion=request.getSession();
        String user = (String)sesion.getAttribute("Usuario");
        ResultSet datosUs = objeto.infoDes(user);
        
        String Nombre = "";
        String ProyectoA = "Ninguno";
        String Correo;
        String añosxp;
        String x="";
        String rep ="0";
        int cantE;
        
        try
        {
            datosUs.absolute(1);
            Nombre = datosUs.getString(7)+" ";
            Nombre += datosUs.getString(8)+" ";
            Nombre += datosUs.getString(9);
            rep = datosUs.getString(15);
            rep = String.valueOf(Integer.parseInt(rep)*10);
            x=datosUs.getString(1);
            datosUs = objeto.ProyectoActual(x);
            datosUs.absolute(1);
            ProyectoA = datosUs.getString(1);
            
        } catch(SQLException e) {}
        
        ResultSet obj2;
        ResultSet info = objeto.ProgramadorDestacado();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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
"	<title>MIZZI | nombre</title>\n" +
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
"				<a href=\"InicioDesarrollador.html\">\n" +
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
"				<a href=\"TrabajosInt.html\">\n" +
"					<i class=\"entypo-gauge\"></i>\n" +
"					<span>Trabajos que te pueden interesar</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"Publicaciones\">\n" +
"					<i class=\"entypo-layout\"></i>\n" +
"					<span>Publicaciones</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"clientes.html\">\n" +
"					<i class=\"entypo-monitor\"></i>\n" +
"					<span>Clientes</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"seg_trabajo.html\">\n" +
"					<i class=\"entypo-newspaper\"></i>\n" +
"					<span>Seguimiento de trabajo</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li>\n" +
"				<a href=\"cobros.html\">\n" +
"					<i class=\"entypo-attach\"></i>\n" +
"					<span>Cobros realizados</span>\n" +
"				</a>\n" +
"			</li>\n" +
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
"					"+Nombre+"\n" +
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
"\n" +
"<div class=\"row\">\n" +
"	<div class=\"col-md-3\">\n" +
"		<div class=\"tile-progress tile-blue\">\n" +
"			\n" +
"			<div class=\"tile-header\">\n" +
"				<h3>Reputacion</h3>\n" +
"				<span>MIZZI</span>\n" +
"			</div>\n" +
"			\n" +
"			<div class=\"tile-progressbar\">\n" +
"				<span data-fill=\""+rep+"%\"></span>\n" +
"			</div>\n" +
"			\n" +
"			<div class=\"tile-footer\">\n" +
"				<h4>\n" +
"					<span class=\"pct-counter\">0</span>% \n" +
"				</h4>\n" +
"				\n" +
"				<span>MIZZI</span>\n" +
"			</div>\n" +
"		</div>\n" +
"	\n" +
"	</div>\n" +
"	<div class=\"col-md-3\">\n" +
"		\n" +
"		<div class=\"tile-stats tile-blue\">\n" +
"			<div class=\"icon\"><i class=\"entypo-gauge\"></i></div>\n" +
"			<div class=\"num\">4</div>\n" +
"			\n" +
"			<h3>Proyectos Terminados</h3>\n" +
"			<br>\n" +
"			<br>\n" +
"			<br>\n" +
"		</div>\n" +
"\n" +
"	</div>\n" +
"	<div class=\"col-md-3\">\n" +
"\n" +
"		<div class=\"tile-title tile-aqua\">\n" +
"			\n" +
"			<div class=\"icon\">\n" +
"				<i class=\"glyphicon glyphicon-random\"></i>\n" +
"			</div>\n" +
"			\n" +
"			<div class=\"title\">\n" +
"				<h3>"+ProyectoA+"</h3>\n" +
"				<p>Proyecto en curso</p>\n" +
"			</div>\n" +
"		</div>\n" +
"		\n" +
"		\n" +
"	</div>\n" +
"	<div class=\"col-md-3\">\n" +
"		<div class=\"tile-stats tile-aqua\">\n" +
"			<div class=\"icon\"><i class=\"entypo-gauge\"></i></div>\n" +
"			<div class=\"num\">Sin Fecha</div>\n" +
"			\n" +
"			<h3>Siguiente entrega</h3>\n" +
"			<p></p>\n" +
"			<br>\n" +
"			<br>\n" +
"		</div>\n" +
"\n" +
"	</div>\n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<br />\n" +
"\n" +
"<!-- UI Panels -->\n" +
"<div class=\"row\">\n" +
"	\n" +
"	<div class=\"col-md-12\">\n" +
"	\n" +
"		<div class=\"panel minimal minimal-gray\">\n" +
"			\n" +
"			<div class=\"panel-heading\">\n" +
"				<div class=\"panel-title\"><h4>Nuevo</h4></div>\n" +
"				<div class=\"panel-options\">\n" +
"					\n" +
"					<ul class=\"nav nav-tabs bordered\">\n" +
"						<li class=\"active\"><a href=\"#profile-1\" data-toggle=\"tab\">Informacion General</a></li>\n" +
"						<li><a href=\"#profile-2\" data-toggle=\"tab\">¿Como crear publicación?</a></li>\n" +
"						<li><a href=\"#profile-3\" data-toggle=\"tab\">Tipos de proyecto</a></li>\n" +
"					</ul>\n" +
"				</div>\n" +
"			</div>\n" +
"			\n" +
"			<div class=\"panel-body\">\n" +
"				\n" +
"				<div class=\"tab-content\">\n" +
"					<div class=\"tab-pane active\" id=\"profile-1\">\n" +
"						<br>\n" +
"		\n" +
"						<p>Bienvenido a MIIZI donde podrás publicar los proyectos que deseas realizar y encontraras a la persona indicada para poder realizar tu proyecto.</p>\n" +
"						\n" +
"						<p>Al momento de publicar asegurate de describir de manera correcta lo que deseas para evitar confusiones, estarás en contacto con el desarrollador que hayas seleccionado.</p>\n" +
"\n" +
"						<p>Se llevará un registro de todos los avances que te entreguen para poder estar seguros de que existe un trabajo realizado por parte del desarrollador asi como un registro de todos los pagos efectuados</p>\n" +
"					</div>\n" +
"					\n" +
"					<div class=\"tab-pane\" id=\"profile-2\">\n" +
"						<br>\n" +
"						\n" +
"						<p>Ve a la opcion de \"Nueva publicación\" en la barra lateral izquierda, al desplegarse la nueva pantalla completa cada uno de los campos requeridos</p>\n" +
"						\n" +
"						<p>MIIZI cuenta con un sistema para establecer un precio de acuerdo a lo que necesita tu proyecto el cual podras tomar en cuenta si no sabes cual sería el mejor valor para tu propuesta</p>\n" +
"						\n" +
"						<p>...</p>\n" +
"					</div>\n" +
"\n" +
"					<div class=\"tab-pane\" id=\"profile-3\">\n" +
"						<br>\n" +
"		\n" +
"						<p>Aqui una pequeña guia de cuales son los tipos de proyecto que puedes publicar en MIIZI</p>\n" +
"						\n" +
"						<p>a)...</p>\n" +
"						<p>b)...</p>\n" +
"						<p>c)...</p>\n" +
"						<p>d)...</p>\n" +
"						<p>e)...</p>\n" +
"						<p>f)...</p>\n" +
"						<p>g)...</p>\n" +
"\n" +
"					</div>\n" +
"				</div>\n" +
"				\n" +
"			</div>\n" +
"			\n" +
"		</div>\n" +
"		\n" +
"	</div>\n" +
"	\n" +
"	\n" +
"</div>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n"); 



try {                        
            for (int i = 1; i <= 4; i++) 
            {
                datosUs = objeto.Publicaciones();
                datosUs.absolute(i);
                System.out.println("Antes de iniciar"+i);
                if(i%2 == 1)
                {
                    out.println("<div class=\"row\">\n" +
"	<div class=\"col-md-6\">\n" +
"		\n" +
"		<div class=\"panel panel-success\" data-collapsed=\"1\">\n" +
"			\n" +
"			<!-- panel head -->\n" +
"			<div class=\"panel-heading\">\n" +
"				<div class=\"panel-title\">Publicacion destacada</div>\n" +
"				\n" +
"				<div class=\"panel-options\">\n" +
"					\n" +
"					<a href=\"#\" data-rel=\"collapse\"><i class=\"entypo-down-open\"></i></a>\n" +
"					<a href=\"#\" data-rel=\"reload\"><i class=\"entypo-arrows-ccw\"></i></a>\n" +
"					<a href=\"#\" data-rel=\"close\"><i class=\"entypo-cancel\"></i></a>\n" +
"				</div>\n" +
"			</div>\n" +
"			\n" +
"			<!-- panel body -->\n" +
"			<div class=\"panel-body\">\n" +
"				\n" +
"				<p>Proyecto: "+datosUs.getString(3)+"</p>\n" +
"				<p>Tipo: "+datosUs.getString(4)+"</p>\n" +
"                               <p>Descripcion: "+datosUs.getString(5)+"</p> \n"+
"                               <p>Duracion: "+datosUs.getString(6)+"</p> \n"+
"                               <p>$$$$:"+datosUs.getString(7)+" </p>\n");
                                out.println("				<a href=\"#\">Contactar</a>\n" +
"				\n" +
"			</div>\n" +
"		</div>\n" +
"	</div>");
                    
                }
                else
                {
                    out.println("<div class=\"col-md-6\">\n" +
"		\n" +
"		<div class=\"panel panel-success\" data-collapsed=\"1\">\n" +
"			\n" +
"			<!-- panel head -->\n" +
"			<div class=\"panel-heading\">\n" +
"				<div class=\"panel-title\">Publicacion destacada</div>\n" +
"				\n" +
"				<div class=\"panel-options\">\n" +
"					\n" +
"					<a href=\"#\" data-rel=\"collapse\"><i class=\"entypo-down-open\"></i></a>\n" +
"					<a href=\"#\" data-rel=\"reload\"><i class=\"entypo-arrows-ccw\"></i></a>\n" +
"					<a href=\"#\" data-rel=\"close\"><i class=\"entypo-cancel\"></i></a>\n" +
"				</div>\n" +
"			</div>\n" +
"			\n" +
"			<!-- panel body -->\n" +
"			<div class=\"panel-body\">\n" +
"				\n" +
"				<p>Proyecto: "+datosUs.getString(3)+"</p>\n" +
"				<p>Tipo: "+datosUs.getString(4)+"</p>\n" +
"                               <p>Descripcion: "+datosUs.getString(5)+"</p> \n"+
"                               <p>Duracion: "+datosUs.getString(6)+"</p> \n"+
"                               <p>$$$$:"+datosUs.getString(7)+" </p>\n");
                                
out.println("				<a href=\"#\">Contactar</a>\n" +

"				\n" +
"			</div>\n" +
"		</div>\n" +
"	</div>\n" +
"</div>");
                }
            }
            }catch ( SQLException e )
            {
                
            }

            
            
out.println("\n" +
"<div class=\"row\">\n" +
"	<div class=\"col-md-12\">\n" +
"		\n" +
"		<div class=\"panel panel-warning\" data-collapsed=\"1\">\n" +
"			\n" +
"			<!-- panel head -->\n" +
"			<div class=\"panel-heading\">\n" +
"				<div class=\"panel-title\">Alerta</div>\n" +
"				\n" +
"				<div class=\"panel-options\">\n" +
"					\n" +
"					<a href=\"#\" data-rel=\"collapse\"><i class=\"entypo-down-open\"></i></a>\n" +
"					<a href=\"#\" data-rel=\"reload\"><i class=\"entypo-arrows-ccw\"></i></a>\n" +
"					<a href=\"#\" data-rel=\"close\"><i class=\"entypo-cancel\"></i></a>\n" +
"				</div>\n" +
"			</div>\n" +
"			\n" +
"			<!-- panel body -->\n" +
"			<div class=\"panel-body\">\n" +
"				\n" +
"				<p>Actualiza tu curriculum</p>\n" +
"				\n" +
"			</div>\n" +
"			\n" +
"		</div>\n" +
"		\n" +
"	</div>\n" +
"	\n" +
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
