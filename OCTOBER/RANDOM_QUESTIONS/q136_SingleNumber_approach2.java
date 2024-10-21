package RANDOM_QUESTIONS;

public class q136_SingleNumber_approach2 {
    public static void main(String[] args) {
        int []a={4,1,2,1,2};

        System.out.println(singleNumber(a));
    }

    static public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) { // Acces all the elements of the array from index=0 to nums.lenght-1
            result =result ^ num;
        }
        return result;
    }
}
/*
Jab hum array ke sabhi elements ko ek ke baad ek XOR karte hain, toh jo numbers do baar repeat hote hain, woh khud hi cancel out ho jaate hain kyunki num ^ num = 0.
Bas ek hi number aisa hoga jo cancel nahi hoga, kyunki woh array mein sirf ek baar aaya hai.
Example
Maan lo, nums array yeh hai: [4, 1, 2, 1, 2]

result ko initially 0 set karte hain.

Loop ke andar har element ka XOR lete hain:

result = 0 ^ 4 → result = 4
result = 4 ^ 1 → result = 5
result = 5 ^ 2 → result = 7
result = 7 ^ 1 → result = 6
result = 6 ^ 2 → result = 4
Ab array ke sabhi elements ka XOR ho chuka hai, aur jo numbers repeat hue the (like 1 and 2), woh cancel out ho gaye. Sirf 4 bacha hai, jo ki single number hai.

Final Result
Return 4, jo ki single number hai jo array mein sirf ek baar aaya.


* */