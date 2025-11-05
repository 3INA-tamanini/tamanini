const bottone = document.querySelector("#sfida");
const sasso = document.querySelector("#sasso");
const carta = document.querySelector("#carta");
const forbice = document.querySelector("#forbice");
const messaggio = document.querySelector("#messaggio");

bottone.addEventListener("click",sfida, false);
sasso.addEventListener("click",sceltaSasso,false);
carta.addEventListener("click",sceltaCarta,false);
forbice.addEventListener("click",sceltaForbice,false);

var sceltaUtente = 0;

function sceltaSasso(){
    sceltaUtente = 1;
    sasso.style.border = "2px solid red";
    carta.style.border = "1px solid gray";
    forbice.style.border = "1px solid gray";
    messaggio.innerHTML = "";
}

function sceltaCarta(){
    sceltaUtente = 2;
    sasso.style.border = "1px solid gray";
    carta.style.border = "2px solid red";   
    forbice.style.border = "1px solid gray";
    messaggio.innerHTML = "";
}

function sceltaForbice(){
    sceltaUtente = 3;
    sasso.style.border = "1px solid gray";
    carta.style.border = "1px solid gray";
    forbice.style.border = "2px solid red";    
    messaggio.innerHTML = "";
}

function sfida()
{

    //scelta casuale del PC
    let sceltaPC = Math.floor(Math.random()*3+1);

    //compongo il messaggio con le scelte utente/pc
    switch (sceltaUtente)
    {
        case 1:
            messaggio.innerHTML = "Utente ha scelto SASSO ";
            break;
        case 2:
            messaggio.innerHTML = "Utente ha scelto CARTA ";
            break;       
        case 3:
            messaggio.innerHTML = "Utente ha scelto FORBICE ";
            break;                     
    }
 
    switch (sceltaPC)
    {
        case 1:
            messaggio.innerHTML += "- Il PC ha scelto SASSO";
            break;
        case 2: 
            messaggio.innerHTML += "- Il PC ha scelto CARTA";
            break;
        case 3:
            messaggio.innerHTML += "- Il PC ha scelto FORBICE";
            break;                
    }
     

    //confronto gli esiti
    if (sceltaUtente == sceltaPC)   
    {
        messaggio.innerHTML += ": PAREGGIO"; 
    }

    if (sceltaUtente == 1 && sceltaPC == 2)   //sasso perde con carta
    {
        messaggio.innerHTML += ": VINCE PC"; 
    }

    if (sceltaUtente == 1 && sceltaPC == 3)   //sasso vince con forbice
    {
        messaggio.innerHTML += ": VINCE UTENTE"; 
    }    

    if (sceltaUtente == 2 && sceltaPC == 1)   //carta batte sasso
    {
        messaggio.innerHTML += ": VINCE UTENTE "; 
    }    
    
    if (sceltaUtente == 2 && sceltaPC == 3)   //carta perde con forbice
    {
        messaggio.innerHTML += ": VINCE PC"; 
    }      

    if (sceltaUtente == 3 && sceltaPC == 1)   //forbice perde con sasso
    {
        messaggio.innerHTML += ": VINCE PC"; 
    }     

    if (sceltaUtente == 3 && sceltaPC == 2)   //forbice vince con carta
    {
        messaggio.innerHTML += ": VINCE UTENTE"; 
    }         
}    