public class dLLPesanan {
    nodePesanan head;
    nodePesanan tail;

    public dLLPesanan() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(pesanan data) {
        nodePesanan newNode = new nodePesanan(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(pesanan data) {
        nodePesanan newNode = new nodePesanan(data);
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
        nodePesanan current = head;
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
        nodePesanan current = tail;
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
            System.out.println("Data " + head.data.namaPesanan + " berhasil dihapus.");
            head = tail = null;
        } else {
            System.out.println("Data " + head.data.namaPesanan + " berhasil dihapus.");
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
            System.out.println("Data " + tail.data.namaPesanan + " berhasil dihapus.");
            head = tail = null;
        } else {
            System.out.println("Data " + tail.data.namaPesanan + " berhasil dihapus.");
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void Sorting() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        boolean swapped;
        nodePesanan current;

        do {
            swapped = false;
            current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}