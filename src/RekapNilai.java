import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int jumlahSah = 0;
        int nomor = 1;
        int nilai;

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        // do-while lebih pas karena nilai pertama harus diminta terlebih dahulu.
        do {
            System.out.print("Nilai ke-" + nomor + " : ");
            nilai = scanner.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak — nilai harus 0..100");
                continue;
            }

        } while (true);

        scanner.close();
    }
}