public class selectionsort {
    public static void selection(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        
        }
       int temp=arr[min];
       arr[min]=arr[i];
       arr[i]=temp; 
    }
    for (int i = 0;i<arr.length;i++) {
        System.out.println(arr[i]+" ");
        
    }
}
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        selection(arr);
    }
}
