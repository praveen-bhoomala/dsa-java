package arrays;
import java.util.Scanner;
public class linearsearch {
    public static int index(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }   
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      System.out.println("enter key:");
        int key=sc.nextInt();
        int value=index(arr, key);
        if(value==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("key is at "+value);
        }
    }
}