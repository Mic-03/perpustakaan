// Pustakawan.java
public class Pustakawan {
    private int idPustakawan;
    private String namaPustakawan;
    private String alamatPustakawan;
    private String noTelpPustakawan;
    private String emailPustakawan;

    public Pustakawan(int idPustakawan, String namaPustakawan, String alamatPustakawan, String noTelpPustakawan, String emailPustakawan) {
        this.idPustakawan = idPustakawan;
        this.namaPustakawan = namaPustakawan;
        this.alamatPustakawan = alamatPustakawan;
        this.noTelpPustakawan = noTelpPustakawan;
        this.emailPustakawan = emailPustakawan;
    }

    @Override
    public String toString() {
        return "ID Pustakawan: " + idPustakawan + "\n" +
               "Nama Pustakawan: " + namaPustakawan + "\n" +
               "Alamat: " + alamatPustakawan + "\n" +
               "No. Telp: " + noTelpPustakawan + "\n" +
               "Email: " + emailPustakawan;
    }
}