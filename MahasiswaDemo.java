import java.util.Scanner;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        Mahasiswa[] arrayMahasiswa = new Mahasiswa[jumlahMahasiswa];

    
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan informasi mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jenisKelamin = sc.nextLine().charAt(0);

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            arrayMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        
        System.out.println("\nInformasi Mahasiswa:");
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            System.out.println("Nama: " + mahasiswa.nama);
            System.out.println("NIM: " + mahasiswa.nim);
            System.out.println("Jenis Kelamin: " + mahasiswa.jenisKelamin);
            System.out.println("IPK: " + mahasiswa.ipk);
            System.out.println();
        }

        double totalIpk = 0;
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            totalIpk += mahasiswa.ipk;
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("Rata-rata IPK: " + rataRataIpk);
    }
}

class Mahasiswa {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
}
