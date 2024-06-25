class UtenteLog{
    constructor (email,password)
    {
       
        this.email=email;
      
        this.password=password;
    }
}

let demo=document.querySelector("#demo")

let mioForm=document.querySelector("#mioForm")

function validateLog(){
    

    let password=document.querySelector("#password").value;
    let email=document.querySelector("#email").value;


    if(email=="" ||password==""){
        event.preventDefault();
        demo.innerHTML("Hai dimenticato di compilare un campo")
    }else{
        let utenteLog=new UtenteLog(email,password);
        console.log(utente);
        alert("Registrazione completata")
        registraUtente(utenteLog);
        
    }
}

function logUtente(utente){
    let logJSON=JSON.stringify(utente);
    console.log(logJSON);
}


loginForm.addEventListener("submit",validateLog)