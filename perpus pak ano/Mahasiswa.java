// Mahasiswa.java
public class Mahasiswa {
    private int nim;
    private String namaMahasiswa;
    private String alamatMahasiswa;
    private String noTelpMahasiswa;
    private String emailMahasiswa;

    public Mahasiswa(int nim, String namaMahasiswa, String alamatMahasiswa, String noTelpMahasiswa, String emailMahasiswa) {
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.alamatMahasiswa = alamatMahasiswa;
        this.noTelpMahasiswa = noTelpMahasiswa;
        this.emailMahasiswa = emailMahasiswa;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + "\n" +
               "Nama Mahasiswa: " + namaMahasiswa + "\n" +
               "Alamat: " + alamatMahasiswa + "\n" +
               "No. Telp: " + noTelpMahasiswa + "\n" +
               "Email: " + emailMahasiswa;
    }
}