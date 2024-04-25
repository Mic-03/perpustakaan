// Buku.java
public class Buku {
    private int idBuku;
    private String judulBuku;
    private String pengarangBuku;
    private String penerbitBuku;
    private String tahunTerbitBuku;

    public Buku(int idBuku, String judulBuku, String pengarangBuku, String penerbitBuku, String jenisBuku) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.pengarangBuku = pengarangBuku;
        this.penerbitBuku = penerbitBuku;
        this.tahunTerbitBuku = jenisBuku;
    }

    @Override
    public String toString() {
        return "ID Buku: " + idBuku + "\n" +
               "Judul Buku: " + judulBuku + "\n" +
               "Pengarang: " + pengarangBuku + "\n" +
               "Penerbit: " + penerbitBuku + "\n" +
               "Tahun Terbit: " + tahunTerbitBuku;
    }
}