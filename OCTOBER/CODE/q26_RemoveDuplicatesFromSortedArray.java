package CODE;

public class q26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }

    static int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=0;j< nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];

            }
        }
        return i+1;
    }
}