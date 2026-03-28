
public class ArrayAss {
    public static void main(String[] args) {
        //int[] arr={2,3,0,5,0,8};
        //moveZerosToEnd(arr);
        //System.out.println(Arrays.toString(arr));
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubarraySum(arr);
        System.out.println(result);
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
}
