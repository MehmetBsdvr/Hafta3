
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1) Basla
2) n=1 baslayan  sayıları yazdır
3) n<99 100 kücuk  sayıları yazdır
4) n=(n+2) ekleyerek tek sayıları yazdır
5) (n+n) tek sayıların toplamını yazdır
6) Bitir
*/
/**
 *
 * @author Mehmet
 */
public class ÖDEV4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ınput=new Scanner(System.in);
        System.out.println("   Tek Sayıların Toplamı   ");
        
        int sayı= 100;
           int toplam= 1;
             for(int n=1;n<=100;n++){
                toplam+=2;
                sayı=sayı%2;
        }
        System.out.println("1-99 kadar olan tek sayıların toplamı :"+toplam);
    }
         
        
    
    
}
