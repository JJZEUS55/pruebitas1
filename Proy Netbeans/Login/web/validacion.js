
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
    //window.location ="ServRegistroUser?"+$("#Registrar").serialize();
   // alert("Hola");
   ///*
    alert($("#Registrar").serialize());
    setTimeout(function()
    {
    $.ajax({
        url: 'ServRegistroUser',
        method: 'POST',
        data: $("#Registrar").serialize(),


        error: function()
        {
            //alert($("input#username").val()),
            alert("A ocurrido un error!");
        },
        success: function(response)
        {
                // Login status [success|invalid]
                //alert("Algo");
                alert(response);
                var $repuesta= $(response);
                var status = $repuesta.filter("#status").text();
                if(status==="Hecho"){
                    alert("registro Exitoso");
                    window.location.href="inicio_sesion.html"
                    //return;
                }
                if(status==="UsuarioExistente"){
                    alert("Usuario Ya Existe");
                }
                
                

                
        }
    });
    
    }, 650);
  //  */
}