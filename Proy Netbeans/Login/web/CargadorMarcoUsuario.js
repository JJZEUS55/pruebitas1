/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




function AgregarMarco ()
{
    DivPrimeraParte=document.getElementById("PrimeraParte");
    datos="";
    setTimeout(function()
    {
    $.ajax({
        url: 'ServMarcoGenerico',
        method: 'POST',
        data: datos,


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
                DivPrimeraParte
                var status = $repuesta.filter("#status").text();
                if(status==="Hecho"){
                    alert("registro Exitoso");
                   
                    //return;
                }
                if(status==="UsuarioExistente"){
                    alert("Usuario Ya Existe");
                }
                if(status==="CorreoExistente"){
                    alert("Usuario Ya Existe");
                }
                
                

                
        }
    });
    
    }, 650);
    
    
}