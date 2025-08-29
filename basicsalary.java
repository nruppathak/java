public class basicsalary {
    public static void main(String[] args) {
        
        int bs=30000;
        double hra=0.1*bs;
        double da=0.15*bs;
        double pf=0.12*bs;
        double grosssalary=bs+hra+da-pf;
        System.out.println("Gross Salary is: "+grosssalary);
    }       
}
