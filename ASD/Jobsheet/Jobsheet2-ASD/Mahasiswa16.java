
public class Mahasiswa16 {

    public Mahasiswa16() {
    }

    public Mahasiswa16(String nm, String nim, double ipk, String kelas) {
        nama = nm;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    void ubahKelas(String KelasBaru) {
        kelas = KelasBaru;
    }

    void updateIPK(double IPKBaru) {
        ipk = IPKBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.0) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
}
