public class fib {
    public static int fibmaker(int n){
        if (n <= 1){
            return n;
        }
        else{
            return fibmaker(n-1)+fibmaker(n-2);
        }
    }
    public static int[] fibseries(int n){
        int[] m = new int[n];
        for (int i = 0; i < n; i++){
            m[i] = fibmaker(i);
        }
        return m;
    }
    public static void getseries(int[] n){
        for(int x : n){
            System.out.print(x+" , ");
        }
    }
    public static void main(String[] args) {
        getseries(fibseries(10));
    }
}
