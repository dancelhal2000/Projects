public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();

        Mahasiswa16 mhs1 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);
        Mahasiswa16 mhs2 = new Mahasiswa16("23212201", "Bimon", "2B", 3.8);
        Mahasiswa16 mhs3 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs4 = new Mahasiswa16("254107060035", "Muhammad Aubin Kurniawan", "SIB 1B", 4.0);

        sll.addFirst(mhs4);
        sll.addLast(mhs1);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}