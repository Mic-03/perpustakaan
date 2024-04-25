public class Dosen {
    private int nip;
    private String namaDosen;
    private String alamatDosen;
    private String noTelpDosen;
    private String emailDosen;

    public Dosen(int nip, String namaDosen, String alamatDosen, String noTelpDosen, String emailDosen) {
        this.nip = nip;
        this.namaDosen = namaDosen;
        this.alamatDosen = alamatDosen;
        this.noTelpDosen = noTelpDosen;
        this.emailDosen = emailDosen;
    }

    @Override
    public String toString() {
        return "NIP: " + nip + "\n" +
               "Nama Dosen: " + namaDosen + "\n" +
               "Alamat: " + alamatDosen + "\n" +
               "No. Telp: " + noTelpDosen + "\n" +
               "Email: " + emailDosen;
    }
}
