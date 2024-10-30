package org.example.easy;

public class two_sums {

    public int[] twoSum(int[] nums, int target) {
        int[] arr_answer = {};


        for (int j : nums) {
            for (int num : nums) {
                int calculation = j + num;

                if (calculation == target) {
                    arr_answer[0] = j;
                    arr_answer[1] = num;


                    System.out.println(j + " and " + num + " is equals to " + target);
                    break;
                }
            }
        }

        return arr_answer;


    }

    public static void main(String[] args) {
        two_sums twoSums = new two_sums();
        int[] arr = new int[]{2, 7, 11, 15};

        twoSums.twoSum(arr, 9);
    }
}