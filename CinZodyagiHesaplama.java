
package cinzodyagıhesaplama;
import java.util.*;
public class CinZodyagıHesaplama {

    public static void main(String[] args) {
        /*Çin Zodyağı insanları 12 değişik burç ve sembollerle tanımlar.
          12 burcun eşir aralıklarla sıralandığı bir hayvan halkasıdır.
        Kişinin doğum gününün 12'e bölümünden kalana göre hesaplanır*/
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz:");
        int dogumYili = input.nextInt();
        
        if(dogumYili%12==0){
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        }
        else if(dogumYili%12==0){
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }
        else if(dogumYili%12==2){
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }
        else if(dogumYili%12==3){
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }
         else if(dogumYili%12==4){
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }
         else if(dogumYili%12==5){
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }
         else if(dogumYili%12==6){
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }
         else if(dogumYili%12==7){
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }
         else if(dogumYili%12==8){
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }
         else if(dogumYili%12==9){
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }
         else if(dogumYili%12==10){
            System.out.println("Çin Zodyağı Burcunuz: At");
        }
         else if(dogumYili%12==11){
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }
    
}