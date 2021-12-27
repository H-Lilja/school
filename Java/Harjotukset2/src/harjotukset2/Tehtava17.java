
package harjotukset2;

/**
 *
 * @author heidi
 */
import java.util.Scanner;

public class Tehtava17 {
       public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna numero 1: ");
        int n1 = sc.nextInt();
         System.out.println("Anna numero 2: ");
        int n2 = sc.nextInt();
         System.out.println("Anna numero 3: ");
        int n3 = sc.nextInt();
         System.out.println("Anna numero 4: ");
        int n4 = sc.nextInt();
         System.out.println("Anna numero 5: ");
        int n5 = sc.nextInt();
        
        int average= (n1+n2+n3+n4+n5)/5;
        System.out.println("Keskiarvo on: "+ average);
        
        int[] tehtavab = {1,2,3,4,5,6,7,8,9};
        osab(tehtavab);
    }
       public static int osab(int[]tehtava)
       {
           int lasku=0,keskiarvo=0;
           int k=0;
           int length = String.valueOf(tehtava).length();

           for(int i=0;i<length; i++){
               k++;
               lasku+=tehtava[i];
               
           }
           keskiarvo= lasku/k;
           System.out.println(keskiarvo);

           return keskiarvo;
       }
}
