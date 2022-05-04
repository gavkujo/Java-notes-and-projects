import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        int fi[] = new int[5];
        try (Scanner oj = new Scanner(System.in)) {
            int k = oj.nextInt();
            for(int i = 0 ; i < 5 ; i++){
                fi[i] = k;
            }
        }
    }
    public static int fact(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        return num * fact(num-1);
    }
    // public static void main(String[] args) {
    //     System.out.println(fact(5));
    // }
}
