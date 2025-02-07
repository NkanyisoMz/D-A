//Given an array, move zero's to the end of the array an keep order of other numbers  
public class MoveZeroEnd {

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] );
        }
        System.out.println();
    }
    public static void moveZeros(int[] arr, int n){
        int j = 0;
        for (int i =0; i < n; i++){
            if (arr[i] != 0 && arr[j] == 0){
                int temp =arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] array = {7,0,0, 3, 5, 1, 1};
        printArray(array);
        moveZeros(array, array.length);
        printArray(array);

    }
}