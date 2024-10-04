import java.util.*;

public class WeaponBoxes {

    // Function to check if a number is a triangular number
    public static boolean isTriangular(int n) {
        int x = (int) Math.sqrt(2 * n);
        return n == x * (x + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the weights of the boxes
        String input = scanner.nextLine();
        String[] weightsStr = input.split(" ");
        List<Integer> weights = new ArrayList<>();
        for (String str : weightsStr) {
            weights.add(Integer.parseInt(str));
        }
        
        // Read N and K
        String[] nk = scanner.nextLine().split(" ");
        int N = Integer.parseInt(nk[0]);
        int K = Integer.parseInt(nk[1]);
        
        // To track the cycles and number of times a box remains unshifted
        Map<Integer, Integer> unshiftedCount = new HashMap<>();
        List<Integer> selectedBoxes;
        
        int totalLaborCost = 0;
        boolean cycleOngoing = true;
        
        while (cycleOngoing) {
            // Select first N boxes
            selectedBoxes = new ArrayList<>(weights.subList(0, Math.min(N, weights.size())));
            List<Integer> nextWeights = new ArrayList<>();
            
            for (int i = 0; i < selectedBoxes.size(); i += 2) {
                if (i + 1 < selectedBoxes.size()) {
                    // Compare two boxes
                    if (selectedBoxes.get(i) > selectedBoxes.get(i + 1)) {
                        nextWeights.add(selectedBoxes.get(i + 1));
                        nextWeights.add(selectedBoxes.get(i));
                    } else {
                        nextWeights.add(selectedBoxes.get(i));
                        nextWeights.add(selectedBoxes.get(i + 1));
                    }
                } else {
                    // If there's an odd box out, just add it
                    nextWeights.add(selectedBoxes.get(i));
                }
            }
            
            // Track which boxes have been shifted
            List<Integer> shiftedBoxes = new ArrayList<>();
            for (int weight : nextWeights) {
                if (!weights.contains(weight)) {
                    shiftedBoxes.add(weight);
                }
            }
            
            // Remove shifted boxes from original and add back the remaining
            weights = new ArrayList<>(weights.subList(selectedBoxes.size(), weights.size()));
            weights.addAll(nextWeights);
            
            // Increment the unshifted count for each box
            for (int weight : selectedBoxes) {
                if (!nextWeights.contains(weight)) {
                    unshiftedCount.put(weight, unshiftedCount.getOrDefault(weight, 0) + 1);
                } else {
                    unshiftedCount.put(weight, 0);
                }
            }
            
            // Check if any box has remained unshifted K times
            cycleOngoing = false;
            for (int count : unshiftedCount.values()) {
                if (count >= K) {
                    cycleOngoing = false;
                    break;
                } else {
                    cycleOngoing = true;
                }
            }
            
            // Calculate the total cost of labor for non-triangular weights
            for (int box : shiftedBoxes) {
                if (!isTriangular(box)) {
                    totalLaborCost += box;
                }
            }
        }

        // Print the total amount need to be paid for the labor
        System.out.println(totalLaborCost);
        scanner.close();
    }
}