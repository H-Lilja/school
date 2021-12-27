
package harjotukset1;

/**
 *
 * @author heidi
 */
// importataan matikka ja skanneri tänne
import java.lang.Math.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Harjotukset1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // T1 alkaa tästä
        int x1,x2,y1,y2;
        
        double vali;
        // alustetaan skanneri
       Scanner sc = new Scanner(System.in);
       // Kysytään pisteet
       System.out.println("Anna x1");
       x1 = sc.nextInt();
          System.out.println("Anna y1 ");
       y1 = sc.nextInt();
          System.out.println("Anna x2 ");
       x2 = sc.nextInt();
          System.out.println("Anna y2");
       y2 = sc.nextInt();
       // lasketaan väli
       vali=Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
       // tulostetaan välimatka
       
        System.out.println("Välimatka pisteiden välillä"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+vali);

       // T1 loppuu tähän ja T2 alkaa tästä
 

       // T2 loppuu tähän ja T3 alkaa
       
           int numero1;
          System.out.println("Anna numero: ");
          numero1 = sc.nextInt();
          System.out.println("Jaolliset numerot ovat: ");

          for(int i = 1; i<numero1;i++)
          {
              if(numero1 % i ==0)
              {
                System.out.println(i);
              }
          }
          
         // T3 loppuu tähän ja T4 alkaa
          System.out.println("Anna numero: ");
         int amount =sc.nextInt();
         int[] notes = new int[]{ 100, 50, 20, 10, 5};
        int[] noteCounter = new int[5];
      
        
        for (int i = 0; i < 5; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
      
        
        System.out.println("Currency Count ->");
        for (int i = 0; i < 5; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
        // T4 loppuu ja T5 alkaa
        int number = 1 + (int)(100
                               * Math.random());
    
        int t, guess;
 
        System.out.println(
            "A number is chosen"
            + " between 1 to 100."
            + "Guess the number!");

        do{
 
            System.out.println(
                "Guess the number:");
 
            // Take input for guessing
            guess = sc.nextInt();
 
            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Congratulations!"
                    + " You guessed the number.");
                break;
            }
            else if (number > guess) {
                System.out.println(
                    "The number is "
                    + "greater than " + guess);
            }
            else if (number < guess) {
                System.out.println(
                    "The number is"
                    + " less than " + guess);
            }
        }
        while(number!=guess);
 
     
        // T5 loppuu tähän ja T6 alkaa
        int sekunnit;
       System.out.println("Anna sekunnit");
        sekunnit = sc.nextInt();
        int[] seconds = new int[]{ 3136000, 86400, 3600, 60, 1};
        String[] paevat = new String []{"Vuosia: ","Päiviä:","Tunteja:","Minuutteja","Sekunnit:"};
        int[] vuosiCounter = new int[5];
      
        
        for (int i = 0; i < 5; i++) {
            if (sekunnit >= notes[i]) {
                vuosiCounter[i] = sekunnit / seconds[i];
                sekunnit = sekunnit - vuosiCounter[i] * seconds[i];
            }
        }
      
        
        System.out.println("Sekunnit ->");
        for (int i = 0; i < 5; i++) {
            if (vuosiCounter[i] != 0) {
                System.out.println(paevat[i] + " : "
                    +vuosiCounter[i]);
            }
        }
        //T6 loppuu tähän ja T7 alkaa
          System.out.print("Anna Sivu1: ");
             int s1 = sc .nextInt();
            System.out.print("Anna sivu2: ");
            int s2 = sc.nextInt();
            System.out.print("Anna sivu3: ");
            int s3 = sc.nextInt();

        System.out.print("Näistä tulee kolmio: " + isValidTriangle(s1, s2, s3));
        t8();
 }
     public static boolean isValidTriangle(int a, int b, int c) {
    return (a + b > c && b + c > a && c + a > b);
 }
     // Tähän loppuu T7 ja alkaa T8
       public static void t8()
    {
        Scanner sc = new Scanner(System.in);

        int rows,columns;
        
        System.out.print("Anna Sivukoko: ");
        rows = sc.nextInt();
        System.out.print("Anna leveys: ");
        columns = sc.nextInt();
        
        print_rectangle(rows, columns);
    }
   static void print_rectangle(int k, int l)
    {
        int a, b;
 
        // Nested for loops for iterations
 
        // Outer loop for rows
        for (a = 1; a <= k; a++) {
            // Inner loop for columns
            for (b = 1; b <= l; b++) {
                // Condition check using logical OR operator
                // over rows and columns positions
                // if found at circumference of rectangle
                if (a == 1 || a == k || b == 1 || b == l)
 
                    // Print the star pattern
                    System.out.print("*");
                else
 
                    // Rest inside square print the empty
                    // spaces
                    System.out.print(" ");
            }
 
            // By now we are done with only 1 row so
            // New line
            System.out.println();
        }
        t9();
    }
   // Tähän loppuu T8 ja alkaa T9
   
         public static void t9()
    {
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the height of tree : ");
        int h = sc.nextInt();
            for(int i = 1;i <= h;i++){
            for(int j = h-i;j > 0;j--){
              System.out.print(" ");
                 }
             for(int k = 1;k <= i;k++){
              System.out.print("* ");
      }
      System.out.println();
    }
    }
   
}
