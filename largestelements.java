import java.util.Scanner;
public class largestelements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int large=0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i]> large){
                 large = arr[i];
            }
            
        }
        System.out.println("Largest element : " + large);
        
    }
   
    
}