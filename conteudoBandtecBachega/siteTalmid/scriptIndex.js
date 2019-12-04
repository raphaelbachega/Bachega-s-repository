

function validarlogin(){
    var valorlogin = login.value;
    if(valorlogin.indexOf('@') > 1 && valorlogin.indexOf('@') <1){
        alert('Padrão de E-mail inválido.')
        
    }
}