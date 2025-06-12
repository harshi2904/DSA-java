import java.util.Arrays;


public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int cows = 3;

        // Sort the stall positions (important!)
        Arrays.sort(stalls);

        int ans = findMaxMinDistance(stalls, cows);
        System.out.println("Maximum minimum distance: " + ans);
    }

    // Binary search on answer
    static int findMaxMinDistance(int[] stalls, int cows) {
        int low = 1; // minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0]; // maximum possible distance
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlaceCows(stalls, cows, mid)) {
                result = mid;        // try for a larger distance
                low = mid + 1;
            } else {
                high = mid - 1;     // try for a smaller distance
            }
        }

        return result;
    }

    // Greedy check: can we place all cows with at least `distance` apart?
    static boolean canPlaceCows(int[] stalls, int cows, int distance) {
        int count = 1; // first cow placed at first stall
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= distance) {
                count++;
                lastPosition = stalls[i];
            }
            if (count >= cows) return true;
        }

        return false;
    }
}
