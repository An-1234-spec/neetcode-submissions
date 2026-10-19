class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;

        // Loop through every number in the array one by one
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Count how many times nums[i] appears in the array
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }

            // Check if this number's count is strictly greater than n / 2
            if (count > majorityCount) {
                return nums[i]; // Found the majority element!
            } else {
                // Otherwise, keep looking (the loop will move to the next number)
            }
        }

        return -1; // This line is just here to satisfy Java, though a majority always exists
    }
}