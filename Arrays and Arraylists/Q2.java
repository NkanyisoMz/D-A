//Given an array or string, reverse it


public class ReverseArray {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] );
        }
        System.out.println();
    }
    public static int[] reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        printArray(reverseArray(myArray,0,myArray.length-1));
    }
    }