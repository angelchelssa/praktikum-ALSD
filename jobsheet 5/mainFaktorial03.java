import java.util.Scanner;
public class mainFaktorial03 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("masukkan nilai: ");
    int nilai = input.nextInt();
    
    faktorial03 fk = new faktorial03();
    System.out.print("nilai faktorial " + nilai + 
            "Menggunakan BF: " + fk.faktorialBf(nilai));
    System.out.println("\nnilai faktorial " + nilai +  
            "Menggunakan DC: " + fk.faktorialDC(nilai));
    }
}