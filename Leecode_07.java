package Leecode;

import java.util.Scanner;

public class Leecode_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Integer.MIN_VALUE);
    }
    public static int reverse(int x){
        long y = 0;
        while(x!=0){
            y=y*10+x%10;
            x/=10;
        }
        if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE)
            return 0;
        return (int)y;
    }
}
