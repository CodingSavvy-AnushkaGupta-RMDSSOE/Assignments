
import java.util.Arrays;
public class ArrayAss {
    public static void main(String[] args) {
        //int[] arr={2,3,0,5,0,8};
        //moveZerosToEnd(arr);
        //System.out.println(Arrays.toString(arr));
        //int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int result = maxSubarraySum(arr);
        //System.out.println(result);
        //int[] arr={2,3,2};
        //int result=votingAlgo(arr);
        //System.out.println((result));
        int[] arr={0,1,2,0,2,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void moveZerosToEnd(int[] arr){
        //{1,0,3,4,0,6}
        //{1,3,4,6,0,0}
        //this is a two pointer approacah 
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                j++;
            }
        }


        
    }


    static int maxSubarraySum(int[] arr){
        //maximum sum of subarray - this is kadanes algo
        //keep track if sum -ve thne restart
        int maxisum=Integer.MIN_VALUE;
        int currsum=0;
        for (int ele : arr) {
            currsum = currsum + ele;
            maxisum = Math.max(maxisum, currsum);
            // reset if negative
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxisum;
    }


    static int votingAlgo(int[] arr){
        //candidate and vote
        int vote=0;
        int candidate=0;
        for(int i :arr){
            if (vote == 0) {
                candidate = i;
            }
            if(i == candidate ){
                vote++;
            }
            else{
                vote--;
            }
            
        }
        return candidate;
    }


    static void sortColors(int[] arr){
        //called as dutch national flag algo
        //we use it for 0,1,2
        // Instead of sorting normally, we use 3 pointers and do it in one pass (O(n))   
        int low=0;
        int mid=0;
        int high=arr.length-1;

        while(mid<high){
            if(arr[mid] == 0){
                //swap with low
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid] ==2){
                //swap with high;
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
    }
    
    }


}
