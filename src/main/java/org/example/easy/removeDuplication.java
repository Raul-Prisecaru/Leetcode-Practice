package org.example.easy;

public class removeDuplication {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int[] placeholder = {1, 1, 2, 3};
            int[] unique_values= {};

            for (int i = 0; i < placeholder.length; i++) {
                for (int j = 0; j < unique_values.length; j++) {
                    if (nums[i] != unique_values[j]) {
                        unique_values[i] = nums[j];
                        break;
                    }
                }
            }
            System.out.println(unique_values);
            
            return 0;
        }
    }
}
