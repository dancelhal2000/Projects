package tugas;

public class SingleLinkedList16 {
    Node16 head;
    Node16 tail;
    int size;

    boolean isFull(){
        return (size == 8);
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(Mahasiswa16 input){
        if (isFull()) {
            System.out.println("Linked list penuh");
            return;
        }
        Node16 ndInput = new Node16(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        size++;
    }

    public Mahasiswa16 dequeue(){
        Mahasiswa16 data = null;
        if (!isEmpty()) {
            data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
        } else {
            System.out.println("Linked list kosong");
        }
        return data;
    }

    public void peekFront(){
        if (!isEmpty()) {
            System.out.println("Data terdepan: " + head.data.nama);
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Data terbelakang: " + tail.data.nama);
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void size() {
        System.out.println("Jumlah data: " + size);
    }

    public void print() {
        if (!isEmpty()) {
            Node16 tmp = head;
            System.out.println("Isi Linked List:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    } 
}
