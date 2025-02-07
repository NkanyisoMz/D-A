//resize an array

public class ArrayResize {
    public static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] );
        }
        System.out.println();
    }
    public static int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i= 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {

        int[] array = {7, 0, 0, 3, 5, 1, 1};
        printArray(array);
        System.out.println(array.length);
        array = resize(array, 15);
        printArray(array);
        System.out.println(array.length);
    }
    }