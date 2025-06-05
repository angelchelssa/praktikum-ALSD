public class SingleLinkedList03 {;
        NodeMahasiswa03 head;
        NodeMahasiswa03 tail;

    boolean isEmpty() {
        return (head == null);
    }    

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa03 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }


    public void addFirst(Mahasiswa03 input) {
        NodeMahasiswa03 ndInput = new NodeMahasiswa03(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa03 input ) {
        NodeMahasiswa03 ndInput = new NodeMahasiswa03(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa03 input) {
        NodeMahasiswa03 ndInput = new NodeMahasiswa03(input, null);
        NodeMahasiswa03 tmp = head;
        do {
            if (tmp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            tmp = tmp.next;
        }while (tmp != null);
    }

    public void  insertArt(int index, Mahasiswa03 input) {
        if (index < 0 ) {
            System.out.println("indeks salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            NodeMahasiswa03 tmp = head;
            for (int i = 0; i < index - 1; i++) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa03(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilInformasi();
    }

    public int indexOf(String key){
        NodeMahasiswa03 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa03 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak dapat dihapus");
        } else {
            NodeMahasiswa03 tmp = head;
            while (tmp != null) {
                if ((tmp.data.nama.equalsIgnoreCase(key)) && (tmp == head)) {
                    removeFirst();
                    break;
                } else if (tmp.data.nama.equalsIgnoreCase(key)) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    public void removeAt(int index) {
       if (index == 0)  {
        removeFirst();
       } else {
        NodeMahasiswa03 tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        if (tmp.next == null) {
            tail = tmp;
        }
       }
    }

}