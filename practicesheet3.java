public class practicesheet {
    public static void myFunc(int x, int y) {   // method में 2 parameters दिए
        int c = x + y;
        System.out.println("Sum is: " + c);
    }

    public static void main(String[] args) {
        System.out.println("Method Calling");

       
        myFunc(5, 10);    
        myFunc(20, 30);   
    }
}