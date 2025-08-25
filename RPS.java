import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String M = sc.nextLine();
        switch (M) {
            case "rock":
            System.out.println("paper");
                break;
            case "paper":
            System.out.println("scissors");
                break;
            case "scissors":
            System.out.println("rock");
                break;
            default:
                System.out.println("Invalid input");
                break;
        } 
    }
}