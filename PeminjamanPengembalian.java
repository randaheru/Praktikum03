import java.util.Scanner;

class Buku {
    String namaBuku;
    String lamaPinjam;
    String tanggalPinjam;

    public Buku(String namaBuku, String lamaPinjam, String tanggalPinjam) {
        this.namaBuku = namaBuku;
        this.lamaPinjam = lamaPinjam;
        this.tanggalPinjam = tanggalPinjam;
    }
}

public class PeminjamanPengembalian {
    static Scanner input = new Scanner(System.in);
    static Buku[] bukuPeminjaman;
    static int totalDenda;
    static String nama;
    static String NIM;  
    static int jumlahBuku;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("=========== MENU ===========");
            System.out.println("1. Peminjaman Buku");
            System.out.println("2. Pengembalian Buku");
            System.out.println("3. Informasi dan Bayar Denda");
            System.out.println("4. Cari Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            choice = input.nextInt();
            input.nextLine(); // Consume the newline character
            System.out.println("============================");

            switch (choice) {
                case 1:
                    bukuPeminjaman = peminjamanBuku();
                    break;
                case 2:
                    totalDenda = pengembalianBuku(bukuPeminjaman);
                    break;
                case 3:
                    informasiLengkap(bukuPeminjaman);
                    break;
                case 4:
                    cariBuku(bukuPeminjaman);
                    break;
                case 5:
                    System.out.print("Terimakasih telah mengunjungi perpustakaan");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-4.");
            }
        } while (choice != 5);
    }

    static Buku[] peminjamanBuku() {
        System.out.print("Masukkan nama peminjam: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM peminjam: ");
        NIM = input.nextLine();
    
        System.out.print("Masukkan jumlah buku yang ingin dipinjam: ");
        jumlahBuku = input.nextInt();
        input.nextLine(); 
    
        Buku[] daftarBuku = new Buku[jumlahBuku];
    
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan informasi buku ke-" + (i + 1));
            System.out.print("Masukkan nama buku: ");
            String namaBuku = input.nextLine();
    
            System.out.print("Lama meminjam (DD/MM/YYYY): ");
            String lamaPinjam = input.nextLine();
    
            System.out.print("Tanggal peminjaman (DD/MM/YYYY): ");
            String tanggalPinjam = input.nextLine();
    
            daftarBuku[i] = new Buku(namaBuku, lamaPinjam, tanggalPinjam);
        }
    
        return daftarBuku;
    }

    static int pengembalianBuku(Buku[] bukuPeminjaman) {
        int totalDenda = 0;
        int hariTerlambat = 0;
        int bulanTerlambat = 0;
        int tahunTerlambat = 0;
    
        for (int i = 0; i < bukuPeminjaman.length; i++) {
            // Masukkan logika pengembalian buku di sini
        }
    
        return totalDenda;
    }

    static void informasiLengkap(Buku[] bukuPeminjaman) {
        // Masukkan logika informasi lengkap di sini
    }

    static void cariBuku(Buku[] bukuPeminjaman) {
        // Masukkan logika pencarian buku di sini
    }
}
