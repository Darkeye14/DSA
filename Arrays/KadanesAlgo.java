package Arrays;
//largest value subArray

//brute force
public class KadanesAlgo {
    public static int maxArray(int[] arr, int n){
        int maxi = Integer.MIN_VALUE;
        for (int i =0 ; i<n;i++){
            for( int j=i;j < n;j++){
                int sum =0;
                for (int k =i; k<=j;k++){
                    sum+=arr[k];
                }
                maxi = Math.max(sum,maxi);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxArray(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }
}

//optimal

//public class KadenesAlgo {
//    public static long maxSubarraySum(int[] arr, int n) {
//        long maxi = Long.MIN_VALUE; // maximum sum
//        long sum = 0;

//        for (int i = 0; i < n; i++) {
//
//            sum += arr[i];
//
//            if (sum > maxi) {
//                maxi = sum;
//            }
//
//            // If sum < 0: discard the sum calculated
//            if (sum < 0) {
//                sum = 0;
//            }
//        }
//
//
//        return maxi;
//    }
//
//    public static void main(String args[]) {
//        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int n = arr.length;
//        long maxSum = maxSubarraySum(arr, n);
//        System.out.println("The maximum subarray sum is: " + maxSum);
//
//    }
//
//}

