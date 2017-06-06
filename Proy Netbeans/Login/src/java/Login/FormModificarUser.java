/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Operaciones_BD.ConsultasBD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jorge
 */
public class FormModificarUser extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion= request.getSession();
        ValidarLogin.validar(request, response, "any");
        String user = (String)sesion.getAttribute("Usuario");
        ConsultasBD consultor= new ConsultasBD();
        String Datos[]=consultor.ConsultarDatosUser(user);
        sesion.setAttribute("ID", Datos[0]);
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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
out.println("	<title>MIZZI | Registro</title>");
out.println("	");
out.println("	<link rel='stylesheet' href='assets/js/jquery-ui/css/no-theme/jquery-ui-1.10.3.custom.min.css'>");
out.println("	<link rel='stylesheet' href='assets/css/font-icons/entypo/css/entypo.css'>");
out.println("	<link rel='stylesheet' href='http://fonts.googleapis.com/css?family=Noto+Sans:400,700,400italic'>");
out.println("	<link rel='stylesheet' href='assets/css/bootstrap.css'>");
out.println("	<link rel='stylesheet' href='assets/css/neon-core.css'>");
out.println("	<link rel='stylesheet' href='assets/css/neon-theme.css'>");
out.println("	<link rel='stylesheet' href='assets/css/neon-forms.css'>");
out.println("	<link rel='stylesheet' href='assets/css/custom.css'>");
out.println("        <script src='assets/js/jquery-1.11.0.min.js'></script>");
out.println("        ");
out.println("        ");
out.println("        <script src='validacion2.js'></script>");
out.println("	");
out.println("</head>");
out.println("<body class='page-body' data-url='http://neon.dev'>");
out.println("<div class='page-container horizontal-menu'>	");
out.println("    <header class='navbar navbar-fixed-top'><!-- set fixed position by adding class 'navbar-fixed-top' -->		");
out.println("            <div class='navbar-inner'>		");
out.println("                    <!-- logo -->");
out.println("                    <div class='navbar-brand'>");
out.println("                            <a href='inicio_sesion.html'>");
out.println("                                    <img src='assets/images/logo_mizzi2.png' width='120' alt='' />");
out.println("                            </a>");
out.println("                    </div>");
out.println("            </div>		");
out.println("    </header>");
out.println("    ");
out.println("    <div class='main-content'>	");
out.println("	<div class='panel panel-info' data-collapsed='0'>");
out.println("                ");
out.println("        <div class='row'>");
out.println("	<div class='col-md-12'>");
out.println("		");
out.println("            <div class='panel panel-primary' data-collapsed='0'>");
out.println("                    <!-- panel head -->");
out.println("                    <div class='panel-heading'>");
out.println("                            <div class='panel-title'><h1>Registrarse</h1></div>");
out.println("                            <div class='panel-options'>");
out.println("                                    <!--<a href='#sample-modal' data-toggle='modal' data-target='#sample-modal-dialog-1' class='bg'><i class='entypo-cog'></i></a> QUITAR ENGRANAJE-->");
out.println("                                    <a href='#' data-rel='collapse'><i class='entypo-down-open'></i></a>");
out.println("                                    <a href='#' data-rel='reload'><i class='entypo-arrows-ccw'></i></a>");
out.println("                                    <!--<a href='#' data-rel='close'><i class='entypo-cancel'></i></a>  QUITAR CANCELAR-->");
out.println("                            </div>");
out.println("                    </div>");
out.println("			");
out.println("			<!-- panel body -->");
out.println("			<div class='panel-body'>");
out.println("			");
out.println("                            <form id='Registrar' >	");
out.println("				<div class='row'>");
out.println("		");
out.println("		");
out.println("                                <div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2' >Nombre</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<input type='text' class='form-control' id='Name_P' name='Name_P' placeholder='Nombre' value='"+Datos[6]+"'>");
out.println("					</div>");
out.println("				</div>");
out.println("				");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Apellido Paterno</label>");
out.println("						");
out.println("					<div class='col-sm-5' style='font-size: 20px'>");
out.println("						<input type='text' class='form-control' id='Apellido_P' name='Apellido_P' placeholder='Apellido' value='"+Datos[7]+"'>");
out.println("					</div>");
out.println("				</div>");
out.println("                                <br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Apellido Materno</label>");
out.println("						");
out.println("					<div class='col-sm-5' style='font-size: 20px'>");
out.println("						<input type='text' class='form-control' id='Apellido_M' name='Apellido_M' placeholder='Apellido' value='"+Datos[8]+"'>");
out.println("					</div>");
out.println("				</div>");
out.println("				");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Correo</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<input type='email' class='form-control' id='Correo_P' name='Correo_P' placeholder='Correo' value='"+Datos[12]+"'>");
out.println("					</div>");
out.println("				</div>");
out.println("                                ");
out.println("                                <br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Telefono</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("                                            <input class='form-control' id='Telefono' name='Telefono' placeholder='Telefono' value='"+Datos[13]+"'>");
out.println("					</div>");
out.println("				</div>");
out.println("				");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Contraseña vieja</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<input type='password' class='form-control' id='oldpass'  name='oldpass' placeholder='Contraseña vieja'>");
out.println("					</div>");
out.println("				</div>");
out.println("				");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Contraseña</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<input type='password' class='form-control' id='Pass_P' name='Pass_P' placeholder='Contraseña'>");
out.println("					</div>");
out.println("				</div>");
out.println("				");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Repetir Contraseña</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<input type='password' class='form-control' id='RPass_P' placeholder='Contraseña'>");
out.println("					</div>");
out.println("				</div>");
out.println("				<!--");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>Nacionalidad</label>");
out.println("						");
out.println("					");
out.println("                                        <div class='col-sm-5'>");
out.println("                                            <select class='form-control' name='Nacionalidad'>");
out.println("								<option>Mexico</option>");
out.println("								<option>Estados Unidos</option>");
out.println("								<option>España</option>");
out.println("								<option>India</option>");
out.println("								<option>Argentina</option>");
out.println("							</select>");
out.println("					</div>");
out.println("                                        ");
out.println("				</div>");
out.println("				-->");
out.println("                                <!--");
out.println("				<br/><br/>");
out.println("				<div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>¿Sabe Ingles?</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<select class='form-control' name='ingles'>");
out.println("								<option>Si</option>");
out.println("								<option>No</option>						");
out.println("							</select>");
out.println("					</div>");
out.println("				</div>");
out.println("                                -->");
/*
out.println("                                <br><br>");
out.println("                                <div class='form-group' style='font-size: 20px'>");
out.println("						<label for='field-1' class='col-sm-2'>Fecha de nacimiento</label>");
out.println("						");
out.println("						<div class='col-sm-3'>");
out.println("                                                    <input type='text' name='date' class='form-control datepicker' data-start-view='2'>");
out.println("						</div>");
out.println("				</div>");
*/
out.println("                                ");
/*
out.println("                                <br><br>");
out.println("                                <div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>¿Sexo?</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<select class='form-control' name='Genero'>");
out.println("								<option>Masculino</option>");
out.println("								<option>Feminino</option>						");
out.println("						</select>");
out.println("					</div>");
out.println("				</div>");
*/
out.println("                                ");
/*
out.println("                                <br><br>");
out.println("                                <div class='form-group' style='font-size: 20px'>");
out.println("					<label for='field-1' class='col-sm-2'>¿Eres?</label>");
out.println("						");
out.println("					<div class='col-sm-5'>");
out.println("						<select class='form-control' name='Tipo'>");
out.println("								<option>Desarrollador</option>");
out.println("								<option>Cliente</option>						");
out.println("						</select>");
out.println("					</div>");
out.println("				</div>");
*/
out.println("                                ");
out.println("				<br/><br/><br/><br/>");
out.println("					");
out.println("                            ");
out.println("                            </div>");
out.println("                                	");
out.println("			</form>");
out.println("                            <div class='form-group' >");
out.println("					<div class='col-sm-offset-4'>");
out.println("							<button onclick='validacion()' class='btn btn-success' style='font-size: 20px'>Registrarse</button>");
out.println("                                                        <!-- -->");
out.println("                                        </div>");
out.println("				</div>");
out.println("			</div>");
out.println("                         ");
out.println("		</div>");
out.println("	");
out.println("	");
out.println("	");
out.println("	");
out.println("	");
out.println("		");
out.println("    ");
out.println("	</div>");
out.println("        </div>");
out.println("        </div>");
out.println("    </div>");
out.println("<!-- Footer -->");
out.println("<footer class='main'>");
out.println("		");
out.println("	&copy; 2017 <strong>MIZZI</strong>");
out.println("	");
out.println("</footer>");
out.println("	");
out.println("	<link rel='stylesheet' href='assets/js/jvectormap/jquery-jvectormap-1.2.2.css'>");
out.println("	<link rel='stylesheet' href='assets/js/rickshaw/rickshaw.min.css'>	");
out.println("	 ");
out.println("        <link rel='stylesheet' href='assets/js/select2/select2-bootstrap.css'>");
out.println("	<link rel='stylesheet' href='assets/js/select2/select2.css'>");
out.println("	<link rel='stylesheet' href='assets/js/selectboxit/jquery.selectBoxIt.css'>");
out.println("	<link rel='stylesheet' href='assets/js/daterangepicker/daterangepicker-bs3.css'>");
out.println("	<link rel='stylesheet' href='assets/js/icheck/skins/minimal/_all.css'>");
out.println("	<link rel='stylesheet' href='assets/js/icheck/skins/square/_all.css'>");
out.println("	<link rel='stylesheet' href='assets/js/icheck/skins/flat/_all.css'>");
out.println("	<link rel='stylesheet' href='assets/js/icheck/skins/futurico/futurico.css'>");
out.println("	<link rel='stylesheet' href='assets/js/icheck/skins/polaris/polaris.css'>");
out.println("	<!-- Bottom Scripts -->");
out.println("	<script src='assets/js/daterangepicker/moment.min.js'></script>");
out.println("	<script src='assets/js/daterangepicker/daterangepicker.js'></script>");
out.println("	<script src='assets/js/bootstrap-datepicker.js'></script>");
out.println("	<script src='assets/js/bootstrap-timepicker.min.js'></script>");
out.println("	<script src='assets/js/bootstrap-colorpicker.min.js'></script>");
out.println("	");
out.println("	");
out.println("	<script src='assets/js/bootstrap-tagsinput.min.js'></script>");
out.println("        ");
out.println("	<script src='assets/js/typeahead.min.js'></script>");
out.println("	<script src='assets/js/selectboxit/jquery.selectBoxIt.min.js'></script>");
out.println("	");
out.println("	");
out.println("	<script src='assets/js/jquery.multi-select.js'></script>");
out.println("	<script src='assets/js/icheck/icheck.min.js'></script>");
out.println("	");
out.println("        ");
out.println("	<!-- Bottom Scripts -->");
out.println("	<script src='assets/js/gsap/main-gsap.js'></script>");
out.println("	<script src='assets/js/jquery-ui/js/jquery-ui-1.10.3.minimal.min.js'></script>");
out.println("	<script src='assets/js/bootstrap.js'></script>");
out.println("	<script src='assets/js/joinable.js'></script>");
out.println("	<script src='assets/js/resizeable.js'></script>");
out.println("	<script src='assets/js/neon-api.js'></script>");
out.println("	");
out.println("        ");
out.println("        ");
out.println("        <script src='assets/js/jvectormap/jquery-jvectormap-1.2.2.min.js'></script>");
out.println("	<script src='assets/js/jvectormap/jquery-jvectormap-europe-merc-en.js'></script>");
out.println("	<script src='assets/js/jquery.sparkline.min.js'></script>");
out.println("	<script src='assets/js/rickshaw/vendor/d3.v3.js'></script>");
out.println("	<script src='assets/js/rickshaw/rickshaw.min.js'></script>");
out.println("	<script src='assets/js/raphael-min.js'></script>");
out.println("	<script src='assets/js/morris.min.js'></script>");
out.println("	<script src='assets/js/toastr.js'></script>");
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
