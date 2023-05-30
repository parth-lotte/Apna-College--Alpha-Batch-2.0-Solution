public class Q2 {
    public static int minStonesRemoval(int[] stones) {
        int count = 0;
        int n = stones.length;

        for (int i = 0; i < n - 1; i++) {
            if ((stones[i] + stones[i + 1]) % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] stones = { 3,5,9,7,1,3}; // Example sequence of stones

        int minRemoval = minStonesRemoval(stones);
        System.out.println("Minimum stones removal required: " + minRemoval);
    }
}
