import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Taban giriniz");
        int taban = scanner.nextInt();

        System.out.println("üs giriniz");
        int us = scanner.nextInt();

        us_alma(taban, us);

        }
    public static void us_alma(int taban, int us){
        int sonuc = 1;
        for(int i = 0; i< us; i++){
            sonuc *= taban;
        }
        System.out.println(sonuc);
    }
}