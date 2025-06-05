import java.lang.classfile.components.ClassPrinter.Node;

public class DoubleLinkedLists03 {

    Node03 head;
    Node03 tail;

    public DoubleLinkedLists03() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa03 data) {
        Node03 newNode = new Node03(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Mahasiswa03 data) {
        Node03 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(key)) {
                Node03 newNode = new Node03(data);
                newNode.next = current.next;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                newNode.prev = current;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
        System.out.println("NIM tidak ditemukan. Tidak dapat menyisipkan data.");
    }


    public void print() {
        Node03 current = head;
        while (current != null) {
            current.data.Tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            System.out.println("Data yang terhapus adalah: ");
            head.data.Tampil();
            head = tail = null;
        } else {
            System.out.println("Data yang terhapus adalah: ");
            head.data.Tampil();
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong, tidak ada yang dihapus.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public Node03 search(String nim) {
        Node03 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(nim)) {
                return current;
            }
            current = current.next;
        }
        return null; 
    }

    public void add(int index, Mahasiswa03 data) {
        if (index < 0 || index > (isEmpty() ? 0 : size())) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        Node03 current = head;
        for(int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node03 newNode = new Node03(data);
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;
    }
    
    public void removeAfter(String key) {
        Node03 current = head;
        while (current != null) {
            if (current.data.nim.equalsIgnoreCase(key)) {
                if (current.next != null) {
                    Node03 toDelete = current.next;
                    current.next = toDelete.next;
                    if (toDelete.next != null) {
                        toDelete.next.prev = current;
                    } else {
                        tail = current;
                    }
                    System.out.println("Data setelah NIM " + key + " berhasil dihapus:");
                    toDelete.data.Tampil();
                    return;
                } else {
                    System.out.println("Tidak ada data setelah NIM " + key);
                    return;
                }
            }
            current = current.next;
        }
        System.out.println("NIM tidak ditemukan.");
    }

     public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size()) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size() - 1) {
            removeLast();
            return;
        }
        Node03 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data yang dihapus:");
        current.data.Tampil();
    }

    public void getFirst() {
        if (!isEmpty()) {
            System.out.println("Data pertama:");
            head.data.Tampil();
        } else {
            System.out.println("List kosong.");
        }
    }

    public void getLast() {
        if (!isEmpty()) {
            System.out.println("Data terakhir:");
            tail.data.Tampil();
        } else {
            System.out.println("List kosong.");
        }
    }

    public void getIndex(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        Node03 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks ke-" + index + ":");
        current.data.Tampil();
    }

    public int size() {
        int count = 0;
        Node03 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

  }