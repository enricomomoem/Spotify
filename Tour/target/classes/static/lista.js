const apiUrl = 'http://localhost:9003/api/listaTour';

// Funzione per ottenere i dati dall'API e popolare la tabella
async function caricaDati() {
    try {
        const response = await fetch(apiUrl);
        const dati = await response.json();

        const tbody = document.getElementById('dati-tabella').getElementsByTagName('tbody')[0];

        // Itera sui dati e aggiungi una riga per ciascuno
        dati.forEach(dato => {
            const row = document.createElement('tr');
            row.innerHTML = `
                <td>${dato.tour_id}</td>
                <td>${dato.nome}</td>
                <td>${dato.tipologia}</td>
                <td>${dato.posti_totali}</td>
                <td>${dato.disponibilita}</td>
            `;
            tbody.appendChild(row);
        });
    } catch (error) {
        console.error('Errore nel caricamento dei dati:', error);
    }
}

// Chiama la funzione per caricare i dati al caricamento della pagina
window.onload = caricaDati;