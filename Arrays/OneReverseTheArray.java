//Reverse the given array
// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}

import java.util.*;

public class OneReverseTheArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        // Approch 1 -> Introducing new array
        
        // int[] temp = new int[arr.length];

        // for (int i = arr.length-1, j=0; i >= 0; i--) {
        //     temp[j] = arr[i];
        //     j++;
        // }

        // for (int i = 0; i < temp.length; i++) {
        //     arr[i] = temp[i];
        // }

        // System.out.println(Arrays.toString(arr));


        // Approch 2 -> In array first and last index swapping

        int start = 0;
        int end = arr.length-1;

        int temp = 0;

        while (start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));


    }
}