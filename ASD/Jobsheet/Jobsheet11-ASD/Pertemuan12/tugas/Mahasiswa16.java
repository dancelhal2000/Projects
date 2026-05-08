package tugas;

public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa16() {
    }

    public Mahasiswa16(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public void tampilInformasi() {
        System.out.printf("%s\t%s\t%s\n", nim, nama, kelas);
    }
}