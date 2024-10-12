package RANDOM_QUESTIONS;
// https://leetcode.com/problems/two-sum/
import java.util.Arrays;

public class q1_two_sum {
    public static void main(String[] args) {
        int []a={3,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(a,target)));

    }

    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

}
