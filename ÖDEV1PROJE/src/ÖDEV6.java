
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1) Basla
2) int n=1 n sayısı 1 baslasın yazdır
3) n<100  n sayısı 100 kücük yazdır
4) n=(n*2) n sayısnın 2 carpımı yazdır
5) (n+n) ustleri alınan sayıları topla ve yazdır
6) Bitir
*/
/**
 *
 * @author Mehmet
 */
public class ÖDEV6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  ınput=new Scanner(System.in);
        System.out.println("    İkinin üstlerinin toplamı  ");
        
       int sayı= 100;
          int toplam= 1;
             for(int n=1;n<=100;n=(n*2)){
                toplam+=n;
        }
        System.out.println("1-100 2 ust katları toplamı :"+toplam);
    }
    
}
