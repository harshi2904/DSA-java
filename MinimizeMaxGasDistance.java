import java.util.Arrays;

public class MinimizeMaxGasDistance {
    public static void main(String[] args) {
        int[] stations = {1,13,17,23};
        int k = 5; // number of stations to add

        double result = minimizeMaxDistance(stations, k);
        System.out.printf("Minimum of the maximum distance: %.6f\n", result);
    }

    static double minimizeMaxDistance(int[] stations, int k) {
        Arrays.sort(stations);
        double low = 0;
        double high = stations[stations.length - 1] - stations[0];
        double epsilon = 1e-6; // precision up to 6 decimal places

        while (high - low > epsilon) {
            double mid = low + (high - low) / 2;

            if (canInsert(stations, k, mid)) {
                high = mid; // try smaller max distance
            } else {
                low = mid;  // try larger max distance
            }
        }

        return high;
    }

    // Check if we can insert at most K stations so that max distance between stations is <= dist
    static boolean canInsert(int[] stations, int k, double dist) {
        int required = 0;
        for (int i = 1; i < stations.length; i++) {
            double gap = stations[i] - stations[i - 1];
            // Number of new stations needed to divide this gap into pieces <= dist
            required += (int)(gap / dist);
        }
        return required <= k;
    }
}
