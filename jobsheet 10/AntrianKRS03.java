public class AntrianKRS03 { 
    Mahasiswa03[]  data; 
    int front; 
    int rear; 
    int size; 
    int max; 
 
    public AntrianKRS03(int max) { 
        this.max = max; 
        this.data = new Mahasiswa03[max]; 
        this.size = 0; 
        this.front = 0; 
        this.rear= -1; 
    } 
 
    public boolean IsEmpty(){ 
        if(size == 0){ 
            return true; 
        }else{ 
            return false; 
        } 
    } 
 
    public boolean IsFull() { 
        if (size == max) { 
            return true; 
        }else { 
            return false; 
        } 
    } 

     public void tambahAntrian(Mahasiswa03 mhs) { 
        if (IsFull()) { 
            System.out.println("Antrian penuh, tidak dapat menambahkan mahasiswa."); 
            return; 
        } 
        rear = (rear + 1) % max; 
        data [rear] = mhs; 
        size++; 
        System.out.println(mhs.nama + " berhasil masuk ke antrian."); 
    } 
 
    public Mahasiswa03[] layaniMahasiswa04() { 
        System.out.println("Daftar Mahasiswa dalam Antrian: "); 
        System.out.println("NIM - NAMA - PRODI - KELAS"); 
 
        if (IsEmpty()) { 
            System.out.println("Antrian Kosong."); 
            return null; 
        } 
        Mahasiswa03[] mhsDipanggil = new Mahasiswa03[2]; 
        for (int i = 0; i < 2; i++){ 
            if (size > 0) { 
                mhsDipanggil[i] = data[front]; 
                front = (front + 1) % max; 
                size--; 
            }else { 
                mhsDipanggil[i] = null; 
            } 
        } 
        return mhsDipanggil; 
    } 
 
    public void tampilkanSemua() { 
        if (IsEmpty()) { 
            System.out.println("Antrian kosong."); 
            return; 
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: "); 
        System.out.println("NIM - NAMA - PRODI - KELAS"); 
        for (int i = 0; i < size; i++) { 
            int index = (front + i) % max; 
            System.out.println((i+1) + ". "); 
            data[index].tampilkanData(); 
        } 
    } 
 
    public void lihatTerdepan() { 
        if(IsEmpty()) { 
            System.out.println("Antrian kosong."); 
        }else { 
            System.out.println("Mahasiswa terdepan: "); 
            System.out.println("NIM - NAMA - PRODI - KELAS"); 
            data[front].tampilkanData(); 
        } 
    } 
 
    public void lihatAkhir() { 
        if (IsEmpty()) { 
            System.out.println("Antrian kosong."); 
        }else { 
            System.out.println("Mahasiswa dalam Antrian Terakhir"); 
            System.out.println("NIM - NAMA - PRODI - KELAS"); 
            data[rear].tampilkanData(); 
        } 
    } 

    public int getJumlahAntrian() { 
        return size; 
    } 
 
    public int getJumlahProsesKRD() { 
        return 30 - size; 
    } 
 
    public void clear() { 
        front = rear = -1; 
        size = 0; 
        System.out.println("Antrian berhasil dikosongkan."); 
    } 
} 