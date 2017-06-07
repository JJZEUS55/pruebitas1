/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




function AgregarMarco ()
{
    //DivPrimeraParte=;
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
                //alert(response);
                var $repuesta= $(response);
                //$repuesta.
                //alert($repuesta.filter("#PrimeraParte").text());
                var $PrimPart = $repuesta.filter("#PrimeraParte");
                $("#PrimeraParte").append($PrimPart);
                
            var $SegPart = $repuesta.filter("#SegundaParte");
                $("#SegundaParte").append($SegPart);
                //status.trim();
                //alert($status.f);
                //DivPrimeraParte.innerHTML(status);
                var $SegPart = $repuesta.filter("#TercerParte");
                $("#TercerParte").append($SegPart);   
             var $SegPart = $repuesta.filter("#CuartaParte");
                $("#CuartaParte").append($SegPart);   
                
                
                

                
        }
    });
    
    }, 650);
    
    
}