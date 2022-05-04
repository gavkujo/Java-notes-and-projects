public class area {
    float l;
    float b;
    public static void main(String[] args) {
        area obj1 = new area();
        obj1.setDim(1,2);
        System.out.println(obj1.getArea());
        area obj2 = new area();
        obj2.setDim(10,20);
        System.out.println(obj2.getArea());
    }

    public void setDim(float l, float b){
        this.l = l;
        this.b = b;
    }

    public float getArea(){
        return l*b;
    }
}
