package Leecode;

import java.util.Scanner;

public class leecode_27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i<5;i++){
            nums[i] = scanner.nextInt();
        }
        int val = scanner.nextInt();
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
