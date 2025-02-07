//Given an array, return second largest integer

public class SecondMaximum {
    public static int secondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i =0; i < arr.length; i++){
            if (arr[i]>max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] != max && arr[i] >secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 5, 1, 1};

        System.out.println(secondMax(array));

    }
    }
