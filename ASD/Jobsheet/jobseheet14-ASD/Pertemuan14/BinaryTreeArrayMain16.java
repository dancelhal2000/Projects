public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
        BinaryTreeArray16 bta = new BinaryTreeArray16();

        Mahasiswa16 mhs1 = new Mahasiswa16("244160121", "Ali", "A", 3.57);
        Mahasiswa16 mhs2 = new Mahasiswa16("244160185", "Candra", "C", 3.41);
        Mahasiswa16 mhs3 = new Mahasiswa16("244160221", "Badar", "B", 3.75);
        Mahasiswa16 mhs4 = new Mahasiswa16("244160220", "Dewi", "B", 3.35);
        Mahasiswa16 mhs5 = new Mahasiswa16("244160131", "Devi", "A", 3.48);
        Mahasiswa16 mhs6 = new Mahasiswa16("244160205", "Ehsan", "D", 3.61);
        Mahasiswa16 mhs7 = new Mahasiswa16("244160170", "Fizi", "B", 3.86);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nPreOrder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}