import java.util.*;
class Number_of_Dice_Rolls_with_Target_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        if (target < 1 || target > 6){
            System.err.println("OOOOH NOOOOOO FAAAAAKKKKEEEEEEE");
            System.exit(1);
        }
        solve( target ,"");
        sc.close();
    }
    public static void solve(int target, String output) {
        if(target == 0) {
            System.out.println(output);
            return;
        }
        for(int i = 1; i <= target; i++) {
                solve( target - i,output + i);
            }
        }
        
}