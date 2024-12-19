class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxSoFar = 0; // Tracks the maximum value encountered so far
        int chunkCount = 0; // Count of chunks

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]); // Update the maximum value
            if (maxSoFar == i) {
                // If the max value so far matches the index, we can form a chunk
                chunkCount++;
            }
        }
        return chunkCount; // Return total number of chunks
    }
}
