package Functions;
import java.util.Scanner;
public class functionvoerloading {
    public static int sum2num(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static int sum2num(int a,int b,int c){
        int sum=a+b+c;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.print("Sum:"+sum2num(a, b, c));
    }
}


