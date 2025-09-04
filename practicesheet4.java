import java.util.Scanner;

public class practicesheet4 {
    public static void myFunc(int x, int y) {
        int c = x + y;
        System.out.println("Sum is: " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // ✅ Correct Scanner usage

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Method Calling");
        myFunc(num1, num2);

        sc.close();   // ✅ Scanner को बंद करना अच्छा practice है
    }
}