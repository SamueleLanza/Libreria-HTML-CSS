CHIEDI A CHATGPT DI RIMUOVERE LE DIV CHE HANNO GENERI CHE NON STANNO PIÙ NELLA UL

<!DOCTYPE html>
<html lang="it">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Catalogo</title>
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="stylesheet" href="styles.css" />
  </head>
  <body>
    <!-- Navbar -->
    <nav>
      <!-- style="display: flex; justify-content: space-between; padding: 1rem; background-color: #f8f9fa;" -->
      <div>
        <!-- style="display: flex;" -->
        <a href="#">Home</a>
        <!-- style="margin-right: 1rem;" -->
        <a href="login.html">Accedi</a>
        <a href="registrati.html">Registrati</a>
        <a href="#">Chi siamo</a>
        <a href="#ciao">Contatti</a>
      </div>
    </nav>

    <header>
      <h1>Arcadia dei Libri</h1>
      <h2>Catalogo</h2>
    </header>

    <div>
        <ul>
            <li><a href="#azione">Azione</a></li>
            <li><a href="#avventura">Avventura</a></li>
            <li><a href="#cucina">Libri di cucina</a></li>
            <li><a href="#horror">Horror</a></li>
            <li><a href="#libri-per-bambini">Libri per bambini</a></li>
            <li><a href="#romanzi-rosa">Romanzi rosa</a></li>
            <li><a href="#storici">Storici</a></li>
            <li><a href="#gialli">Romanzi gialli</a></li>        
        </ul>
    </div>

    <div id="azione" class="genere">
        <h3>Azione</h3>
        <!-- descrizione catchphrase della categoria azione -->
        <p>Libri ricchi di avventura e colpi di scena, che vi terranno con il fiato sospeso fino all'ultima pagina.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/azione1.jpg" alt="azione1" />
            <p>Titolo: Il tesoro perduto<br>Autore: Mario Rossi<br>Trama: Un gruppo di esploratori si mette alla ricerca di un antico tesoro nascosto in una remota isola del Pacifico.</p>
        </div>
        <div>
            <img src="immagini/azione2.jpg" alt="azione2" />
            <p>Titolo: La spada di fuoco<br>Autore: Anna Verdi<br>Trama: Un giovane guerriero si mette alla ricerca di una spada magica che gli permetterà di sconfiggere il malvagio signore dei demoni.</p>
        </div>
        <div>
            <img src="immagini/azione3.jpg" alt="azione3" />
            <p>Titolo: La città perduta<br>Autore: Carlo Bianchi<br>Trama: Un archeologo si mette alla ricerca di una città scomparsa nel cuore della giungla amazzonica.</p>
        </div>
    </div>
    <div id="avventura" class="genere">
        <h3>Avventura</h3>
        <!-- descrizione catchphrase della categoria avventura -->
        <p>Libri pieni di avventure emozionanti e viaggi straordinari, che vi porteranno in luoghi lontani e misteriosi.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/avventura1.jpg" alt="avventura1" />
            <p>Titolo: L'isola misteriosa<br>Autore: Giulia Bianchi<br>Trama: Un gruppo di naufraghi si ritrova su un'isola deserta e deve lottare per sopravvivere.</p>
        </div>
        <div>
            <img src="immagini/avventura2.jpg" alt="avventura2" />
            <p>Titolo: La ricerca del tesoro<br>Autore: Marco Verdi<br>Trama: Un giovane avventuriero intraprende un viaggio per trovare un leggendario tesoro sepolto.</p>
        </div>
        <div>
            <img src="immagini/avventura3.jpg" alt="avventura3" />
            <p>Titolo: La montagna proibita<br>Autore: Laura Rossi<br>Trama: Un gruppo di alpinisti si cimenta nella scalata di una montagna pericolosa e misteriosa.</p>
        </div>
    </div>
    <!-- cucina -->
    <div id="cucina" class="genere">
        <h3>Libri di cucina</h3>
        <!-- descrizione catchphrase della categoria cucina -->
        <p>Libri ricchi di ricette e consigli per preparare piatti deliziosi e raffinati, che vi faranno scoprire i segreti della cucina di tutto il mondo.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/cucina1.jpg" alt="cucina1"/>
            <p>Titolo: La cucina italiana<br>Autore: Mario Rossi<br>Trama: Un viaggio alla scoperta dei piatti più famosi e gustosi della tradizione culinaria italiana.</p>
        </div>
        <div>
            <img src="immagini/cucina2.jpg" alt="cucina2"/>
            <p>Titolo: La cucina francese<br>Autore: Anna Verdi<br>Trama: Un viaggio alla scoperta dei piatti più raffinati e sofisticati della tradizione culinaria francese.</p>
        </div>
        <div>
            <img src="immagini/cucina3.jpg" alt="cucina3"/>
            <p>Titolo: La cucina giapponese<br>Autore: Carlo Bianchi<br>Trama: Un viaggio alla scoperta dei piatti più sani e leggeri della tradizione culinaria giapponese.</p>
        </div>
    </div>
    <!-- libri di fotografia -->
    <div id="libri-di-fotografia" class="genere">
        <h3>Libri di fotografia</h3>
        <!-- descrizione catchphrase della categoria libri di fotografia -->
        <p>Libri ricchi di immagini straordinarie e suggestive, che vi faranno scoprire i segreti della fotografia e vi porteranno in luoghi lontani e misteriosi.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/fotografia1.jpg" alt="fotografia1"/>
            <p>Titolo: Il mondo in bianco e nero<br>Autore: Giulia Bianchi<br>Trama: Un viaggio fotografico alla scoperta dei paesaggi più suggestivi e delle persone più affascinanti del mondo.</p>
        </div>
        <div>
            <img src="immagini/fotografia2.jpg" alt="fotografia2"/>
            <p>Titolo: Il mondo a colori<br>Autore: Marco Verdi<br>Trama: Un viaggio fotografico alla scoperta dei colori più vivaci e delle atmosfere più suggestive del mondo.</p>
        </div>
        <div>
            <img src="immagini/fotografia3.jpg" alt="fotografia3"/>
            <p>Titolo: Il mondo in bianco e nero<br>Autore: Laura Rossi<br>Trama: Un viaggio fotografico alla scoperta dei paesaggi più suggestivi e delle persone più affascinanti del mondo.</p>
        </div>
    </div>
    <!-- libri di viaggio -->
    <div id="#libri-di-viaggio" class="genere">
        <h3>Libri di viaggio</h3>
        <!-- descrizione catchphrase della categoria libri di viaggio -->
        <p>Libri ricchi di racconti e consigli per viaggiare in luoghi lontani e misteriosi, che vi faranno scoprire i segreti delle culture e delle tradizioni di tutto il mondo.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/viaggio1.jpg" alt="viaggio1"/>
            <p>Titolo: Il viaggio in India<br>Autore: Mario Rossi<br>Trama: Un viaggio alla scoperta dei luoghi più suggestivi e delle tradizioni più affascinanti dell'India.</p>
        </div>
        <div>
            <img src="immagini/viaggio2.jpg" alt="viaggio2"/>
            <p>Titolo: Il viaggio in Giappone<br>Autore: Anna Verdi<br>Trama: Un viaggio alla scoperta dei luoghi più affascinanti e delle tradizioni più antiche del Giappone.</p>
        </div>
        <div>
            <img src="immagini/viaggio3.jpg" alt="viaggio3"/>
            <p>Titolo: Il viaggio in Africa<br>Autore: Carlo Bianchi<br>Trama: Un viaggio alla scoperta dei luoghi più selvaggi e delle culture più antiche dell'Africa.</p>
        </div>
    </div>
    <!-- libri per bambini -->
    <div id="#libri-per-bambini" class="genere">
        <h3>Libri per bambini</h3>
        <!-- descrizione catchphrase della categoria libri per bambini -->
        <p>Libri ricchi di storie e personaggi fantastici, che vi faranno sognare e vi insegneranno i valori più importanti della vita.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/bambini1.jpg" alt="bambini1" />
            <p>Titolo: Il magico regno delle fate<br>Autore: Giulia Bianchi<br>Trama: Un viaggio alla scoperta del regno delle fate e delle creature magiche che lo popolano.</p>
        </div>
        <div>
            <img src="immagini/bambini2.jpg" alt="bambini2" />
            <p>Titolo: Il mistero del tesoro perduto<br>Autore: Marco Verdi<br>Trama: Un gruppo di giovani detective si mette alla ricerca di un antico tesoro nascosto in una remota isola del Pacifico.</p>
        </div>
        <div>
            <img src="immagini/bambini3.jpg" alt="bambini3" />
            <p>Titolo: Il viaggio nel tempo<br>Autore: Laura Rossi<br>Trama: Un gruppo di giovani esploratori si mette alla ricerca di un antico artefatto che permette di viaggiare nel tempo.</p>
        </div>
    </div>
    <!-- libri per ragazzi -->
    <div id="libri-per-ragazzi" class="genere">
        <h3>Libri per ragazzi</h3>
        <!-- descrizione catchphrase della categoria libri per ragazzi -->
        <p>Libri ricchi di avventure e misteri, che vi faranno scoprire il mondo e vi insegneranno i valori più importanti della vita.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/ragazzi1.jpg" alt="ragazzi1" />
            <p>Titolo: Il mistero del castello<br>Autore: Mario Rossi<br>Trama: Un gruppo di giovani detective si mette alla ricerca di un antico tesoro nascosto in un castello misterioso.</p>
        </div>
        <div>
            <img src="immagini/ragazzi2.jpg" alt="ragazzi2" />
            <p>Titolo: Il segreto della piramide<br>Autore: Anna Verdi<br>Trama: Un gruppo di giovani esploratori si mette alla ricerca di un antico artefatto nascosto in una piramide egizia.</p>
        </div>
        <div>
            <img src="immagini/ragazzi3.jpg" alt="ragazzi3" />
            <p>Titolo: Il tesoro del faraone<br>Autore: Carlo Bianchi<br>Trama: Un gruppo di giovani archeologi si mette alla ricerca di un antico tesoro nascosto in una tomba egizia.</p>
        </div>
    </div>
    <!-- gialli -->
    <div id="gialli" class="genere">
        <h3>Romanzi gialli</h3>
        <!-- descrizione catchphrase della categoria romanzi gialli -->
        <p>Libri ricchi di misteri e colpi di scena, che vi terranno con il fiato sospeso fino all'ultima pagina.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/gialli1.jpg" alt="gialli1" />
            <p>Titolo: Il mistero del lago<br>Autore: Giulia Bianchi<br>Trama: Un giovane detective si mette alla ricerca di un assassino che semina il terrore in una piccola cittadina di provincia.</p>
        </div>
        <div>
            <img src="immagini/gialli2.jpg" alt="gialli2" />
            <p>Titolo: Il segreto della villa<br>Autore: Marco Verdi<br>Trama: Un giovane investigatore si mette alla ricerca di un antico segreto nascosto in una villa abbandonata.</p>
        </div>
        <div>
            <img src="immagini/gialli3.jpg" alt="gialli3" />
            <p>Titolo: Il caso del miliardario scomparso<br>Autore: Laura Rossi<br>Trama: Un investigatore privato si mette alla ricerca di un miliardario scomparso nel nulla.</p>
        </div>
    </div>
    <!-- romanzi rosa -->
    <div id="romanzi-rosa" class="genere">
        <h3>Romanzi rosa</h3>
        <!-- descrizione catchphrase della categoria romanzi rosa -->
        <p>Libri ricchi di storie d'amore e passioni travolgenti, che vi faranno sognare e vi insegneranno i valori più importanti della vita.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/rosa1.jpg" alt="rosa1" />
            <p>Titolo: L'amore impossibile<br>Autore: Mario Rossi<br>Trama: Una giovane donna si innamora di un uomo misterioso e affascinante, ma il loro amore è ostacolato da segreti del passato.</p>
        </div>
        <div>
            <img src="immagini/rosa2.jpg" alt="rosa2" />
            <p>Titolo: Il segreto del cuore<br>Autore: Anna Verdi<br>Trama: Una giovane donna si innamora di un uomo misterioso e affascinante, ma il loro amore è ostacolato da segreti del passato.</p>
        </div>
        <div>
            <img src="immagini/rosa3.jpg" alt="rosa3" />
            <p>Titolo: Il bacio rubato<br>Autore: Carlo Bianchi<br>Trama: Una giovane donna si innamora di un uomo misterioso e affascinante, ma il loro amore è ostacolato da segreti del passato.</p>
        </div>
    </div>
    <!-- horror -->
    <div id="horror" class="genere">
        <h3>Horror</h3>
        <!-- descrizione catchphrase della categoria horror -->
        <p>Libri ricchi di suspense e colpi di scena, che vi terranno con il fiato sospeso fino all'ultima pagina.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/horror1.jpg" alt="horror1" />
            <p>Titolo: La casa maledetta<br>Autore: Giulia Bianchi<br>Trama: Un gruppo di amici si ritrova intrappolato in una casa maledetta e deve lottare per sopravvivere.</p>
        </div>
        <div>
            <img src="immagini/horror2.jpg" alt="horror2" />
            <p>Titolo: Il mostro della palude<br>Autore: Marco Verdi<br>Trama: Un gruppo di esploratori si mette alla ricerca di un mostro leggendario che si aggira per le paludi della Louisiana.</p>
        </div>
        <div>
            <img src="immagini/horror3.jpg" alt="horror3" />
            <p>Titolo: La notte dei morti viventi<br>Autore: Laura Rossi<br>Trama: Un gruppo di sopravvissuti si ritrova intrappolato in una città infestata da zombie e deve lottare per sopravvivere.</p>
        </div>
    </div>
    <!-- monografie -->
    <div id="monografie" class="genere">
        <h3>Monografie</h3>
        <!-- descrizione catchphrase della categoria monografie -->
        <p>Libri ricchi di informazioni e dettagli su un argomento specifico, che vi faranno scoprire i segreti di un mondo sconosciuto.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/monografie1.jpg" alt="monografie1" />
            <p>Titolo: La storia dell'arte<br>Autore: Mario Rossi<br>Trama: Un viaggio alla scoperta dei capolavori dell'arte e dei grandi artisti che li hanno creati.</p>
        </div>
        <div>
            <img src="immagini/monografie2.jpg" alt="monografie2" />
            <p>Titolo: La storia della musica<br>Autore: Anna Verdi<br>Trama: Un viaggio alla scoperta dei grandi compositori e dei generi musicali che hanno segnato la storia della musica.</p>
        </div>
        <div>
            <img src="immagini/monografie3.jpg" alt="monografie3" />
            <p>Titolo: La storia della scienza<br>Autore: Carlo Bianchi<br>Trama: Un viaggio alla scoperta dei grandi scienziati e delle scoperte scientifiche che hanno cambiato il mondo.</p>
        </div>
    </div>
    <!-- storici -->
    <div id="storici" class="genere">
        <h3>Storici</h3>
        <!-- descrizione catchphrase della categoria storici -->
        <p>Libri ricchi di informazioni e dettagli su un periodo storico specifico, che vi faranno scoprire i segreti di un'epoca lontana.</p>
        <!-- immagini di tre libri messi in riga con una breve descrizione sotto (titolo autore/ice trama)-->
        <div>
            <img src="immagini/storici1.jpg" alt="storici1" />
            <p>Titolo: La storia dell'antico Egitto<br>Autore: Giulia Bianchi<br>Trama: Un viaggio alla scoperta dei faraoni e delle piramidi che hanno segnato la storia dell'antico Egitto.</p>
        </div>
        <div>
            <img src="immagini/storici2.jpg" alt="storici2" />
            <p>Titolo: La storia dell'antica Roma<br>Autore: Marco Verdi<br>Trama: Un viaggio alla scoperta degli imperatori e dei monumenti che hanno segnato la storia dell'antica Roma.</p>
        </div>
        <div>
            <img src="immagini/storici3.jpg" alt="storici3" />
            <p>Titolo: La storia del Medioevo<br>Autore: Laura Rossi<br>Trama: Un viaggio alla scoperta dei cavalieri e dei castelli che hanno segnato la storia del Medioevo.</p>
        </div>
    </div>
    <!-- Footer -->
    <footer class="footer">
      <p>© 2024 JAITA123</p>
    </footer>
  </body>
</html>

