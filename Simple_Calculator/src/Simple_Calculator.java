import java.util.Scanner;

public class Simple_Calculator {
    public static void main(String[]args){

        //switch case kullanarak 4 işlem yapabilen basit bir hesap makinesi tasarlayacağız.

        Scanner scanner = new Scanner(System.in);

        System.out.println("**********************************");
        String islemler = "1 - Toplama İşlemi\n" +
                          "2 - Çıkarma İşlemi\n" +
                          "3 - Çarpma İşlemi\n" +
                          "4 - Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("**********************************\n");
        System.out.println("Lütfen İşlemi Seçiniz: ");

        String islem = scanner.nextLine();

        int a;
        int b;

        switch (islem){

            case "1":
                System.out.println("Birinci Sayı");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Toplam " + (a+b));
                break;

            case "2":
                System.out.println("Birinci Sayı");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Fark " + (a-b));
                break;

            case "3":
                System.out.println("Birinci Sayı");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Çarpım " + (a*b));
                break;

            case "4":
                System.out.println("Birinci Sayı");
                a = scanner.nextInt();
                System.out.println("İkinci Sayı");
                b = scanner.nextInt();
                System.out.println("Bölüm " + ((double)a/b));
                break;

            default:
                System.out.println("Yanlış Sayı Girdiniz...");
        }


    }
}