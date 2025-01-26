package arrays;

import java.util.Scanner;

public class binarysearch {
    public static int binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
            
        }
        return -1;
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter key:");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=binary(arr, n);
        if(result==-1){
            System.out.println("Not found");
        }else{
            System.out.println("key found at "+result);
        }
    }
}
