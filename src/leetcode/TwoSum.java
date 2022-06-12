package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args){
        int[] nums=new int[]{2,7,11,15};
        int[] nums1=new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,9)));
        System.out.println(Arrays.toString(twoSum(nums1,6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int diff=0;
        int[] sol=new int[2];
        for(int i=0;i<nums.length;i++){
            diff=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==diff){
                    sol[0]=i;
                    sol[1]=j;
                    break;
                }
            }

        }
        return sol;
    }
}
