public class StackTugasMahasiswa16 {
    Mahasiswa16[] stack;
    int top;
    int size;

    public StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
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

    public void push(Mahasiswa16 m) {
        if (!isFull()) {
            top++;
            stack[top] = m;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public Mahasiswa16 pop() {
        if (!isEmpty()) {
            Mahasiswa16 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public Mahasiswa16 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void printStack() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].NIM + "\t" + stack[i].nama + "\t" + stack[i].kelas + "\t" + stack[i].nilai);
            }
        } else {
            System.out.println("");
        }
    }
}
