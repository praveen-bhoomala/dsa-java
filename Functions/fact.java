package Functions;

import java.util.Scanner;

public class fact {
    public static void fact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Fact:"+fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);
    }
}
