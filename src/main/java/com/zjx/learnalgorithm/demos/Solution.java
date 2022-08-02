package com.zjx.learnalgorithm.demos;


/**
 * Demo class
 *
 * @author trevor.zhao
 * @date 2020/11/16
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        //i为慢指针,j为快指针
        for (int j = 0; j < nums.length; j++) {
            //如果遇到不一样的,就将i往后挪一下,并将下一个不一样的元素放到这个位置
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            //如果一直是一样的 增加j来跳过重复项
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 2, 2, 2, 2, 3, 4};
        solution.removeDuplicates(ints);
    }
}
