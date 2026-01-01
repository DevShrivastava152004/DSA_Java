import java.util.*;
public class Rotate_Array {
    static void rotateRight(int[] arr, int k)
    {
        int n = arr.length;
        // edge case: empty or single element array
        if (n == 0 || n == 1)
            return;
        k = k % n;

        reverseRange(arr , 0 , n-1);//Reverse the whole array
        reverseRange(arr , 0 , k-1);//Reverse the first k elements
        reverseRange(arr, k , n-1);// Reverse remaining elements
    }
    static void reverseRange(int[] arr, int l, int r)
    {
        while(l < r)
        {
            int temp = arr[l];
            arr[l]= arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    // main method 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        System.out.println("Original Array: " + Arrays.toString(arr));

        rotateRight(arr,k);
        System.out.println("Array after rotating right by " + k + ": " +Arrays.toString(arr));
    }
}