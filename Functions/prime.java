package Functions;
import java.util.Scanner;
public class prime {
    public static void prime(int n){
        if(n<=1){
            System.out.println(" prime");
            return;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print("not prime");
                return;
            }
                
            }
            System.out.print("prime");
        }

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
}
