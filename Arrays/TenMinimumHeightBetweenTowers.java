import java.util.Arrays;

public class TenMinimumHeightBetweenTowers{
    public static void main(String[] args) {
        
        int[] arr = {2,6,3,4,7,2,10,3,2,1};
        int k = 5;

        int n = arr.length;

        Arrays.sort(arr);

        int low, high;

        int diff = arr[n-1] - arr[0];

        int max = 0;
        int min = 0;

        for (int i = 1; i < arr.length; i++) {
            
            if(arr[i]-k < 0){
                continue;
            }

            max = Math.max(arr[i-1]+k,arr[n-1]-k);
            min = Math.min(arr[0]+k, arr[i]-k);

            diff = Math.min(diff, max-min);
        }

        System.out.println(diff);

    }
}

