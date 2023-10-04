package org.maangprep;

import java.util.Arrays;

public class A1_TwoSum_Easy {
    public int[] twoSum(int[] nums, int target) {
        for (short i = 0; i < nums.length ; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new A1_TwoSum_Easy().twoSum(new int[]{6,11,1,2,7}, 9)));
    }
}
