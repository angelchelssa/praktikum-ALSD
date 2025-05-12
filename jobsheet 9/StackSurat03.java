public class StackSurat03 {
    Surat03[] stack;
    int size;
    int top;

    public StackSurat03(int size) {
        this.size = size;
        stack = new Surat03[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat03 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack surat penuh!");
        }
    }

    public Surat03 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat yang diproses.");
            return null;
        }
    }

    public Surat03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Daftar Surat Izin:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        } else {
            System.out.println("Belum ada surat.");
        }
    }

    public void searchByName(String nama) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan: " + stack[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
