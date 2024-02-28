public class Buku {
    private String nama;
    private String lamaPinjam;
    private String tanggalPinjam;

    public Buku(String nama, String lamaPinjam, String tanggalPinjam) {
        this.nama = nama;
        this.lamaPinjam = lamaPinjam;
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getNama() {
        return nama;
    }

    public String getLamaPinjam() {
        return lamaPinjam;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }
}
