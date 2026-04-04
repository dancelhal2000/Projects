public class Dosen16 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen16(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    void tampil() {
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia : " + usia);
    }
}
