package Arrays2D;

import java.util.Scanner;

public class smallestinmatrix {
    public static void smallest(int matrix[][]){
        int min=matrix[0][0];
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            
        }
        System.out.println("Min is:"+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        System.out.println("enter m value:");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Matrix elements:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        smallest(matrix);
    }
}
