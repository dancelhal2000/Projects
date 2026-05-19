public class DoubleLinkedList {
    node head;
    node tail;

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(pembeli data) {
        node newNode = new node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(pembeli data) {
        node newNode = new node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        node current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        node current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            System.out.println("Data " + head.data.namaPembeli + " berhasil dihapus.");
            head = tail = null;
        } else {
            System.out.println("Data " + head.data.namaPembeli + " berhasil dihapus.");
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            System.out.println("Data " + tail.data.namaPembeli + " berhasil dihapus.");
            head = tail = null;
        } else {
            System.out.println("Data " + tail.data.namaPembeli + " berhasil dihapus.");
            tail = tail.prev;
            tail.next = null;
        }
    }
}