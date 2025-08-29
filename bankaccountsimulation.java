public class bankaccountsimulation {
    static float deposit(float add){
        System.out.println("Amount deposited: "+add);
        return bal+add;

    }
    static float withdraw(float sub){
        if(sub>bal){
            System.out.println("Insufficient balance");
            return bal;
        }else{
            System.out.println("Amount withdrawn: "+sub);
            return bal-sub;
        }
    }
    static void checkbalance(){
        System.out.println("Current balance: "+bal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bal=0;
        System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to check balance, 4 to exit");
        int choice = sc.nextInt();
        while(choice!=4){
            switch(choice){
                case 1:
                System.out.println("Enter amount to deposit: ");
                float add = sc.nextFloat();
                bal=deposit(add);
                break;
                case 2:
                System.out.println("Enter amount to withdraw: ");
                float sub = sc.nextFloat();
                bal=withdraw(sub);
                break;
                case 3:
                checkbalance();
                break;
                default:
                System.out.println("Invalid choice");
                break;
            }
            System.out.println("Enter 1 to deposit, 2 to withdraw, 3 to check balance, 4 to exit");
            choice = sc.nextInt();
        }
    }
}
    
