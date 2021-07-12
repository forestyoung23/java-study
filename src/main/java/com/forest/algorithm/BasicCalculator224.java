package com.forest.algorithm;

/**
 * @author dongyang
 * @date 2021年03月10日 22:29
 */
public class BasicCalculator224 {
    public static void main(String[] args) {
        int[] i = {0,0,1,1,1,2};
        removeDuplicates(i);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1== nums.length) {
                nums[j] = nums[i];
                j++;
                break;
            }
            if (nums[i] == nums[i+1]) {
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }
}
