public class PrefixSum
{
    public static int[] calculatePrefixSum(int[] arr)
    {
        int n = arr.length;

        int[] prefix = new int[n];
        // Build prefix sum array
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++)
        {
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static void main(String[] args)
    {
        int[] arr = {2,4,1,3,5};

        int[] prefix = calculatePrefixSum(arr);

        int left = 1;
        int right = 3;

        int rangeSum;
        if(left == 0)
        {
            rangeSum = prefix[right];
        }
        else{
            rangeSum = prefix[right] - prefix[left-1];
        }
        System.out.println("Sum from index " + left + " to " + right + " = " + rangeSum);
    }
    }