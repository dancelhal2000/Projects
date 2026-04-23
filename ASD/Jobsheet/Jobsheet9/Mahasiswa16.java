public class Mahasiswa16 {
    String nama;
    String NIM;
    String kelas;
    int nilai;

    Mahasiswa16() {
    }

    Mahasiswa16(String nim, String nama, String kelas) {
        this.NIM = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDiNilai(int nilai) {
        this.nilai = nilai;
    }

}