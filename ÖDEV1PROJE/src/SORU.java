
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
1) Basla
2) 90-100 arasına AA yazdır
3) 80-89  arasına BA yazdır
4) 70-79  arasına CC yazdır
5)  0-70  arasına FF yazdır
6) Bitir
*/
/**
 *
 * @author Mehmet
 */
public class SORU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        
        System.out.println("Lütfen Notu Giriniz");
        int i =s.nextInt();
   
        if(i>=90){
            System.out.println("Notunuz: AA ");
        }
        else if(i>=80 && i<90){
            System.out.println("Notunuz: BA");
        }
        else if(i>=70 && i<80){
            System.out.println("Notunuz: CC");
        }
        else {
            System.out.println("Notunuz: FF");
        }
    }
    
}
