public class practicesheet {
    public void myFunc() {
        int x = 5;
        int y = 10;
        int c = x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        practicesheet obj1 = new practicesheet();
        System.out.println("Method Calling");
        obj1.myFunc();
    }
}
