//Return a minimum from an array
public class MinumunValue {

    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] );
        }
        System.out.println();
    }
    public static int minimumValue(int[] arr){
        if (arr == null || arr.length ==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[] array = {7,3,5,1,1};
        printArray(array);
        System.out.println(minimumValue(array));
    }
}
