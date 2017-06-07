/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jorge
 */
public class ServMarcoGenerico extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            /*
            out.println("<!DOCTYPE html>");
out.println("<html lang='en'>");
out.println("<head>");
/*
out.println("	<meta charset='utf-8'>");
out.println("	<meta http-equiv='X-UA-Compatible' content='IE=edge'>");
out.println("	");
out.println("	<meta name='viewport' content='width=device-width, initial-scale=1.0' />");
out.println("	<meta name='description' content='Neon Admin Panel' />");
out.println("	<meta name='author' content='' />");
out.println("	");
out.println("	<title>MIZZI | nombre</title>");
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
out.println("	<div id=\"PrimeraParte\">");
out.println("	<div class='sidebar-menu'>");
out.println("		");
out.println("			");
out.println("		<header class='logo-env'>");
out.println("			");
out.println("			<!-- logo -->");
out.println("			<div class='logo'>");
out.println("				<a href='InicioDesarrollador.html'>");
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
out.println("				<a href='TrabajosInt.html'>");
out.println("					<i class='entypo-gauge'></i>");
out.println("					<span>Trabajos que te pueden interesar</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='Publicaciones.html'>");
out.println("					<i class='entypo-layout'></i>");
out.println("					<span>Publicaciones</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li >");
out.println("				<a href='clientes.html'>");
out.println("					<i class='entypo-monitor'></i>");
out.println("					<span>Clientes</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li>");
out.println("				<a href='seg_trabajo.html'>");
out.println("					<i class='entypo-newspaper'></i>");
out.println("					<span>Seguimiento de trabajo</span>");
out.println("				</a>");
out.println("			</li>");
out.println("			<li class='active opened active'>");
out.println("				<a href='cobros.html'>");
out.println("					<i class='entypo-attach'></i>");
out.println("					<span>Cobros realizados</span>");
out.println("				</a>");
out.println("			</li>");
out.println("		</ul>				");
out.println("	</div>	");
out.println("	");
out.println("	</div>");
out.println("	");
out.println("	");
out.println("	");
out.println("	");
out.println("	<div class='main-content'>	");
out.println("<div id='SegundaParte'>	");
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
out.println("					Nombre Usuario");
out.println("				</a>");
out.println("				<ul class='dropdown-menu'>");
out.println("					<li class='caret'></li>");
out.println("					<li>");
out.println("						<a href='extra-timeline.html'>");
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
out.println("				<a href='extra-login.html'>");
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
out.println("<br />");
out.println("</div>");
out.println("<!-- UI Panels -->");
out.println("<div class='row'>");
out.println("	");
out.println("	<div class='col-md-12'>");
out.println("	");
out.println("		<div class='panel minimal minimal-gray'>");
out.println("			");
out.println("			<div class='panel-heading'>");
out.println("				<div class='panel-title'><h2>Cobros realizados</h2></div>");
out.println("				<div class='panel-options'>");
out.println("					");
out.println("					<ul class='nav nav-tabs bordered'>");
out.println("						<li class='active'><a href='#profile-1' data-toggle='tab'>Cobros  de trabajos actuales</a></li>");
out.println("						<li><a href='#profile-2' data-toggle='tab'>Cobros de trabajos terminados</a></li>");
out.println("					</ul>");
out.println("				</div>");
out.println("			</div>");
out.println("			");
out.println("			<div class='panel-body'>");
out.println("				");
out.println("				<div class='tab-content'>");
out.println("					<div class='tab-pane active' id='profile-1'>");
out.println("						<h3>Trabajos actuales</h3>");
out.println("						<br>");
out.println("		");
out.println("							<table class='table table-bordered datatable' id='table-3'>");
out.println("								<thead>");
out.println("									<tr class='replace-inputs'>");
out.println("										<th>Proyecto</th>");
out.println("										<th>Cliente</th>			");
out.println("										<th>Fecha inicio</th>");
out.println("										<th>Fecha fin</th>");
out.println("										<th>Valoracion de trabajo</th>");
out.println("										<th>Costo</th>");
out.println("										<th>Seguimiento</th>");
out.println("									</tr>");
out.println("									<tr>");
out.println("										<th>Proyecto</th>");
out.println("										<th>Cliente</th>			");
out.println("										<th>Fecha inicio</th>");
out.println("										<th>Fecha fin</th>");
out.println("										<th>Valoracion de trabajo</th>");
out.println("										<th>Costo</th>");
out.println("										<th>Seguimiento</th>");
out.println("									</tr>");
out.println("								</thead>");
out.println("								<tbody>");
out.println("									<tr class='odd gradeX'>");
out.println("										<th>Proyecto C++</th>");
out.println("										<th>Alex Duran</th>			");
out.println("										<th>12/06/2017</th>");
out.println("										<th>27/06/2017</th>");
out.println("										<th>89%</th>");
out.println("										<th>$2300</th>");
out.println("										<th >");
out.println("										<a href='seg_trabajo.html' class='btn btn-info btn-sm btn-icon icon-left'>");
out.println("										<i class='entypo-window'></i>");
out.println("										Ver seguimiento");
out.println("										</a></th>");
out.println("									</tr>");
out.println("									<tr class='odd gradeX'>");
out.println("										<th>Proyecto C++</th>");
out.println("										<th>Alex Duran</th>			");
out.println("										<th>12/06/2017</th>");
out.println("										<th>27/06/2017</th>");
out.println("										<th>89%</th>");
out.println("										<th>$2300</th>");
out.println("										<th>");
out.println("										<a href='seg_trabajo.html' class='btn btn-info btn-sm btn-icon icon-left'>");
out.println("										<i class='entypo-window'></i>");
out.println("										Ver seguimiento");
out.println("										</a></th>");
out.println("									</tr>");
out.println("									<tr class='odd gradeX'>");
out.println("										<th>Proyecto C++</th>");
out.println("										<th>Alex Duran</th>			");
out.println("										<th>12/06/2017</th>");
out.println("										<th>27/06/2017</th>");
out.println("										<th>89%</th>");
out.println("										<th>$2300</th>");
out.println("										<th>");
out.println("										<a href='seg_trabajo.html' class='btn btn-info btn-sm btn-icon icon-left'>");
out.println("										<i class='entypo-window'></i>");
out.println("										Ver seguimiento");
out.println("										</a></th>");
out.println("									</tr>");
out.println("								</tbody>");
out.println("								<tfoot>");
out.println("									<tr>");
out.println("										<th>Ganancias</th>");
out.println("									  <th></th>			");
out.println("									  <th></th>");
out.println("									  <th></th>");
out.println("									  <th></th>");
out.println("										<th>$6900</th>	");
out.println("										<th>Seguimiento</th>");
out.println("									</tr>");
out.println("								</tfoot>");
out.println("							</table>");
out.println("					  <script type='text/javascript'>");
out.println("								jQuery(document).ready(function($)");
out.println("								{");
out.println("									var table = $('#table-3').dataTable({");
out.println("										'sPaginationType': 'bootstrap',");
out.println("										'aLengthMenu': [[10, 25, 50, -1], [10, 25, 50, 'All']],");
out.println("										'bStateSave': true");
out.println("									});");
out.println("									table.columnFilter({");
out.println("										'sPlaceHolder' : 'head:after'");
out.println("									});");
out.println("								});");
out.println("							</script>");
out.println("					</div>");
out.println("					");
out.println("					<div class='tab-pane' id='profile-2'>");
out.println("						<h3>Trabajos terminados</h3>");
out.println("						<br>");
out.println("						<table class='table table-bordered datatable' id='table-4'>");
out.println("								<thead>");
out.println("									<tr class='replace-inputs'>");
out.println("										<th>Proyecto</th>");
out.println("										<th>Cliente</th>			");
out.println("										<th>Fecha inicio</th>");
out.println("										<th>Fecha fin</th>");
out.println("										<th>Valoracion de trabajo</th>");
out.println("										<th>Costo</th>");
out.println("									</tr>");
out.println("									<tr>");
out.println("										<th>Proyecto</th>");
out.println("										<th>Cliente</th>			");
out.println("										<th>Fecha inicio</th>");
out.println("										<th>Fecha fin</th>");
out.println("										<th>Valoracion de trabajo</th>");
out.println("										<th>Costo</th>");
out.println("									</tr>");
out.println("								</thead>");
out.println("								<tbody>");
out.println("									<tr class='odd gradeX'>");
out.println("										<th>Proyecto C++</th>");
out.println("										<th>Alex Duran</th>			");
out.println("										<th>12/06/2017</th>");
out.println("										<th>27/06/2017</th>");
out.println("										<th>89%</th>");
out.println("										<th>$2300</th>");
out.println("									</tr>");
out.println("									<tr class='odd gradeX'>");
out.println("										<th>Proyecto C++</th>");
out.println("										<th>Alex Duran</th>			");
out.println("										<th>12/06/2017</th>");
out.println("										<th>27/06/2017</th>");
out.println("										<th>89%</th>");
out.println("										<th>$2300</th>");
out.println("									</tr>");
out.println("									<tr class='odd gradeX'>");
out.println("										<th>Proyecto C++</th>");
out.println("										<th>Alex Duran</th>			");
out.println("										<th>12/06/2017</th>");
out.println("										<th>27/06/2017</th>");
out.println("										<th>89%</th>");
out.println("										<th>$2300</th>");
out.println("									</tr>");
out.println("								</tbody>");
out.println("								<tfoot>");
out.println("									<tr>");
out.println("										<th>Ganancias</th>");
out.println("										<th></th>			");
out.println("										<th></th>");
out.println("										<th></th>");
out.println("										<th></th>");
out.println("										<th>$6900</th>	");
out.println("									</tr>");
out.println("								</tfoot>");
out.println("							</table>");
out.println("							<script type='text/javascript'>");
out.println("								jQuery(document).ready(function($)");
out.println("								{");
out.println("									var table = $('#table-4').dataTable({");
out.println("										'sPaginationType': 'bootstrap',");
out.println("										'aLengthMenu': [[10, 25, 50, -1], [10, 25, 50, 'All']],");
out.println("										'bStateSave': true");
out.println("									});");
out.println("									table.columnFilter({");
out.println("										'sPlaceHolder' : 'head:after'");
out.println("									});");
out.println("								});");
out.println("							</script>");
out.println("				</div>");
out.println("					");
out.println("					");
out.println("				</div>");
out.println("				");
out.println("				");
out.println("				");
out.println("			</div>");
out.println("			");
out.println("		</div>");
out.println("		");
out.println("	</div>");
out.println("	");
out.println("	");
out.println("</div>");
out.println("<div id='TercerParte>");
out.println("<footer class='main'>");
out.println("		");
out.println("	&copy; 2017 <strong>MIZZI</strong>");
out.println("	");
out.println("</footer>	");
out.println("</div>");
out.println("</div>");
out.println("	");
out.println("	");
out.println("<div id='CuartaParte'>");
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
out.println("</div>");
out.println("	<!-- Bottom Scripts -->");
out.println("<script src='assets/js/gsap/main-gsap.js'></script>");
out.println("	<script src='assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js'></script>");
out.println("	<script src='assets/js/bootstrap.js'></script>");
out.println("	<script src='assets/js/joinable.js'></script>");
out.println("	<script src='assets/js/resizeable.js'></script>");
out.println("	<script src='assets/js/neon-api.js'></script>");
out.println("	<script src='assets/js/jquery.dataTables.min.js'></script>");
out.println("	<script src='assets/js/datatables/TableTools.min.js'></script>");
out.println("	<script src='assets/js/dataTables.bootstrap.js'></script>");
out.println("	<script src='assets/js/datatables/jquery.dataTables.columnFilter.js'></script>");
out.println("	<script src='assets/js/datatables/lodash.min.js'></script>");
out.println("	<script src='assets/js/datatables/responsive/js/datatables.responsive.js'></script>");
out.println("	<script src='assets/js/select2/select2.min.js'></script>");
out.println("	<script src='assets/js/neon-chat.js'></script>");
out.println("	<script src='assets/js/neon-custom.js'></script>");
out.println("	<script src='assets/js/neon-demo.js'></script>");
out.println("</body>");
out.println("</html>");
    
            */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServMarcoGenerico</title>");            
            out.println("</head>");
            out.println("<body>");
            
            out.println("<div id=\"PrimeraParte\">\n" +
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
"				<a href=\"Publicaciones.html\">\n" +
"					<i class=\"entypo-layout\"></i>\n" +
"					<span>Publicaciones</span>\n" +
"				</a>\n" +
"			</li>\n" +
"			<li >\n" +
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
"			<li class=\"active opened active\">\n" +
"				<a href=\"cobros.html\">\n" +
"					<i class=\"entypo-attach\"></i>\n" +
"					<span>Cobros realizados</span>\n" +
"				</a>\n" +
"			</li>\n" +
"		</ul>				\n" +
"	</div>	\n" +
"	\n" +
"	</div>");
            
           out.println("<div id=\"SegundaParte\">	\n" +
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
"\n" +
"<br />\n" +
"</div>");
           
           out.println("<div id=\"TercerParte\">\n" +
"<footer class=\"main\">\n" +
"\n" +
"		\n" +
"	&copy; 2017 <strong>MIZZI</strong>\n" +
"\n" +
"	\n" +
"</footer>	\n" +
"</div>");
           
           
           out.println("	\n" +
"<div id=\"CuartaParte\">\n" +
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
"</div>");
           
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
