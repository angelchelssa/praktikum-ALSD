public class StackTugasMahasiswa03 {
    Mahasiswa03[] stack;
    int size, top;

    StackTugasMahasiswa03(int size) {
        this.size = size;
        this.stack = new Mahasiswa03[size];
        this.top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa03 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh. Tidak dapat menambahkan tugas.");
        }
    }

    Mahasiswa03 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong. Tidak ada tugas yang bisa dinilai.");
            return null;
        }
    }

    Mahasiswa03 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    void print() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Stack kosong.");
        }
    }

    Mahasiswa03 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public int jumlahTugas() {
        return top + 1;
    }
    
    
    public String konversiDesimalkeBiner(int nilai) {
        StackKonversi03 stack = new StackKonversi03();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }    
}
