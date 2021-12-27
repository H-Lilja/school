<!DOCTYPE html>
<html>
<style>
    /* tyylitellään tuotetaulukko */
table, th, td {
  border:1px solid black;
}
</style>

</html>
<?php
include("tuotteet.php");

//Tulostetaan kategoriat
echo "<table>";
echo "<tr>";
echo "<td>ID</td>";
echo "<td>Nimi</td>";
echo "<td>Hinta</td>";
echo "<td>Kategoria</td>";
echo "<td>Paino(KG)</td>";
echo "<td>Kuva</td>";
echo "<tr>";

//Tulostetaan tuotteiden tiedot arraysta
foreach ($tuotteet as $t1) {
 
    echo" </tr>";
    //echo '<tr>';
    foreach ($t1 as $key1 => $value1) {
        if($value1 == "Kuva")
        {
            echo "<td>";
            // Jostain syystä kuva ei halua toimia, mutta tämän pitäisi tulostaa 
            // tuotekuva
            echo  '<img src= "' . $value1 . '"' ;
            echo "<td>";

        }
        else{
        echo '<td>' . $value1 . '</td>';    
        }
    }
    echo '<tr>';
}
echo "</table>";
?>