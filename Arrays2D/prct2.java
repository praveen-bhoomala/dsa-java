package Arrays2D;

public class prct2 {
    public static void sum(int matrix[][]){
        int sum=0;
        
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[1][j];
            }
        
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[][] matrix = { {1,4,9},{11,4,3},{2,2,3} };
        sum(matrix);
    }
}
