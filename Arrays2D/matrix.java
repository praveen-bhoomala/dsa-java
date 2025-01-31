package Arrays2D;

import java.util.Scanner;
public class matrix {
    public static boolean update(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        int n=sc.nextInt();
        System.out.println("enter m value:");
        int m=sc.nextInt();
        System.out.println("enter key value:");
        int key=sc.nextInt();

        int matrix[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(update(matrix,key));

    }
}
