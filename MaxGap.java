//https://leetcode.com/problems/maximum-gap/

import java.util.Arrays;

class maxGap {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;
        
        Arrays.sort(nums);

        int maxGap = 0;

        for (int i = 0; i < nums.length - 1; i++ ){
            int a = nums[i];
            int b = nums[i+1];

            if (Math.abs(a-b) > maxGap){
                maxGap = Math.abs(a-b);
            }
        }

        return maxGap;
    }
}