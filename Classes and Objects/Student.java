public class Student {
    String name;
    int roll_no;
    int phone_no;
    String address;
    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public void print(){
        System.out.println(name+" "+roll_no);
    }
}
