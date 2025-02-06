//Given an array of intergers, return an array the array with even integers removed
public class RemoveEvenInteger{
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] );
        }
        System.out.println();
    }
    public static int[] removeInt(int[] arr){
        int oddCount = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    public static void main(String[] args) {

        RemoveEvenInteger arrayUtil = new RemoveEvenInteger();
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        printArray(myArray);
        int[] result = removeInt(myArray);
        printArray(result);
    }
}