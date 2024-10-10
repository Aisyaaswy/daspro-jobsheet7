import java.util.Scanner;
public class TUGAS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int hargaTiket = 50000;
        double diskon =0, jumlahHargaPenjualan = 0, jumlahHarga = 0, hargaDiskon;

        while (true) {
            System.out.print("Masukkan jumlah tiket terjual (ketik '0' untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket yang dimasukkan tidak valid. Masukkan jumlah tiket yang valid");
                continue;
            } 
            if (jumlahTiket == 0 ) {
                break;
            } 
            if (jumlahTiket >= 4) {
                diskon = 0.1;
            }
            if (jumlahTiket >= 10) {
                diskon = 0.15;
            }

            jumlahHarga = jumlahTiket * hargaTiket;
            hargaDiskon = jumlahHarga - (jumlahHarga * diskon);
            jumlahTiket += jumlahTiket;
            jumlahHargaPenjualan += hargaDiskon; 

            System.out.println("Jumlah tiket: " + jumlahTiket + " tiket");
            System.out.println("Jumlah harga tiket Rp " + hargaDiskon);
            System.out.println();
        }
        System.out.println("Jumlah tiket yang terjual hari ini : " + jumlahTiket + " tiket");
        System.out.println("Jumlah harga perjualan hari ini Rp " + jumlahHargaPenjualan);
    }
}
