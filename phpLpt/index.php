<!DOCTYPE html>
<html>
<body>
    <!-- By Heidi Lilja, NTK20SP -->
<!-- formi jolla saadaan eri tiedot esille -->
<form action="receiver.php" method="post">
Kirjoita komento <input type="text" name="komento"><br>
<input type="submit">
</form>

</body>
</html>
<?php
// käyttöohjeet
echo "Kirjoita toiminto. Tyhjä näyttää kaikki tuotteet.\n";
echo "K1 = Kategoria 1,K2= Kategoria 2, K3 = Kategoria 3.\n";
echo "Etsi ID:llä (1-10).\n";
echo"Etsi alle 50 euroa maksavat tuotteeet komennolla alle50.\n";
?>
