package Functions;

import java.util.Scanner;
public class primeinrange {
    public static boolean prime(int n){
        if(n<=1){
            
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
                
            }
          return true;
            
        }
        public static void primeinrange(int n){
            for( int i=1;i<=n;i++){
                if(prime(i)){
                    System.out.print(i+" ");
                }
            }
        }

    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        primeinrange(n);
    }
}
    

