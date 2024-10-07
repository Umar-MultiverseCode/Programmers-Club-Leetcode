package CODE;

import java.util.Arrays;

public class q88_MergeSortedArray {
    public static void main(String[] args) {
    int a[]={1,2,3};
    int b[]={2,5,6};
    merge(a,3,b,3);
        System.out.println(Arrays.toString(a));

    }
    // subha isko debug karke submit karna hai

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        int k=0;

        if(nums1[k]==m){
            for(int i=k+1;i<(m+n);i++){
                int j=0;
                nums1[i]=nums2[j];
                j++;
            }
        }else{
            k++;
        }
        Arrays.sort(nums1);

    }

}
