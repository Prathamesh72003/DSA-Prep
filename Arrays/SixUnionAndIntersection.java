// Union
// Input:
// 5 3
// 1 2 3 4 5
// 1 2 3
// Output: 
// 5
// Explanation: 
// 1, 2, 3, 4 and 5 are the
// elements which comes in the union set
// of both arrays. So count is 5.

// Intersection
// Input:
// n = 5, m = 3
// a[] = {89, 24, 75, 11, 23}
// b[] = {89, 2, 4}

// Output: 1

// Explanation: 
// 89 is the only element 
// in the intersection of two arrays.

import java.util.*;

public class SixUnionAndIntersection {
    
    public static void unionfun(int[] arr1, int[] arr2){
       Arrays.sort(arr1); 
       Arrays.sort(arr2);
       
       Set<Integer> myset = new HashSet<Integer>();

       for (int i = 0; i < arr1.length; i++) {
            myset.add(arr1[i]);
       }
       for (int i = 0; i < arr2.length; i++) {
            myset.add(arr2[i]);
       }

       System.out.println("Union of the two arrays is: "+ myset);
       System.out.println("Union Count: "+ myset.size());
    }
    
    
    public static void intersectionfun(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> mylist = new ArrayList<Integer>();

        int pointer1 = 0;
        int pointer2 = 0;


        while(true){
            if (pointer1 >= arr1.length || pointer2 >= arr2.length) {
                break;
            }
            
            if (arr1[pointer1] == arr2[pointer2]) {
                mylist.add(arr1[pointer1]);
                pointer1++;
                pointer2++;
            }else if(arr1[pointer1] > arr2[pointer2]){
                pointer2++;
            }else if(arr1[pointer1] < arr2[pointer2]){
                pointer1++;
            }
        }

        System.out.println("Intersecion of the two arrays is: "+ mylist);
        System.out.println("Intersection Count: "+ mylist.size());

    }

    
    public static void main(String[] args) {
        int[] arr1 = {3,2,4,1,4,2,1,6};
        int[] arr2 = {1,3,9,4,6};

        unionfun(arr1,arr2);
        intersectionfun(arr1,arr2);
    }
}
