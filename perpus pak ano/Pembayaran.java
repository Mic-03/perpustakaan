import java.text.SimpleDateFormat;
import java.util.Date;

class Pembayaran {
    private int id;
    private int idPeminjaman;
    private double jumlah;
    private Date tanggal;

    public Pembayaran(int id, int idPeminjaman, double jumlah, Date tanggal) {
        this.id = id;
        this.idPeminjaman = idPeminjaman;
        this.jumlah = jumlah;
        this.tanggal = tanggal;
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalStr = dateFormat.format(tanggal);

        return "ID Pembayaran: " + id + "\n" +
               "ID Peminjaman: " + idPeminjaman + "\n" +
               "Jumlah: " + jumlah + "\n" +
               "Tanggal: " + tanggalStr;
    }
}
