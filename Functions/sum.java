package Functions;
import java.util.Scanner;
public class sum {
    public static int sum2num(int a,int b){
        int sum=a+b;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Sum:"+sum2num(a, b));
    }
}
