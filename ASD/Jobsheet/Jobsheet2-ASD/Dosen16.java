public class Dosen16 {

    public Dosen16() {
    }

    public Dosen16(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean statusAktifBaru) {
        statusAktif = statusAktifBaru;
        System.out.println("Status aktif berhasil diubah menjadi: " + statusAktif);
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunBergabung;
    }

    void ubahKeahlian(String bidangBaru) {
        bidangKeahlian = bidangBaru;
        System.out.println("Keahlian berhasil diubah menjadi: " + bidangBaru);
    }
}
