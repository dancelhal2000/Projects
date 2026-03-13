package ASD.Jobsheet.Quiz;

public class buku {
    String kode;
    String judul;
    String penulis;
    boolean status;

    buku(String kode, String judul, String penulis) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.status = false;
    }
}