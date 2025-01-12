import java.util.Scanner;
public class SiakadFor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 100, terendah = 0;
        int lulus = 0, tidakLulus = 0;
        int nilaiMinimal = 60;

        for (int i = 1; i <=10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= nilaiMinimal) {
                lulus++; 
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("NIlai terendah  : " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus    : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus   : " + tidakLulus);
    }
}
