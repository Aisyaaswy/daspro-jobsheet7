import java.util.Scanner;
public class TUGAS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan, durasiParkir, tarifPerJam = 0, pembayaran = 0, totalBiaya = 0;

        while(true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk selesai): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                System.out.println();
                break;
            } 
            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasiParkir = sc.nextInt();
            
            if (jenisKendaraan == 1) {
                tarifPerJam = 3000;
            } else if (jenisKendaraan == 2) {
                tarifPerJam = 2000;
            } if (durasiParkir <= 5) {
                pembayaran = tarifPerJam * durasiParkir;
            } else {
                pembayaran = 12500;
            }
            totalBiaya += pembayaran;

            System.out.println("Pembayaran : Rp " + pembayaran);
        }
        System.out.println("Total pembayaran : Rp " + totalBiaya);
    }
}
