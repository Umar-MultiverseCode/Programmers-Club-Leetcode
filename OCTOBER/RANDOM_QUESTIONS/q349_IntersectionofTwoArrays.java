package RANDOM_QUESTIONS;
// https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.ArrayList;
import java.util.List;

public class q349_IntersectionofTwoArrays {
    public static void main(String[] args) {


    }

    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>result=new ArrayList<>();

        for (int i=0;i<nums1.length;i++){

            for(int j=0;j<nums2.length;j++){

                if(nums1[i]==nums2[j]){
                    if(!result.contains(nums1[1])){
                        result.add(nums1[i]);
                    }
                    break; // Move to the next element in nums1
                }
            }

        }
        int a[]=new int [result.size()]; // kiun ki jo elements hai woh filhal array list me hain aur unka return type array nhi hai
                                         //isiliye first hame array list ko array me convert karna padega
        for(int i=0;i<result.size();i++){
            a[i]= result.get(i);
        }
        return a;
    }
}