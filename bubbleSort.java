public class bubbleSort{

    public static void BubbleSort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            boolean flag = false;
            for(int j=0;j<n-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }        
    }
    public static void main(String[] args) {
        int[] arr = {3,67,89,54,78,9,65};       
        BubbleSort(arr);
        for(int i:arr){
            System.out.print(i + " ");
        }
        
    }
}