function validacion() {
    valor = document.getElementById("Name_P").value;
    if( valor == null || valor.length ==0 )
    {
        alert('[ERROR] El campo debe tener un nombre');
        return false;
        
    }
    valor = document.getElementById("Descripcion").value;
    if( valor == null || valor.length ==0 )
    {
        alert('[ERROR] El campo debe tener una Descripcion');
        return false;
    }
    
    valor = document.getElementById("Duracion").value;
    if( valor == null || !/^([0-9])*$/.test(valor))
    {
        alert('[ERROR] El campo duracion no puede estar vacio y debe contener un numero');
        return false;
    }
    
    valor = document.getElementById("precio").value;
    if( valor == null || !/^([0-9])*$/.test(valor))
    {
        alert('[ERROR] El campo precio no puede estar vacio y debe contener un numero');
        return false;
    }
    
    if(!document.getElementById("cb1_1").checked && !document.getElementById("cb1_2").checked && !document.getElementById("cb1_3").checked && !document.getElementById("cb1_4").checked && !document.getElementById("cb1_5").checked && !document.getElementById("cb1_6").checked && !document.getElementById("cb1_7").checked && !document.getElementById("cb1_8").checked && !document.getElementById("cb1_9").checked && !document.getElementById("cb1_10").checked){
        alert('[ERROR] se debe seleccionar al menos un tipo');
        return false;
    }
    
    if(!document.getElementById("cb2_1").checked && !document.getElementById("cb2_2").checked && !document.getElementById("cb2_3").checked && !document.getElementById("cb2_4").checked && !document.getElementById("cb2_5").checked && !document.getElementById("cb2_6").checked && !document.getElementById("cb2_7").checked && !document.getElementById("cb2_8").checked && !document.getElementById("cb2_9").checked && !document.getElementById("cb2_10").checked){
        alert('[ERROR] se debe seleccionar al menos un requerimiento');
        return false;
    }
    
    
    alert('[Correcto]');
    return true;
}