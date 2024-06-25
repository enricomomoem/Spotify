class Utente{
    constructor (name,email,telefono,password)
    {
        this.name=name;
        this.email=email;
        this.telefono=telefono;
        this.password=password;
    }
}

let mioForm=document.querySelector("#mioForm");
let mioForm2=document.querySelector("#mioForm2");
let demo=document.querySelector("#demo");

const URLUtenti="http://localhost:9047/api/mostraUtenti"



function validateReg(){
    
    alert("Sto inviando il form");

    let name=document.querySelector("#name").value;
    let password=document.querySelector("#password").value;
    let email=document.querySelector("#email").value;
    let telefono=document.querySelector("#telefono").value;

    if(name=="" || email=="" || telefono=="" || password==""){
        event.preventDefault();
        demo.innerHTML("Hai dimenticato di compilare un campo")
    }else{
        let utente=new Utente(name,telefono,email,password);
        console.log(utente);
        alert("Registrazione completata")
        registraUtente(utente);
        
    }
}

function registraUtente(utente){
    let utenteJSON=JSON.stringify(utente);
    console.log(utenteJSON);
}





mioForm.addEventListener("submit",validateReg)
mioForm2.addEventListener("submit")
