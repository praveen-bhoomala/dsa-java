package patterns;

import java.util.Scanner;

public class patternwithchar{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char c='a';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
         
            System.out.print(c);
            c++;
        }
        System.out.println();
    }
    }
}


