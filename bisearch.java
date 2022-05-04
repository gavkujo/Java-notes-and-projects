public class bisearch {
    public static int binary(int[] list, int target){
        int left = 0;
        int right = list.length - 1;
        System.out.println(left+ " "+ right);
        System.out.println(list);
        while(left <= right){
            int middle = (left+right)/2;
            if (target < list[middle]){
                right = middle-1;
                System.out.println(right+ " -1 kiya");
            } 
            if (target > list[middle]){
                right = middle+1;
                System.out.println(right+ " +1 kiya");
            }
            else{
                return middle;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(binary(a, 3));
    }
}
