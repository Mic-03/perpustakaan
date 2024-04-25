class Majalah{
    private String namaMajalah;
    private int tahunTerbit;
    private int edisi;

    public Majalah(String namaMajalah, int tahunTerbit, int edisi) {
        this.namaMajalah = namaMajalah;
        this.tahunTerbit = tahunTerbit;
        this.edisi = edisi;
    }

    public Majalah(int i, String namaMajalah2, int tahunTerbit2, int edisi2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Nama Majalah: " + namaMajalah + "\n" +
               "Tahun Terbit: " + tahunTerbit + "\n" +
               "Edisi: " + edisi;
    }

    public static void add(Majalah majalah) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
