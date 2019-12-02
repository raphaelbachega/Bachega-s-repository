var contador =0;

function slideshow(){
    var imagens = document.getElementsByClassName("slideslide");

    for(var indice =0; indice < imagens.length;indice++){
        imagens[indice].style.display ='none';
    }
    contador++;
    if(contador < imagens.length){
        contador = 1;
    }
    imagens[contador -1].style.display = 'block';
    setTimeout(slideshow(), 3000);

}