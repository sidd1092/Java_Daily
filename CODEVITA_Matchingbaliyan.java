import java.util.*;

public class CODEVITA_Matchingbaliyan {

    public static List<Pair<Integer, Integer>> normalizeShape(List<Pair<Integer, Integer>> vertices) {
        int n = vertices.size();
        List<Pair<Integer, Integer>> minRotation = new ArrayList<>(vertices);

        for (int i = 0; i < n; i++) {
            List<Pair<Integer, Integer>> rotated = new ArrayList<>();
            rotated.addAll(vertices.subList(i, n));
            rotated.addAll(vertices.subList(0, i));

            if (comparePairLists(rotated, minRotation) < 0) {
                minRotation = new ArrayList<>(rotated);
            }
        }
        return minRotation;
    }

    public static int comparePairLists(List<Pair<Integer, Integer>> list1, List<Pair<Integer, Integer>> list2) {
        for (int i = 0; i < list1.size(); i++) {
            int cmp = list1.get(i).compareTo(list2.get(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        return 0;
    }

    public static List<Integer> findMatchingPairs(List<List<Pair<Integer, Integer>>> earrings) {
        Map<List<Pair<Integer, Integer>>, List<Integer>> normalizedShapes = new HashMap<>();

        for (int i = 0; i < earrings.size(); i++) {
            List<Pair<Integer, Integer>> normalized = normalizeShape(earrings.get(i));
            normalizedShapes.putIfAbsent(normalized, new ArrayList<>());
            normalizedShapes.get(normalized).add(i + 1);
        }

        for (Map.Entry<List<Pair<Integer, Integer>>, List<Integer>> entry : normalizedShapes.entrySet()) {
            if (entry.getValue().size() == 2) {
                return entry.getValue();
            }
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Pair<Integer, Integer>>> earrings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            List<Pair<Integer, Integer>> vertices = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                vertices.add(new Pair<>(x, y));
            }
            earrings.add(vertices);
        }

        List<Integer> result = findMatchingPairs(earrings);
        if (!result.isEmpty()) {
            System.out.print(result.get(0) + " " + result.get(1));
        } else {
            System.out.print("");
        }

        sc.close();
    }

    // Helper class to represent a pair
    public static class Pair<A extends Comparable<A>, B extends Comparable<B>> 
            implements Comparable<Pair<A, B>> {
        public final A first;
        public final B second;

        public Pair(A first, B second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair<A, B> other) {
            int cmp = this.first.compareTo(other.first);
            if (cmp != 0) return cmp;
            return this.second.compareTo(other.second);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }

        @Override
        public String toString() {
            return "(" + first + ", " + second + ")";
        }
    }
}
