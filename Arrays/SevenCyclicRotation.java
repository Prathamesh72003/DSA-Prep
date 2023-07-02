// Cyclically rotate an array by one
// Input:
// N = 5
// A[] = {1, 2, 3, 4, 5}
// Output:
// 5 1 2 3 4

import java.util.*;

public class SevenCyclicRotation {
    
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};

        int temp = arr[arr.length - 1];

        int[] temparr = new int[arr.length];

        temparr[0] = temp;

        for (int i = 1; i < arr.length; i++) {
            temparr[i] = arr[i-1];
        }

        System.out.println(Arrays.toString(temparr));

    }
}
