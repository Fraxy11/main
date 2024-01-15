import java.util.Scanner;
public class konversi{
    public static void main(String[] args) {
    //

    Scanner scanner = new Scanner(System.in);
    //
    String isi = "=====Pilihlah Jenis Mata Uang(ANGKA)====\n1.IDR\n2.JPY\n3.MYR\n4.CAD" ;

        System.out.println(isi);
        System.out.print("Masukan jenis uang untuk di koversi ke USD: ");
        String jenis = scanner.next();
        System.out.print("Jumlah:");
        double nilai = scanner.nextDouble();
     // 

            switch (jenis.toUpperCase()) {
                case "1":
                    System.out.println("Nilai dalam USD:"+ (nilai / 15550));
                    break;
                case "2":
                    System.out.println("Nilai dalam USD:"+ (nilai / 114.92));
                    break;
                case "3":
                    System.out.println("Nilai dalam USD:"+ (nilai / 4.15));
                    break;
                case "4":
                    System.out.println("Nilai dalam USD:"+ (nilai / 0.75));
                    break;
                case "KURS":
                    System.out.println();
                    break;
                case "CONV":
                    System.out.println();
                    break;
                default:
                System.out.println("Pilihan Tidak Valid");
                }
        
        System.out.println(isi);
    }
}