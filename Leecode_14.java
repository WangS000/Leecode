package Leecode;

import java.util.Scanner;

public class Leecode_14 {
    public static void main(String[] args){
        String[] strings = new String[5];
        Scanner sc = new Scanner(System.in);
        strings[0]=sc.next();
        strings[1]=sc.next();
        strings[2]=sc.next();
        strings[3]=sc.next();
        strings[4]=sc.next();
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0||strs==null){
            return "";
        }
        for(int i=0;i<strs[0].length();i++){
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i==strs[j].length()||strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
