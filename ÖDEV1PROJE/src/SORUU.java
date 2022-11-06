
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class SORUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ınput=new Scanner(System.in);
        
        System.out.println("Lütfen Ay girniz");
        int ay =ınput.nextInt();
        
          if (ay==1){
            System.out.println("Ocak");
        }
        else if(ay==2){
            System.out.println("Subat");
        }
        else if(ay==3){
            System.out.println("Mart");
        }
        else if(ay==4){
            System.out.println("Nisan");
        }
        else if(ay==5){
            System.out.println("Mayıs");
        }
        else if(ay==6){
            System.out.println("Haziran");
        }
        else if(ay==7){
            System.out.println("Temmuz");
        }
        else if(ay==8){
            System.out.println("Ağustos");
        }
        else if(ay==9){
            System.out.println("Eylül");
        }
        else if(ay==10){
            System.out.println("Ekim");
        }
        else if(ay==11){
            System.out.println("Kasım");
        }
        else if(ay==12){
            System.out.println("Aralık");
        }
        
    }
    
}
