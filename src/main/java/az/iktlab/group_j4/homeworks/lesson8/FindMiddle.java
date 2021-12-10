package az.iktlab.group_j4.homeworks.lesson8;

import java.util.Scanner;

public class FindMiddle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println(FindMiddleSt(input));
    }
    public static String FindMiddleSt(String val){
        int pos;
        int cnt;
        cnt=(val.length()%2==1)?1:2;
        pos=(int)((val.length()-cnt)/2);
        return val.subSequence(pos,pos+cnt).toString();
    }
}
