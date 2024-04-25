import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    static ArrayList<Pustakawan> daftarPustakawan = new ArrayList<>();
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    static ArrayList<Dosen> daftarDosen = new ArrayList<>();
    static ArrayList<Buku> daftarBuku = new ArrayList<>();
    static ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    static ArrayList<CD> daftarCD = new ArrayList<>();
    static ArrayList<Majalah> daftarMajalah = new ArrayList<>();
    static ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();
    static ArrayList<Denda> daftarDenda = new ArrayList<>();
    static int idPeminjamanCounter = 1;
    static int idPembayaranCounter = 1;
    static int idDendaCounter = 1;

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
       // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("Menu Utama:");
            System.out.println("1. Tambah Pustakawan");
            System.out.println("2. Tambah Pengguna (Mahasiswa/Dosen)");
            System.out.println("3. Tambah Buku");
            System.out.println("4. Tambah Peminjaman");
            System.out.println("5. Tambah CD");
            System.out.println("6. Tambah Majalah");
            System.out.println("7. Tambah Pembayaran");
            System.out.println("8. Tambah Denda");
            System.out.println("9. Lihat Data Pustakawan");
            System.out.println("10. Lihat Data Mahasiswa/Dosen");
            System.out.println("11. Lihat Data Buku");
            System.out.println("12. Lihat Data Peminjaman");
            System.out.println("13. Lihat Data CD");
            System.out.println("14. Lihat Data Majalah");
            System.out.println("15. Lihat Data Pembayaran");
            System.out.println("16. Lihat Data Denda");
            System.out.println("17. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = 0;
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan nomor menu.");
                continue; // Melanjutkan ke iterasi berikutnya
            }

            switch (pilihan) {
                case 1:
                    tambahPustakawan(scanner);
                    break;
                case 2:
                    tambahPengguna(scanner);
                    break;
                case 3:
                    tambahBuku(scanner);
                    break;
                case 4:
                    tambahPeminjaman(scanner);
                    break;
                case 5:
                    tambahCD(scanner);
                    break;
                case 6:
                    tambahMajalah(scanner);
                    break;
                case 7:
                    tambahPembayaran(scanner);
                    break;
                case 8:
                    tambahDenda(scanner);
                    break;
                case 9:
                    lihatDataPustakawan();
                    break;
                case 10:
                    lihatDataMahasiswaDosen();
                    break;
                case 11:
                    lihatDataBuku();
                    break;
                case 12:
                    lihatDataPeminjaman();
                    break;
                case 13:
                    lihatDataCD();
                    break;
                case 14:
                    lihatDataMajalah();
                    break;
                case 15:
                    lihatDataPembayaran();
                    break;
                case 16:
                    lihatDataDenda();
                    break;
                case 17:
                    System.out.println("Terima kasih telah menggunakan aplikasi!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }

    // Metode tambahPustakawan, tambahPengguna, tambahMahasiswa, dan tambahDosen tidak berubah
    private static void tambahPustakawan(Scanner scanner) {
        try {
            System.out.print("Masukkan ID Pustakawan: ");
            int idPustakawan = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan Nama Pustakawan: ");
            String namaPustakawan = scanner.nextLine();
    
            System.out.print("Masukkan Alamat Pustakawan: ");
            String alamatPustakawan = scanner.nextLine();
    
            System.out.print("Masukkan Nomor Telepon Pustakawan: ");
            String noTelpPustakawan = scanner.nextLine();
    
            System.out.print("Masukkan Email Pustakawan: ");
            String emailPustakawan = scanner.nextLine();
    
            Pustakawan pustakawan = new Pustakawan(idPustakawan, namaPustakawan, alamatPustakawan, noTelpPustakawan, emailPustakawan);
            daftarPustakawan.add(pustakawan);
    
            System.out.println("Pustakawan baru telah ditambahkan.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. ID Pustakawan harus berupa angka.");
        }
    }
    
    private static void tambahPengguna(Scanner scanner) {
        System.out.println("Tambah Pengguna:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.print("Pilih jenis pengguna: ");
        int pilihan = 0;
        try {
            pilihan = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Silakan masukkan nomor.");
            return;
        }
    
        switch (pilihan) {
            case 1:
                tambahMahasiswa(scanner);
                break;
            case 2:
                tambahDosen(scanner);
                break;
            default:
                System.out.println("Pilihan tidak valid. Pengguna tidak ditambahkan.");
        }
    }

    private static void tambahMahasiswa(Scanner scanner) {
        try {
            System.out.print("Masukkan NIM Mahasiswa: ");
            int nim = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan ID Mahasiswa: ");
            int idMahasiswa = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan Nama Mahasiswa: ");
            String namaMahasiswa = scanner.nextLine();
    
            System.out.print("Masukkan Alamat Mahasiswa: ");
            String alamatMahasiswa = scanner.nextLine();
    
            System.out.print("Masukkan Nomor Telepon Mahasiswa: ");
            String noTelpMahasiswa = scanner.nextLine();
    
            System.out.print("Masukkan Email Mahasiswa: ");
            String emailMahasiswa = scanner.nextLine();
    
            Mahasiswa mahasiswa = new Mahasiswa(nim, namaMahasiswa, alamatMahasiswa, noTelpMahasiswa, emailMahasiswa);
            daftarMahasiswa.add(mahasiswa);
    
            System.out.println("Mahasiswa baru telah ditambahkan.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. NIM dan ID Mahasiswa harus berupa angka.");
        }
    }

    private static void tambahDosen(Scanner scanner) {
        try {
            System.out.print("Masukkan NIP Dosen: ");
            int nipDosen = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan ID Dosen: ");
            int idDosen = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan Nama Dosen: ");
            String namaDosen = scanner.nextLine();
    
            System.out.print("Masukkan Alamat Dosen: ");
            String alamatDosen = scanner.nextLine();
    
            System.out.print("Masukkan Nomor Telepon Dosen: ");
            String noTelpDosen = scanner.nextLine();
    
            System.out.print("Masukkan Email Dosen: ");
            String emailDosen = scanner.nextLine();
    
            Dosen dosen = new Dosen(nipDosen, namaDosen, alamatDosen, noTelpDosen, emailDosen);
            daftarDosen.add(dosen);
    
            System.out.println("Dosen baru telah ditambahkan.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. NIP dan ID Dosen harus berupa angka.");
        }
    }




    // Metode tambahPustakawan, tambahPengguna, tambahMahasiswa, dan tambahDosen tidak berubah
    private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan ISBN/ISSN: ");
        int idBuku = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character

        System.out.print("Masukkan Judul Buku: ");
        String judulBuku = scanner.nextLine();

        System.out.print("Masukkan Pengarang Buku: ");
        String pengarangBuku = scanner.nextLine();

        System.out.print("Masukkan Penerbit Buku: ");
        String penerbitBuku = scanner.nextLine();

        System.out.print("Masukkan Tahun Terbit Buku: ");
        String tahunTerbitBuku = scanner.nextLine();

        Buku buku = new Buku(idBuku, judulBuku, pengarangBuku, penerbitBuku, tahunTerbitBuku);
        daftarBuku.add(buku);

        System.out.println("Buku baru telah ditambahkan.");
    }


    private static void tambahCD(Scanner scanner) {
        System.out.print("Masukkan Judul CD: ");
        String judulCD = scanner.nextLine();

        System.out.print("Masukkan Artis CD: ");
        String artisCD = scanner.nextLine();

        System.out.print("Masukkan Label CD: ");
        String labelCD = scanner.nextLine();

        CD cd = new CD(daftarCD.size() + 1, judulCD, artisCD, labelCD);
        daftarCD.add(cd);

        System.out.println("CD baru telah ditambahkan.");
    }

    private static void tambahMajalah(Scanner scanner) {
        System.out.print("Masukkan Nama Majalah: ");
        String namaMajalah = scanner.nextLine();

        System.out.print("Masukkan Tahun Terbit Majalah: ");
        int tahunTerbit = 0;
        try {
            tahunTerbit = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tahun terbit tidak valid. Silakan masukkan angka.");
            return; // Kembali ke menu utama
        }

        System.out.print("Masukkan Edisi Majalah: ");
        int edisi = 0;
        try {
            edisi = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input edisi tidak valid. Silakan masukkan angka.");
            return; // Kembali ke menu utama
        }

        Majalah majalah = new Majalah(daftarMajalah.size() + 1, namaMajalah, tahunTerbit, edisi);
        daftarMajalah.add(majalah);

        System.out.println("Majalah baru telah ditambahkan.");
    }

    private static void tambahPembayaran(Scanner scanner) throws ParseException {
        System.out.print("Masukkan ID Peminjaman untuk Pembayaran: ");
        int idPeminjaman = 0;
        try {
            idPeminjaman = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input ID peminjaman tidak valid. Silakan masukkan angka.");
            return; // Kembali ke menu utama
        }

        System.out.print("Masukkan Jumlah Pembayaran: ");
        double jumlahPembayaran = 0;
        try {
            jumlahPembayaran = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input jumlah pembayaran tidak valid. Silakan masukkan angka.");
            return; // Kembali ke menu utama
        }

        System.out.print("Masukkan Tanggal Pembayaran (YYYY-MM-DD): ");
        String tanggalPembayaranStr = scanner.nextLine();
        Date tanggalPembayaran;
        try {
            tanggalPembayaran = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalPembayaranStr);
        } catch (ParseException e) {
            System.out.println("Format tanggal tidak valid. Gunakan format YYYY-MM-DD.");
            return; // Kembali ke menu utama
        }

        Pembayaran pembayaran = new Pembayaran(idPembayaranCounter++, idPeminjaman, jumlahPembayaran, tanggalPembayaran);
        daftarPembayaran.add(pembayaran);

        System.out.println("Pembayaran baru telah ditambahkan.");
    }

    private static void tambahDenda(Scanner scanner) throws ParseException {
        System.out.print("Masukkan ID Peminjaman untuk Denda: ");
        int idPeminjaman = 0;
        try {
            idPeminjaman = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input ID peminjaman tidak valid. Silakan masukkan angka.");
            return; // Kembali ke menu utama
        }

        System.out.print("Masukkan Jumlah Denda: ");
        double jumlahDenda = 0;
        try {
            jumlahDenda = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input jumlah denda tidak valid. Silakan masukkan angka.");
            return; // Kembali ke menu utama
        }

        System.out.print("Masukkan Tanggal Denda (YYYY-MM-DD): ");
        String tanggalDendaStr = scanner.nextLine();
        Date tanggalDenda;
        try {
            tanggalDenda = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalDendaStr);
        } catch (ParseException e) {
            System.out.println("Format tanggal tidak valid. Gunakan format YYYY-MM-DD.");
            return; // Kembali ke menu utama
        }

        Denda denda = new Denda(idDendaCounter++, idPeminjaman, jumlahDenda, tanggalDenda);
        daftarDenda.add(denda);

        System.out.println("Denda baru telah ditambahkan.");
    }

    private static void tambahPeminjaman(Scanner scanner) {
        try {
            System.out.print("Masukkan ID Peminjaman: ");
            int idPeminjaman = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan ID Pustakawan: ");
            int idPustakawan = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan ID Pengguna (Mahasiswa/Dosen): ");
            int idPengguna = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan ID Buku: ");
            int idBuku = Integer.parseInt(scanner.nextLine());
    
            System.out.print("Masukkan Tanggal Pinjam (YYYY-MM-DD): ");
            String tanggalPinjamStr = scanner.nextLine();
    
            System.out.print("Masukkan Tanggal Kembali (YYYY-MM-DD): ");
            String tanggalKembaliStr = scanner.nextLine();
    
            Date tanggalPinjam = null;
            Date tanggalKembali = null;
    
            try {
                tanggalPinjam = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalPinjamStr);
                tanggalKembali = new SimpleDateFormat("yyyy-MM-dd").parse(tanggalKembaliStr);
            } catch (ParseException e) {
                System.out.println("Format tanggal salah. Gunakan format YYYY-MM-DD.");
                return;
            }
    
            Peminjaman peminjaman = new Peminjaman(idPeminjaman, idPustakawan, idPengguna, idBuku, tanggalPinjam, tanggalKembali);
            daftarPeminjaman.add(peminjaman);
    
            System.out.println("Peminjaman baru telah ditambahkan.");
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. ID harus berupa angka.");
        }
    }

    // Metode lihatDataPustakawan, lihatDataMahasiswaDosen, lihatDataBuku, dan lihatDataPeminjaman tidak berubah

    private static void lihatDataCD() {
        System.out.println("Data CD:");
        for (CD cd : daftarCD) {
            System.out.println(cd);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataMajalah() {
        System.out.println("Data Majalah:");
        for (Majalah majalah : daftarMajalah) {
            System.out.println(majalah);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataPembayaran() {
        System.out.println("Data Pembayaran:");
        for (Pembayaran pembayaran : daftarPembayaran) {
            System.out.println(pembayaran);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataDenda() {
        System.out.println("Data Denda:");
        for (Denda denda : daftarDenda) {
            System.out.println(denda);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataPustakawan() {
        System.out.println("Data Pustakawan:");
        for (Pustakawan pustakawan : daftarPustakawan) {
            System.out.println(pustakawan);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataMahasiswaDosen() {
        System.out.println("Data Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }

        System.out.println("Data Dosen:");
        for (Dosen dosen : daftarDosen) {
            System.out.println(dosen);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataBuku() {
        System.out.println("Data Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println(buku);
            System.out.println(); // Tambahkan baris kosong untuk pemisah antar data
        }
    }

    private static void lihatDataPeminjaman() {
        System.out.println("Data Peminjaman:");
        for (Peminjaman peminjaman : daftarPeminjaman) {
            System.out.println(peminjaman);
            System.out.println();}}// Tambahkan baris kosong untuk pemisah antar data
}

