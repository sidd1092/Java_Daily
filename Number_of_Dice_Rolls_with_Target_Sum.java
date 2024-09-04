// import java.util.*;
// class Number_of_Dice_Rolls_with_Target_Sum{
//     public static ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int target = sc.nextInt();
//         if(target<1  || target >6)
//             System.err.println("OOH NNNOOOOOOOO FAAAKEEEE");
//         solve(target,0);
//         System.err.println(ls);
//     }
//     public static void solve(int input, int output) {
//         if(input == 0){
//             ArrayList<Integer> temp = new ArrayList<>();
//             for(int i=0;i<output;i++)
//                 temp.add(1);
//             ls.add(temp);
//             return;
//         }
//         for(int i=1;i<=6;i++){
//             if(input-i>=0)
//                 solve(input-i,output+1);
//         }
//     }
// }

 import java.util.*;

class Number_of_Dice_Rolls_with_Target_Sum {
    // List to store the combinations of dice rolls
    public static ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        
        // Validate the input
        if (target < 1 || target > 6) {
            System.err.println("Invalid input. The target sum must be between 1 and 6.");
            return; // Exit the program
        }
        
        // Solve the problem
        solve(target, new ArrayList<>());
        
        // Print the results
        System.out.println("Possible combinations of dice rolls:");
        for (ArrayList<Integer> combination : ls) {
            System.out.println(combination);
        }
    }

    public static void solve(int input, ArrayList<Integer> currentCombination) {
        // Base case: if input is 0, add the current combination to the results
        if (input == 0) {
            ls.add(new ArrayList<>(currentCombination)); // Make a copy of the current combination
            return;
        }
        
        // Recursive case: try each dice roll from 1 to 6
        for (int i = 1; i <= 6; i++) {
            if (input - i >= 0) {
                currentCombination.add(i); // Choose the dice roll
                solve(input - i, currentCombination); // Recursively solve for the remaining sum
                currentCombination.remove(currentCombination.size() - 1); // Un-choose the dice roll
            }
        }
    }
}

