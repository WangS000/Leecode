package Leecode;

import java.util.Scanner;

public class Leecode_28 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        System.out.println(strStr(string1,string2));
    }
    public static int strStr(String haystack,String needle){
        int strlen = haystack.length(),subLen = needle.length();
        if(subLen==0) return 0;
        if(strlen==0) return -1;
        int[][] FSM = new int[subLen][256];
        int x=0,match=0;
        for(int i=0;i<subLen;i++){
            match = (int) needle.charAt(i);
            for(int j=0;j<256;j++){
                FSM[i][j]=FSM[x][j];
            }
            FSM[i][match]=i+1;
            if(i>1){
                x=FSM[x][match];
            }
        }
        int state = 0;
        for(int i=0;i<strlen;i++){
            state = FSM[state][haystack.charAt(i)];
            if(state==subLen){
                return i - subLen + 1;
            }
        }
        return -1;
    }
}
