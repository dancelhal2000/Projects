public class pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampil() {
        System.out.println("Kode Pesanan : " + kodePesanan);
        System.out.println("Nama Pesanan : " + namaPesanan);
        System.out.println("Harga : " + harga);
    }
}
