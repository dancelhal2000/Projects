public class mahasiswa {
    public String nim;
    public String nama;
    public String prodi;

    public mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }
void tampilkanMahasiswa(){
    System.out.println("NIM: " + nim + " | " + "Nama: " + nama + " | " + "Prodi: " + prodi);
    }
}
