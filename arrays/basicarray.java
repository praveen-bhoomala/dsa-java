package arrays;

import java.util.Scanner;

public class basicarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[] =new int[100];
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("maths:"+marks[0]);
        System.out.println("phy:"+marks[1]);
        System.out.println("chem:"+marks[1]);
    }
}
