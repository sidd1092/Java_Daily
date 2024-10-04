
import java.util.*;

public class CODEVITA_VIPCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] priorities = new int[n];
        for (int i = 0; i < n; i++)
            priorities[i] = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        while (true) {
            int maxPriority = priorities[0];
            int maxIndex = 0;
            for (int i = 1; i < n; i++) {
                if (priorities[i] > maxPriority) {
                    maxPriority = priorities[i];
                    maxIndex = i;
                }
            }
            count++;
            if (maxIndex == k - 1)
                break;
            for (int i = 0; i < maxIndex; i++)
                priorities[i]++;
            priorities[maxIndex] = -1;
        }
        System.out.print(count);
    }
}