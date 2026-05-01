public class Mahasiswa16 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa16(String ni, String na, String kl, double ip) {
        nim = ni;
        nama = na;
        kelas = kl;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Kelas = " + kelas);
        System.out.println("IPK = " + ipk);
    }
}
