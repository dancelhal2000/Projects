public class buku {
    public String kodeBuku;
    public String judul;
    public int tahunTerbit;

    public buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }
    void tampilkanBuku(){
        System.out.println("Kode: " + kodeBuku + " | " + "Judul: " + judul + " | " + "Tahun: " + tahunTerbit);
    }
}
