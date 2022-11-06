
import java.util.Scanner;
/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1) Başla
2) sayı>0 Pozitif yazdır
3) sayı<0 Negatif yazdır
4) sayı==0  sonuc  0 yazdır
5) Bitir
/**
 *
 * @author Mehmet
 */

public class ÖDEV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ınput=new Scanner(System.in);
        
        System.out.println("Lütfen Sayı girniz");
        int sayı =ınput.nextInt();
        
        if (sayı>0) {
            System.out.println("Sonuc: Pozitif");
        }
        else if(sayı<0){
            System.out.println("Sonuc: Negatif");
        }
        else if(sayı==0){
            System.out.println("Sonuc: 0 ");
        }
    }
    
}
