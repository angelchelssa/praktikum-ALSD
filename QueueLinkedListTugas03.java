public class QueueLinkedListTugas03 {

    NodeTugas03 front;
    NodeTugas03 rear;
    int size;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaTugas03 data) {
        NodeTugas03 newNode = new NodeTugas03(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public MahasiswaTugas03 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        MahasiswaTugas03 data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    public MahasiswaTugas03 peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    public MahasiswaTugas03 peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return rear.data;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        NodeTugas03 current = front;
        System.out.println("Daftar Antrian:");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
