package RANDOM_QUESTIONS;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/find-target-indices-after-sorting-array/description/
// to do on sunday
public class q2089_FindTargetIndicesAfterSortingArray {
    public static void main(String[] args) {

        int []a={1,2,5,2,3};
        System.out.println(targetIndices(a,3));

    }
    static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(nums[i]==target){
                result.add(i);
            }

        }
        return result;
    }
}