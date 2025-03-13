public class faktorial03 {

    public int faktorialBfWhile(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto *= i;
            i++;
        }
    }
    int  faktorialDC(int n) {
        if (n==1) {
            return 1;
        }else {
            int fakto = n * faktorialDC(n- 1);
            return fakto;
        }
    }
}