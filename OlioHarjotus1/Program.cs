using System;
using static System.Console;

namespace ChristmasTree
{
    class Program
    {
        static void Main(string[] args)
        {
            //Kysytään käyttäjältä input
            WriteLine(" Enter Height between 6-12: ");
            int korkeus =Convert.ToInt32( ReadLine());
            PrintChristmasTree(korkeus);
        }

        // Toiminta:
        //   Metodi tulostaa halutun korkuisen joulukuusen.
        // Parametrit:
        //   height = joulukuusen korkeus riveinä
        static void PrintChristmasTree(int height)
        {
            // Jalkalaskuri laskee missä välissä pitää katkaista kuusikoodi ja tehdä jalka
            int jalkaLaskuri = height;
            int valilyonnit = 9;
            int tahdet = 1;
            if (height <= 5)
            {
                // Jos 5 yrittää tehdä kuusen, ei pysty.
                WriteLine("Can´t print");
            }
            else
            {
                for (int i = 0; i < height; i++)
                {
                    if (jalkaLaskuri > 2)
                    {
                        // tulostaa niin monta välilyöntiä kuin valilyonnin arvo on
                        PrintChars(valilyonnit, ' ', false);
                        PrintChars(tahdet, '*', true);
                        // jokaisella kierroksella välilyöntejä vähennetään yhdellä ja tähtiä lisätään kahdella
                        valilyonnit = valilyonnit - 1;
                        tahdet = 2 + tahdet;
                        // jalkalaskuria vähennetään 1
                        jalkaLaskuri = jalkaLaskuri - 1;

                        

                    }
                    else
                    {
                        // tämä tulostaa jalan
                        PrintChars(8, ' ', false);
                        PrintChars(3, '*', true);
                    }
                }
            }                        
            // TOTEUTA TÄHÄN ALGORITM
        }

        // Toiminta:
        //   Metodi tulostaa yksittäistä merkkiä tietyn määrän. Metodi voi myös tulostaa rivinvaihdon, jos halutaan.
        // Parametrit:
        //   count = tulostettavien merkkien lukumäärä
        //   printChar = tulostettava merkki
        //   newLine = tulostetaanko lopuksi rivinvaihto, oletuksena true
        static void PrintChars(int count, char printChar, bool newLine = true)
        {      
                                  
         
         for (int i = 0; i < count; i++)
         {
            Write(printChar);
         }
            
        if (newLine)   // Huom. pelkkä newLine tuottaa saman totuusarvon kuin lauseke newLine == true
        {
            WriteLine();
        }
           
        }
    }
}
