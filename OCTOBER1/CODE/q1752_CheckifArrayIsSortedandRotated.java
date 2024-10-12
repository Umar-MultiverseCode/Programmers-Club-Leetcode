package CODE;

public class q1752_CheckifArrayIsSortedandRotated {
    public static void main(String[] args) {

    }
    public boolean check(int[] nums) {
        int ginti=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){ // yaha pe (i+1)%nums.length lene ka reason ye hai ki jab i last tak ayega
                // toh fir i+1 =nums.length+1 joki index outoff bound hoga so yaha pe modulo use kiya hai.
                // for example arr ka length 5 hai toh filhal i 4 per hai toh i+1=5 hoyega jo out of bound hoga so yaha modulo
                // ka use karke hum 5%5 kar sakte hain joki dega hame zero iska matlb ki last ka element campare hoga
                //index first ke element ke sath
                ginti++;

            }
            if(ginti>1){
                return false;
            }
        }
        return true;
    }
}