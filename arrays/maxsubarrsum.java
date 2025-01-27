package arrays;
import java.util.Scanner;
public class maxsubarrsum {
    public static void sub(int arr[]){
        int currsum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    currsum+=arr[k];   
                }
                System.out.println(currsum);
                if(currsum>max){
                    max=currsum;
                }  
            }  
        }
        System.out.println("Max:"+max);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        sub(arr);
    }
}
