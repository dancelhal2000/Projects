public class stackSurat {
    Surat16[] stack;
    int top;
    int size;

    public stackSurat(int size) {
        this.size = size;
        stack = new Surat16[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    public void push(Surat16 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public Surat16 pop() {
        if (!isEmpty()) {
            Surat16 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public Surat16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void cariSurat(String nama){
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equals(nama)) {
                System.out.println("");
                System.out.println("Id Surat: " + stack[i].idSurat + "\n" + "Nama: " + stack[i].namaMahasiswa + "\n" + "Kelas: " + stack[i].kelas + "\n" + "Jenis Izin: " + stack[i].jenisIzin + "\n" + "Durasi: " + stack[i].durasi);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Surat tidak ditemukan");
        }
    }
}
