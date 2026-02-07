package org.example.easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6,7},5));
    }
    public static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){
            int middle = (left + right) / 2;
            int curr = nums[middle];

            if(curr == target){;
                return middle;
            } else if (curr < target) {
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return left;
    }
}
