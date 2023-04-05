package day07_genelTekrar_ifStatements;

import java.util.Scanner;

public class C03_IfElseIf {

    public static void main(String[] args) {

        // kullanicadan pozitif bir tamsayi salin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolunebiliyorsa "5'in kati"
        // sayi hem 3 ile hem 5 ile bolunebiliyorsa " 3'un ve 5'in kati"
        // ikisine de bolunebiliyorsa "ne 3'un ne de 5'in kati" yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

         int sayi = scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("3 ve 5'in kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        } else {
            System.out.println("ne 3'un ne de 5'in kati");
        }

        /*
            Eger bir if else if... cumlesi
            else ile bitiyorsa

            MUTLAKA if body'lerinde 1 TANESİ CALISIR
         */
    }
}
