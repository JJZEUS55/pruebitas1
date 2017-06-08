/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Agregar al body <body onLoad="setInterval('CargarChat()',1000);">

var Bandera=0;
var contador=0;
function MandarMensaje()
{
    cosa=$("#CajaChat").text();
    var caja=document.getElementById("CajaChat");
    text=caja.value;
    //alert("Holi"+text);
}
function CargarChat()
{
    datos="";
    if(Bandera===0)
    {
        
    }
    setTimeout(function()
    {
    $.ajax({
        url: 'ServChat',
        method: 'POST',
        data: datos,


        error: function()
        {
            //alert($("input#username").val()),
            alert("A ocurrido un error!");
        },
        success: function(response)
        {
                
                //alert(response);
                var $repuesta= $(response);
                //lert("Khe?")
                //Agregar User
                //neonChat.addUser('group-1','El Macho','busy',true)
                        
                if(contador===0)
                neonChat.pushMessage('ui-id-1',"Hola!!",'yo',new Date(),true,true);
                if(contador===1)
                neonChat.pushMessage('ui-id-1',"¿Ya esta esta el trabajo?",'yo',new Date(),true,true);
                if(contador===2)
                neonChat.pushMessage('ui-id-1',"mandalo cuando puedas",'yo',new Date(),true,true);
                if(contador===2)
                neonChat.pushMessage('ui-id-1',"Hata luego",'yo',new Date(),true,true);
                contador++;
                
                //a
                //alert($repuesta.filter("#PrimeraParte").text());
                //var $PrimPart = $repuesta.filter("#ModuloChat");
                //$("#ModuloChat").replaceWith($PrimPart);
                //$("#ModuloChat").append($PrimPart);
                
          

                
        }
    });
    
    }, 650);
}