//Given an array n-1 distinct numbers in the range of 1 to n.
//Find missing number in it

/*NB: We find it in O(n) time complexity
Mathematical Approach uses, n*(n+1)/2 to add all numbers in the array 
and substract iteratively the numbers in the array to remain with the missing value.*/

public class FindMissingValue {
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] array = {7, 2, 4, 3, 5, 1};
        printArray(array);
        System.out.println(findMissingNumber(array));

    }
}