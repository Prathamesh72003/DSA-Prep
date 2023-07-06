// Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

// Input:
// N = 5
// Arr[] = {1,2,3,-2,5}
// Output:
// 9
// Explanation:
// Max subarray sum is 9
// of elements (1, 2, 3, -2, 5) which 
// is a contiguous subarray.

import java.util.*;

public class EightLargestSumContigiousArr{
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        // int[] arr = {-1,-2,-3,-4};

        int maxsum=0;
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            maxsum = Math.max(maxsum,sum);
        }

        System.out.println(maxsum);

    }
}