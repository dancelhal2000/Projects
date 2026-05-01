public class QueueKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int totalSelesai = 0;
    int limitDPA = 30;

    public QueueKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil mendaftar antrian.");
        } else {
            System.out.println("Antrian penuh! (Maksimal 10)");
        }
    }

    public void layaniKRS() {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian untuk dilayani.");
            return;
        }

        int jumlahDiproses = (size >= 2) ? 2 : 1;
        System.out.println("--- Memproses KRS (" + jumlahDiproses + " Mahasiswa) ---");

        for (int i = 0; i < jumlahDiproses; i++) {
            Mahasiswa m = data[front];
            System.out.print("Selesai: ");
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            totalSelesai++;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian Saat Ini:");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                System.out.print((i + 1) + ". ");
                data[index].tampilkanData();
            }
        }
    }

    public void printTop2() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Antrian Terdepan:");
            int limit = Math.min(size, 2);
            for (int i = 0; i < limit; i++) {
                data[(front + i) % max].tampilkanData();
            }
        }
    }

    public void printLast() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian Paling Akhir: ");
            data[rear].tampilkanData();
        }
    }

    public int getBelumKRS() {
        return limitDPA - totalSelesai;
    }
}