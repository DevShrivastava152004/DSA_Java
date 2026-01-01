
import java.util.Arrays;
public class reverse_an_array {
    static void reverse(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        while( left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args)
{
    int[] arr = {1,2,3,4,5};
    System.out.println("Original Array:" + Arrays.toString(arr));
    reverse(arr);
    System.out.println("Reversed Array: " + Arrays.toString(arr));
}
}
