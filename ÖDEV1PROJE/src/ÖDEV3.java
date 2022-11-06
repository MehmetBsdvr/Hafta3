
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1) Basla
2) a==b&&a==c&&c==b Eşkenar üçken yazdır
3) a==b&&a!=c İkiz kenar üçken yazdır
4) a!=b&&a!=c&&b!=c Çesit kenar üçken yazdır
5) Bitir
*/

/**
 *
 * @author Mehmet
 */
public class ÖDEV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("Birinci Kenar girniz");
        int a = input.nextInt();
        
        System.out.println("İkinci Kenar giriniz");
        int b =input.nextInt();
        
        System.out.println("Ücüncü Kenar giriniz");
        int c =input.nextInt();
        
        if (a==b&&a==c&&c==b){
            System.out.println("Eşkenar Üçken");
        }
        else if(a==b&&a!=c){
            System.out.println("İkiz Kenar Üçken");
        }
        else if(a!=b&&a!=c&&b!=c){
            System.out.println("Çesit Kenar üçken");
            
        }
    }
    
}
