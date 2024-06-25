

function prendiPlayList(){
    if(localStorage.length!=0){
        braniPlayList=JSON.parse(localStorage.getItem("playList"));
    }
    let boxContainer=document.querySelector("#tableBody");
    
    let playlist;

    const URLPlayList="http://localhost:9047/api/homePageUser/playLista";

    fetch (URLPlayList) 
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
        playlist=datiVeri;

        for(let i=0;i<datiVeri.length; i++){
            boxContainer.appendChild(creaTable(datiVeri[i]));
        }

    })
}



window.addEventListener("DOMContentLoaded",prendiPlayList);



let braniPerPlay=[];



function creaTable(playlist){
   
    let row=document.createElement("tr");
  
    
    row.innerHTML=`
        <td>${playlist.id}</td>
        <td>${playlist.playListNome}</td>
        `;
    
        

    let button=document.createElement("button");
    button.addEventListener("click",function(){
        //questa è la funzione che aggiunge al carrello
        braniPerPlay.push(playlist);
        let playListJSON= JSON.stringify(braniPerPlay);
        localStorage.setItem("playList",playListJSON);
    })

   

    return row;
}

let listaBrani=document.querySelector("#listaPlaylist");





