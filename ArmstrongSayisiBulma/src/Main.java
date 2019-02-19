
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Berkay
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Sayı giriniz: ");
        int sayi=scanner.nextInt();
        int gecici=sayi;
        System.out.print("Girilen Sayı Kaç Basamaklı: ");
        int basamak=scanner.nextInt();
        
        int islem;
        int toplam=0;
        
        while (sayi>0) {            
            
            islem=sayi%10;
            toplam+=Math.pow(islem, basamak);
            sayi/=10;
   
            
        }
        if (gecici==toplam) {
            System.out.println("Bu Sayı Bir Armstrong Sayısıdır.");
        }
        else{
            System.out.println("Armstrong Sayısı Değildir.");      
    }
        
    }
    
}
