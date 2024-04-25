import java.util.Date;

public class Peminjaman {
    private int idPeminjaman;
    private int idPustakawan;
    private int nim;
    private int idBuku;
    private Date tanggalPinjam;
    private Date tanggalKembali;

    public Peminjaman(int idPeminjaman, int idPustakawan, int nim, int idBuku, Date tanggalPinjam2, Date tanggalKembali2) {
        this.idPeminjaman = idPeminjaman;
        this.idPustakawan = idPustakawan;
        this.nim = nim;
        this.idBuku = idBuku;
        this.tanggalPinjam = tanggalPinjam2;
        this.tanggalKembali = tanggalKembali2;
    }

    @Override
    public String toString() {
        return "ID Peminjaman: " + idPeminjaman + "\n" +
               "ID Pustakawan: " + idPustakawan + "\n" +
               "NIM: " + nim + "\n" +
               "ID Buku: " + idBuku + "\n" +
               "Tanggal Pinjam: " + tanggalPinjam + "\n" +
               "Tanggal Kembali: " + tanggalKembali;
    }
}