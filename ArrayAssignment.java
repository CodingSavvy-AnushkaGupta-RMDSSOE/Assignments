class ArrayAssignment{
    public static void main(String[] args) {
        /*int[] arr ={1,3,5,7};
        System.out.println(linearSearch(arr, 3));*/
    }

    static int removeDuplicates(){

    }

    static int[] moveZerosToEnd(int[] arr){
        //XOR 
        for(int i=0;i<arr.length;i++){
            arr[i]^arr[1+1];
        }
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