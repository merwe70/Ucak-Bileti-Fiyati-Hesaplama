import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int age, distance,travelTrip;
        double km = 0.10, indirim;

        Scanner input = new Scanner(System.in);
        System.out.println("Gideceğiniz mesafeyi KM cinsinden belirtiniz");
        distance = input.nextInt();

        System.out.println("Yaşınızı giriniz");
        age = input.nextInt();

        System.out.println("Yolculuk tipinizi giriniz :\n1-Tek Yön\n2-Gidiş Dönüş");
        travelTrip=input.nextInt();


        if(( age > 0) && (travelTrip == 1) || (travelTrip == 2)) {
            if (travelTrip == 1) {
                if (age < 12) {
                    double toplam = distance * km;
                    indirim = toplam * 0.50;
                    System.out.println("Bilet Tutarınız : " + toplam + " TL");
                }else if ((age >= 12) && (age <= 24)) {
                    double toplam = distance * km;
                    indirim = toplam * 0.10;
                    System.out.println("Bilet Tutarınız : " + toplam + " TL");
                }else if (age > 65) {
                    double toplam = distance * km;
                    indirim = toplam * 0.30;
                    System.out.println("Bilet Tutarınız : " + toplam + " TL");
                }
            }
            if (travelTrip == 2) {
                if (age < 12) {
                    double toplam = distance * km;
                    indirim = toplam * 0.50 * 0.20;
                    System.out.println("Bilet Tutarınız : " + toplam + " TL");
                } else if ((age >= 12) && (age <= 24)) {
                    double toplam = distance * km;
                    indirim = toplam * 0.10 * 0.20;
                    System.out.println("Bilet Tutarınız : " + toplam + " TL");
                } else if (age > 65) {
                    double toplam = distance * km;
                    indirim = toplam * 0.30 * 0.20;
                    System.out.println("Bilet Tutarınız : " + toplam + " TL");
                }

            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz");
        }

    }
}