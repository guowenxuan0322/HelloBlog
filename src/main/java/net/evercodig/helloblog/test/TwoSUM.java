package net.evercodig.helloblog.test;

import java.util.ArrayList;

public class TwoSUM {
    public static void main(String[] args) {
        int[] nums = {3, 6, 2, 7, 3};
        twoSum(nums, 9);
    }

    public static void twoSum(int[] nums, int target) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (target == nums[i] + nums[j]) {
                    System.out.println(nums[i] + "   " + nums[j]);
                }
            }
        }
    }
}
