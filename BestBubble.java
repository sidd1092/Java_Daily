import java.util.Scanner;
public class BestBubble {
    public static int bubbleSort(int[] arr,int n , boolean ascending )
    {
        int swaps = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i - 1; j++)
            {
                if(ascending && arr[j] > arr[j + 1] || !ascending && arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        return swaps;
    }
    public static int findMinSwaps(int[] arr){
        int n = arr.length;
        int[] arrASC = arr.clone();
        int[] arrDESC = arr.clone();
        int swapsASC = bubbleSort(arrASC, n, true);
        int swapsDESC = bubbleSort(arrDESC, n, false);
        return Math.min(swapsASC, swapsDESC);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(findMinSwaps(arr));
        sc.close();
    }
}
