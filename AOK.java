//Muhammad Fauzan - 235150201111044 - Kelas D

package aok;
import java.util.Scanner;
public class AOK {
    public static void main(String[] args) {
        while(true){    
            Scanner sc = new Scanner (System.in);
            System.out.println("1. Biner ke desimal");
            System.out.println("2. Desimal ke biner");
            System.out.println("3. Biner ke hexa");
            System.out.println("4. Hexa ke biner");
            System.out.println("5. Desimal ke hexa");
            System.out.println("6. Hexa ke desimal");
            System.out.println("0. program berhenti");
            System.out.print("Masukkan pilihan: ");
            int pilihan = sc.nextInt();
            if(pilihan==1||pilihan==2||pilihan==3||pilihan==4||pilihan==5||pilihan==6)
                System.out.print("masukkan bilangan yang ingin dikonversi: ");
            if(pilihan == 1){
                String angka = sc.next();
                int hasil = Integer.parseInt(angka,2);
                System.out.println("Hasil konversi: "+hasil);
            }else if(pilihan == 2){
                int angka = sc.nextInt();
                String hasil = Integer.toBinaryString(angka);
                System.out.println("Hasil konversi: "+hasil);
            }else if(pilihan == 3){
                String angka = sc.next();
                int desimal = Integer.parseInt(angka,2);
                String hasil = Integer.toHexString(desimal).toUpperCase();
                System.out.println("Hasil konversi: "+hasil);
            }else if(pilihan == 4){
                String angka = sc.next();
                int desimal = Integer.parseInt(angka,16);
                String hasil = Integer.toBinaryString(desimal);
                System.out.println("Hasil konversi: "+hasil);
            }else if(pilihan == 5){
                int angka = sc.nextInt();
                String hasil = Integer.toHexString(angka).toUpperCase();
                System.out.println("Hasil konversi: "+hasil);
            }else if(pilihan == 6){
                String angka = sc.next();
                int hasil = Integer.parseInt(angka,16);
                System.out.println("Hasil konversi: "+hasil);
            }else if(pilihan==0) {
                break;
            }System.out.println();
        }
    }    
}
