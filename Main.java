
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    { double Armut,Elma,Domates,Muz,Patlican,armutk,elmak,domatesk,muzk,patlicank,tutar;
        Armut=2.14;
        Elma=3.67;
        Domates = 1.11;
        Muz= 0.95;
        Patlican = 5.00;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ?:");
        armutk= input.nextDouble();
        System.out.print("Elma Kaç Kilo ?:");
        elmak= input.nextDouble();
        System.out.print("Domates Kaç Kilo ?:");
        domatesk=input.nextDouble();
        System.out.print("Muz Kaç Kilo ?:");
        muzk= input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?:");
        patlicank= input.nextDouble();

        tutar=Armut*armutk+Elma*elmak+Domates*domatesk+Muz*muzk+Patlican*patlicank;
        System.out.println("Toplam Tutar :"+tutar);
    }
}