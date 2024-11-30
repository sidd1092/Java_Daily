import java.util.*;

public class CODEVITA_MatchingEarrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of earrings
        int n = sc.nextInt();
        List<List<int[]>> earrings = new ArrayList<>();

        // Read earrings' vertices
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(); // Number of vertices
            List<int[]> vertices = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                vertices.add(new int[]{x, y});
            }
            earrings.add(vertices);
        }

        // Find matching pair
        int[] pair = findMatchingPair(earrings);
        if (pair != null) {
            System.out.print(pair[0] + " " + pair[1]);
        } else {
            System.out.print("No matching pair found");
        }
    }

    private static int[] findMatchingPair(List<List<int[]>> earrings) {
        int n = earrings.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (areShapesMatching(earrings.get(i), earrings.get(j))) {
                    return new int[]{i + 1, j + 1}; // Return 1-based indices
                }
            }
        }
        return null; // No match found
    }

    private static boolean areShapesMatching(List<int[]> shape1, List<int[]> shape2) {
        if (shape1.size() != shape2.size()) return false;

        // Normalize both shapes
        List<int[]> norm1 = normalizeShape(shape1);
        List<int[]> norm2 = normalizeShape(shape2);

        // Check all rotations of norm2
        for (int i = 0; i < norm2.size(); i++) {
            if (areNormalizedShapesEqual(norm1, norm2)) {
                return true;
            }
            Collections.rotate(norm2, 1); // Rotate norm2 by one vertex
        }

        return false;
    }

    private static List<int[]> normalizeShape(List<int[]> shape) {
        // Translate the shape so that the first vertex is at (0, 0)
        int[] first = shape.get(0);
        int dx = first[0], dy = first[1];
        List<int[]> normalized = new ArrayList<>();
        for (int[] vertex : shape) {
            normalized.add(new int[]{vertex[0] - dx, vertex[1] - dy});
        }

        // Sort vertices for canonical order
        normalized.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        return normalized;
    }

    private static boolean areNormalizedShapesEqual(List<int[]> shape1, List<int[]> shape2) {
        for (int i = 0; i < shape1.size(); i++) {
            if (!Arrays.equals(shape1.get(i), shape2.get(i))) {
                return false;
            }
        }
        return true;
    }
}
