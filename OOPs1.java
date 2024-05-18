public class OOPs1 {
    int a =10;

    public void display(){
        System.out.println("The class and Object");
    }

    static int reverseNumber(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        OOPs1 obj = new OOPs1();
        obj.display();
        System.out.println(obj.a);
        int result = OOPs1.reverseNumber(4,26);
        System.out.println(result);
    }
}
