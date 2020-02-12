package Leecode;

import java.util.Scanner;

public class Leecode_03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s){
        int i=0;
        int flag=0;
        int length=0;
        int result=0;
        while(i<s.length()){
            int pos = s.indexOf(s.charAt(i),flag);
            if(pos<i){
                if(length>result){
                    result = length;
                }
                if(result>=s.length()-pos-1){
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1 ;
            }
            length++;
            i++;
        }
        return length;
    }
}
