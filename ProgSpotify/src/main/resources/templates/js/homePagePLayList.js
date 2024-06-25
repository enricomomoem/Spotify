

function prendiBrani(){
    if(localStorage.length!=0){
        braniPerPlayList=JSON.parse(localStorage.getItem("braniPlayList"))
    }
    let boxContainer=document.querySelector("#tableBody");
    
    let brani=[];

    const URLBrani="http://localhost:9047/api/homePageUser/brano";

    fetch (URLBrani) 
    .then(rispostaDelServer =>{
        console.log(rispostaDelServer);
        return rispostaDelServer.json();
    })
    .then(
        /**
         * 
         * @param {Array} datiVeri
        */
       datiVeri =>{
        console.log(datiVeri);
        brani=datiVeri;

        for(let i=0;i<datiVeri.length; i++){
            boxContainer.appendChild(creaTable(datiVeri[i]));
        }

    })
}

let listaBrani=document.querySelector("#listaBrani");

window.addEventListener("DOMContentLoaded",prendiBrani);

function stampaListaBrani(){
    let totale=0;
    //Questa funzione legge la local storage
    //prodottiCarrello è un array di oggetti
    let braniLista=JSON.parse(localStorage.getItem("#listaBrani"));

    braniLista.forEach(brano => {
        listaBrani.innerHTML += `<li> ${brano.titolo} - ${brano.artista}- ${brano.album}- ${brano.genere} </li>`;

        totale += Number(brano.title);
    });

    grandTotale.innerHTML="Canzoni aggiunte: "+totale.toFixed(2) ; 

}

let braniPerPlay=[];

function creaTable(brano){
   
    let row=document.createElement("tr");
  
    
    row.innerHTML=`
        <td>${brano.id}</td>
        <td>${brano.titolo}</td>
        <td>${brano.artista}</td>
        <td>${brano.album}</td>
        <td>${brano.genere}</td>
        <td>${brano.durata}</td>
        `;
    
        

    let button=document.createElement("button");
    button.addEventListener("click",function(){
        //questa è la funzione che aggiunge al carrello
        braniPerPlay.push(brano);
        let branoPJSON= JSON.stringify(braniPerPlay);
        localStorage.setItem("listaBrani",branoPJSON);
    })

    button.innerHTML="Aggiungi nella PlayList";
    row.appendChild(button);

    return row;
}

window.addEventListener("DOMContentLoaded", stampaListaBrani)


btnCreaPlayList.addEventListener("click",creaPlaylist);



