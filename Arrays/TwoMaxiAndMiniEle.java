// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//               Maximum element is: 9

// Input: arr[] = {22, 14, 8, 17, 35, 3}
// Output:  Minimum element is: 3
//               Maximum element is: 35


import java.util.*;

public class TwoMaxiAndMiniEle {
    public static void main(String[] args) {

        // int[] arr = {3, 5, 4, 1, 9};
        int[] arr = {22, 14, 8, 17, 35, 3};
        
        int max = 0;
        int min = 0;

        // **********************1.Most simple sort approch**************************** 
        
        // Arrays.sort(arr);
        
        // System.out.println("Minimum element: "+ arr[0]);
        // System.out.println("Maximum element: "+arr[arr.length-1]);
        
        
        
        // **********************2. Compare and store approch **************************** 

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                max = Math.max(arr[i],arr[j]);
                min = Math.min(arr[i],arr[j]);
            }
        }

        System.out.println("Minimum element: "+ min);
        System.out.println("Maximum element: "+ max);
    }
}
