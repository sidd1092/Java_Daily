class BuubleSort_recursive {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 5241, 64, 6, 746, 87, 4, 3, 2, 1, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        sort(arr, 0, 0, arr.length);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void sort(int arr[], int i, int j, int n) {
        if (i >= n - 1) {
            return;
        } else {
            if (j >= n - 1 - i) {
                sort(arr, i + 1, 0, n);
            } else {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                sort(arr, i, j + 1, n);
            }
        }
    }
}