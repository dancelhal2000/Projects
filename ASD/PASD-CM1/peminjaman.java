public class peminjaman {
    mahasiswa mhs;
    buku bk;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    public peminjaman(mahasiswa mhs, buku bk, int lamaPinjam) {
        this.mhs = mhs;
        this.bk = bk;
        this.lamaPinjam = lamaPinjam;

    }
    void tampilkanPinjaman(){
        System.out.println(mhs.nama + " | " + mhs.prodi + " | Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }

    void hitungDenda(){
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        }
    }
}