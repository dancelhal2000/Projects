public class pembeli {
    String namaPembeli;
    String noHp;

    pembeli(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampil() {
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("No HP : " + noHp);
    }
}
