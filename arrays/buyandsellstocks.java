package arrays;

import java.util.Scanner;

public class buyandsellstocks {
    public static int buyandsellstock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
            int profit=prices[i]-buyprice;
            maxprofit=Math.max(maxprofit, profit);
        }else{
            buyprice=prices[i];
        }
    }
    return maxprofit;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int prices[]=new int[n];
    for(int i=0;i<n;i++){
        prices[i]=sc.nextInt();
    }
    System.out.println(buyandsellstock(prices));
}
}
