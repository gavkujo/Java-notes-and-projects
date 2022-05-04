import java.util.*;

public class prime {
    public static void primechecker(){
        try (Scanner pornot = new Scanner(System.in)) {
            System.out.println("enter no. ");
            int x = 0;
            int n = pornot.nextInt();
            for (int i = 2 ; i <= (n/2) ; i++){
                if (n % i == 0){
                    x++;
                }
            }
            if (x >= 1){
                System.out.println("The Number is not prime");
            }
            else if (x == 0){
                System.out.println("The number is prime");
            }
        }
    }
    public static void main(String[] args) {
        primechecker();
    }
}
