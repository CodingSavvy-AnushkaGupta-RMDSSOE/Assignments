public class NumberOfSwaps {
    public static void main(String[] args) {
        int[] arr={2,53,5,12,4};
        System.out.println(bubbleSortWithSwapCount(arr));
    }

    static int bubbleSortWithSwapCount(int[] arr) {
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
}
