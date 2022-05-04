public class Main {
    static int[] a = {1,2,3,4,5};
    public static void main(String[] args) {
        Student nayaobject = new Student("John", 69);
        Student nayaobject2 = new Student("Sam", 420);
        // System.out.println(nayaobject.name+" "+nayaobject.roll_no);
        // System.out.println(nayaobject2.name+" "+nayaobject2.roll_no);
        nayaobject.print();
        nayaobject2.print();
        System.out.println(Math.sqrt(3.0*3.0+4.0*4.0));
    }
}