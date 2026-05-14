public class Mahasiswa16 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa16() {
    }

    public Mahasiswa16(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    } 

    public void tampilInformasi(){
        System.out.printf("%s\t%s\t%s\t%s\n", nim, nama, kelas, ipk);
    }
}