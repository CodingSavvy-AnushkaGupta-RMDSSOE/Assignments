class ArrayAssignment{
    public static void main(String[] args) {
        /*int[] arr ={1,3,5,7};
        System.out.println(linearSearch(arr, 3));*/
        int[] arr={1,2,2,3,4,4};
        System.out.println(removeDuplicates(arr));
    }

    static int[] removeDuplicates(int[] arr){
        //BUT THIS IS ONLY FOR SORETED ARRAY 
        //{1,1,3,3,4,5} ->> {1,3,4,5};
        if(arr.length == 0) return 0;
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
            return i+1;
    }

    static int[] moveZerosToEnd(int[] arr){
        
    }

    static int linearSearch(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                
                return i;
            }
        }
        return -1;
    }
}