
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1) Basla
2) gun=1  Pazartesi yazdır
3) gun=2  Salı yazdır
4) gun=3  Carşamba yazdır
5) gun=4  Persembe yazdır
6) gun=5  Cuma yazdır
7) gun=6  Cumartesi yazdır
8) gun=7  Pazar  yazdır
9) Bitir
*/
/**
 *
 * @author Mehmet
 */
public class ÖDEV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ınput=new Scanner(System.in);
        
        System.out.println("Lütfen gün girniz");
        int gun =ınput.nextInt();
        
        if (gun==1){
            System.out.println("Pazartesi");
        }
        else if(gun==2){
            System.out.println("Salı");
        }
        else if(gun==3){
            System.out.println("Carsamba");
        }
        else if(gun==4){
            System.out.println("Persembe");
        }
        else if(gun==5){
            System.out.println("Cuma");
        }
        else if(gun==6){
            System.out.println("Cumartesi");
        }
        else if(gun==7){
            System.out.println("Pazar");
        }
    }
    
}
