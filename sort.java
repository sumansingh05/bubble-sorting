public class sort {

    static void sorting(int[] arr){
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
        int[] arr = {12,76,32,9,65,79,31};
        System.out.print("Array before sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        sorting(arr);

        System.out.print("Array after sorting:");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
