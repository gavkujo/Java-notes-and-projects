public class seqsearch {
    public static int search(int[] list, int target){
        for (int i = 0 ; i < list.length; i++){
            if (list[i] == target){
                return i;
            }
        }
        return -1; //if not found
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(search(a, 3));
    }
}