import java.util.Scanner;

public class temperaturecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temperature = sc.nextInt() ; 

        if (temperature > 0) {
            System.out.println("Safe for outside activities");
        } else {
            System.out.println("Too cold for output activities");
        }
        sc.close();
    }
}

