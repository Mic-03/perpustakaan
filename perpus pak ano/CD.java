class CD {
    private int id;
    private String judul;
    private String artis;
    private String label;

    public CD(int id, String judul, String artis, String label) {
        this.id = id;
        this.judul = judul;
        this.artis = artis;
        this.label = label;
    }

    @Override
    public String toString() {
        return "ID CD: " + id + "\n" +
               "Judul: " + judul + "\n" +
               "Artis: " + artis + "\n" +
               "Label: " + label;
    }
}