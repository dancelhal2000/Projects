package ASD.Jobsheet.Quiz;

public class Perpustakaan {
    buku[] arrBuku = new buku[5];
    mahasiswa[] arrMahasiswa = new mahasiswa[2];
    int jmlbuku = 0;
    int jmlmahasiswa = 0;

    void tambahBuku(buku bBaru) {
        arrBuku[jmlbuku] = bBaru;
        jmlbuku++;
        System.out.println("success");
    }

    void tambahMahasiswa(mahasiswa mBaru) {
        arrMahasiswa[jmlmahasiswa] = mBaru;
        jmlmahasiswa++;
        System.out.println("success");
    }

    void pinjamBuku(String nimPeminjam, String kodeBukuTarget) {
        mahasiswa mhsPinjam = null;
        buku bPinjam = null;

        for (int i = 0; i < jmlmahasiswa; i++) {
            if (arrMahasiswa[i].nim.equals(nimPeminjam)) {
                mhsPinjam = arrMahasiswa[i];
            }
        }

        for (int i = 0; i < jmlbuku; i++) {
            if (arrBuku[i].kode.equals(kodeBukuTarget)) {
                bPinjam = arrBuku[i];
            }
        }

        if (mhsPinjam != null && bPinjam != null) {
            if (bPinjam.status) {
                System.out.println("Gagal meminjam: " + bPinjam.judul + " sudah dipinjam orang lain.");
            } else if (mhsPinjam.indexBuku >= 2) {
                System.out.println("Gagal: " + mhsPinjam.nama + " sudah mencapai batas 2 buku.");
            } else {
                bPinjam.status = true;
                mhsPinjam.bukuPinjam[mhsPinjam.indexBuku++] = bPinjam;
                System.out.println(mhsPinjam.nama + " berhasil meminjam " + bPinjam.judul);
            }
        } else {
            System.out.println("Error: Data tidak ditemukan.");
        }
    }

    void kembalikanBuku(String nimPeminjam, String kodeBukuTarget) {
        for (int i = 0; i < jmlmahasiswa; i++) {
            mahasiswa mhs = arrMahasiswa[i];
            if (mhs.nim.equals(nimPeminjam)) {
                for (int j = 0; j < mhs.indexBuku; j++) {
                    if (mhs.bukuPinjam[j].kode.equals(kodeBukuTarget)) {
                        mhs.bukuPinjam[j].status = false;
                        System.out.println("Buku " + mhs.bukuPinjam[j].judul + " dikembalikan.");

                        mhs.bukuPinjam[j] = mhs.bukuPinjam[mhs.indexBuku - 1];
                        mhs.bukuPinjam[mhs.indexBuku - 1] = null;
                        mhs.indexBuku--;
                        return;
                    }
                }
            }
        }
        System.out.println("Data peminjaman tidak ditemukan.");
    }

    void daftarPeminjaman() {
        System.out.println("Daftar Peminjaman Buku:");
        boolean adaPeminjam = false;

        for (int i = 0; i < jmlmahasiswa; i++) {
            if (arrMahasiswa[i].indexBuku > 0) {
                System.out.print(arrMahasiswa[i].nama + " meminjam: ");
                for (int j = 0; j < arrMahasiswa[i].indexBuku; j++) {
                    System.out.print(arrMahasiswa[i].bukuPinjam[j].judul);
                    if (j < arrMahasiswa[i].indexBuku - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
                adaPeminjam = true;
            }
        }

        if (!adaPeminjam) {
            System.out.println("Tidak ada mahasiswa yang sedang meminjam buku.");
        }
    }
}