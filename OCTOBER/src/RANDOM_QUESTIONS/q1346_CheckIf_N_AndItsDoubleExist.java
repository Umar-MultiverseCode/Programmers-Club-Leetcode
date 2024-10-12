package RANDOM_QUESTIONS;
//https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
import java.util.Arrays;

public class q1346_CheckIf_N_AndItsDoubleExist {
    public static void main(String[] args) {
    int []a={10,2,5,3};
        System.out.println(checkIfExist(a));
    }

    static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){

            for(int j=0;j<arr.length;j++){
                if(arr[i]==(2*arr[j]) && i!=j){
                    return true;
                }
            }
        }
        return false;

    }
}