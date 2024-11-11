import java.util.*;
class basics_linkedlist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            ll.add(sc.nextInt());
        }
        System.out.println(ll);
    }
}