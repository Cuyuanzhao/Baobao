package baobaozi;

import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, -1, 1, 1, 1};
        windowPosSum(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void windowPosSum(int[] nums, int n) {
        int[] oldNums = nums.clone();
        int windowSum = 0;
        for (int i = oldNums.length - 1; i >= 0; i--) {
            windowSum += oldNums[i];
            if (i + n + 1 < oldNums.length) {
                windowSum -= oldNums[i + n + 1];
            }

            if (nums[i] > 0) {
                nums[i] = windowSum;
            }
        }
    }

}
