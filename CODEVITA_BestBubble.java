import java.util.*;
public class CODEVITA_BestBubble
{
    public static int bubbleSort(int[] arr, int n, boolean ascending) 
    {
        int swap = 0;
        boolean swapped;
        for (int i = 0; i < n; i++) 
        {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (ascending && arr[j] > arr[j + 1] || !ascending && arr[j] < arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return swap;
    }
    public static int findMinSwaps(int[] arr) 
    {
        int n = arr.length;
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int ASC = bubbleSort(arr1, n, true);
        int DESC = bubbleSort(arr2, n, false);
        return Math.min(ASC, DESC);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
        System.out.print(findMinSwaps(arr));
    }
}