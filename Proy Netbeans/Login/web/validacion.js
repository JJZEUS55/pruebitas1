
function validacion()
{

    valor = document.getElementById("Name_P").value;
    if( valor === null || valor.length ===0 )
    {
        alert('[ERROR] Nombre no puede estar vacio');
        return false;
        
    }
    
    valor = document.getElementById("Apellido_P").value;
    if( valor === null || valor.length ===0 )
    {
        alert('[ERROR] Apellido no puede estar vacio');
        return false;
    }
    
    valor = document.getElementById("Correo_P").value;
    if( !(/\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)/.test(valor)) ) {
        alert('[ERROR] Direccion de correo no valida');
        return false;
    }
    
    valor = document.getElementById("Usuario_P").value;
    if( valor == null || valor.length ==0 )
    {
        alert('[ERROR] Usuario no puede estar vacio');
        return false;
    }
    
    if( valor.length < 8 )
    {
        alert('[ERROR] El usuario debe contener al menos 8 caracteres');
        return false;
    }
    
    valor = document.getElementById("Pass_P").value;
    if( valor == null || valor.length ==0 )
    {
        alert('[ERROR] Contraseña no puede estar vacio');
        return false;
    }
    if( valor.length < 8 )
    {
        alert('[ERROR] La contraseña debe contener al menos 8 caracteres');
        return false;
    }

    valor2 = document.getElementById("RPass_P").value;
    if (valor != valor2)
    {
        alert('[ERROR] las contraseñas no coinciden');
        return false;
    }
   // alert("Hola");
    alert($("#Registrar").serialize());
    $.ajax({
        url: 'ServRegistroUser',
        method: 'POST',
        data: $("#Registrar").serialize(),

        //dataType: 'json',
        /*data: {
                username: $("input#username").val(),                                                        
                password: $("input#password").val(),
        },*/

        error: function()
        {
            //alert($("input#username").val()),
            alert("A ocurrido un error!");
        },
        success: function(response)
        {
                // Login status [success|invalid]
                alert(response);
                var $repuesta= $(response);
                var login_status = $repuesta.filter("#status").text();

                //alert("Va shida la cosa" + $repuesta.filter("#status").text());

                
                        // If login is invalid, we store the 
                        if(login_status === 'invalid')
                        {
                                $(".login-page").removeClass('logging-in');
                                neonLogin.resetProgressBar(true);
                        }
                        else
                        if(login_status === 'success')
                        {
                                // Redirect to login page
                                setTimeout(function()
                                {
                                        var redirect_url = "";

                                        //if(response.redirect_url && response.redirect_url.length)
                                        //{
                                                redirect_url = $repuesta.filter("#redirec").text();
                                        //}

                                        window.location.href = redirect_url;
                                }, 400);
                        }

                
        }
    });
}