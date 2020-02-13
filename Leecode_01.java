package Leecode;

public class Leecode_01 {
    public static void main(String[] args){

    }
    public static int[] twoSum(int[] nums,int target){
        int len = nums.length;
        for(int i=0;i<len-1;i++){
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
