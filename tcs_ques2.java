// max element in window of k size
import java.util.Scanner;
public class tcs_ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the window size");
        int k = sc.nextInt();
        int[] res = maxElementInWindow(arr, n, k);
        System.out.println("The maximum elements in the window of size " + k + " are:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }

    public static int[] maxElementInWindow(int[] arr, int n, int k) {
        int[] res = new int[n - k + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            res[i] = max;
        }
        return res;
    }
}