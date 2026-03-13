package ASD.Jobsheet.Quiz;

public class mahasiswa {
    String nim;
    String nama;
    buku[] bukuPinjam = new buku[2];
    int indexBuku = 0;

    mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
}