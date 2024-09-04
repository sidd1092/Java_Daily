// print subrrays with sum k
import java.util.Scanner;
public class tcs_ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int k = sc.nextInt();
        System.out.println("The subarrays with sum " + k + " are:");
        subarraysWithSumK(arr, n, k);
        sc.close();
    }

    public static void subarraysWithSumK(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    for (int l = i; l <= j; l++) {
                        System.out.print(arr[l] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}