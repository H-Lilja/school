<?php
include("tuotteet.php");
// "Käännetään" tuottee JSONIKSI
$myJSON = json_encode($tuotteet, JSON_FORCE_OBJECT);

$varA = $_POST['komento'];
if (empty($_POST["komento"]))
{
    // Tulostaa taulukon kaikista tuotteista
    include "loppu.php";
}
elseif($varA == "K1")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["1"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["3"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["4"], JSON_FORCE_OBJECT);
}
elseif($varA == "K2")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["2"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["5"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["9"], JSON_FORCE_OBJECT);
}
elseif($varA == "K3")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["6"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["7"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["8"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["10"], JSON_FORCE_OBJECT);

}
elseif($varA == "alle50")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["1"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["2"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["5"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["6"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["8"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["9"], JSON_FORCE_OBJECT);
    echo json_encode($tuotteet["10"], JSON_FORCE_OBJECT);

}
elseif($varA == "1")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["1"], JSON_FORCE_OBJECT);
}
elseif($varA == "2")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["2"], JSON_FORCE_OBJECT);
}
elseif($varA == "3")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["3"], JSON_FORCE_OBJECT);
}
elseif($varA == "4")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["4"], JSON_FORCE_OBJECT);
}
elseif($varA == "5")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["5"], JSON_FORCE_OBJECT);
}
elseif($varA == "6")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["6"], JSON_FORCE_OBJECT);
}
elseif($varA == "7")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["7"], JSON_FORCE_OBJECT);
}
elseif($varA == "8")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["8"], JSON_FORCE_OBJECT);
}
elseif($varA == "9")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["9"], JSON_FORCE_OBJECT);
}
elseif($varA == "10")
{
    // Palauttaa tiedot JSON muotoisena objektina
    echo json_encode($tuotteet["10"], JSON_FORCE_OBJECT);
}
?>
