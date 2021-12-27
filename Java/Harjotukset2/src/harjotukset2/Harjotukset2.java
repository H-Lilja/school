
package harjotukset2;

import java.lang.Math.*;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
/**
 *
 * @author heidi
 */
public class Harjotukset2 {

   
    public static void main(String[] args) {
        //T10 alkaa tästä
       Scanner sc = new Scanner(System.in);
       int numero=1,kaannetty = 0;
       System.out.println("Anna numero");
       numero = sc.nextInt();
       
       while(numero!=0){
           
           int luku = numero %10;
           kaannetty = kaannetty*10 + luku;
           numero /=10;
       }
        System.out.println("Käännettynä se on " + kaannetty);
        
        // T10 loppuu ja T11 alkaa
        int numero2;
        
       System.out.println("Anna numero");
       numero2 = sc.nextInt();
       int length = String.valueOf(numero2).length();
       String temp= Integer.toString(numero2);
       int [] numlista = new int[temp.length()];

       for(int i=0; i< temp.length(); i++)
       {
           numlista[i]=temp.charAt(i)-'0';
       }
        //Tämän vois varmaan tehä ammattimaisemmin throw exception jutuilla
       // mutta en ole varma niiden käytöstä joten mnennään näillä :)
       if(length !=5)
        {
           System.out.println("Pituus ei ole 5 numeroa!");
        }
       else if(temp.matches("[a-zA-Z]+"))
       {
           System.out.println("Sisältää muutakin kuin numeroita!");

       }
       else
       {
           System.out.println("Hyvältä näyttää!");

       }
       //T11 loppuu tähän ja T12 alkaa
       String [][] jono={
           {"00","01","02","03","04","05","06","07","08","09"},
           {"10","11","12","13","14","15","16","17","18","19"}
               
       };
        System.out.println(jono[1][9]);
        
        //T12 loppuu tähän ja T13 alkaa
       //Tällä tyylillä tehtynä arrayssa voi olla tuplia samasta numerosta
       // joten alle 5 arvoisten numeroiden määrä vaihtelee joka kierroskella.
       // Jos tuplia ei sallittaisi, pitäisi paikkoja ja arvoja silloin olla 4
        Random rnd = new Random();

        int[] nums = new int[100];

        for(int i=0; i<100; i++)
        {
            nums[i]=rnd.nextInt(100);
        }

        int index=0;
        for(int i=0;i<100;i++)
        {
            
            if(nums[i]<5)
            {
                
                System.out.println("Indeksipaikka on:" + index);

            }
            index++;
        }
        //T13 loppuu ja T14 alkaa
        int[] nums2 = new int[100];
        int[] nums3 = new int[100];
        int[] nums4 = new int[100];

        for(int i=0; i<100; i++)
        {
            nums2[i]=rnd.nextInt(50+50)-50;
        }
        int j=0,k=0;
          for(int i=0; i<100; i++)
        {
            if(nums2[i]<0){
                nums3[j]=nums2[i];
                j++;
            }
            else{
                nums4[k]=nums2[i];
                k++;
            }
        }
        
          System.out.println("Amount of numbers in negative array " +j);
          System.out.println("Amount of numbers in positive array " +k);

        //T14 loppuu, T15,T16,T17 on oma luokkansa
        
    }
}

