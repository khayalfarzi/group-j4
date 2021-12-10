package az.iktlab.group_j4.homeworks.lesson8;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(CountAllVowels(input));
    }
    public static int CountAllVowels(String val){
        String[] vowels = new String[]{"a", "i", "o", "u", "e", "i"};
        int VowelsCount=0;
        for (char ch: val.toLowerCase(Locale.ROOT).toCharArray()) {
            if(Arrays.asList(vowels).contains(String.valueOf(ch))) VowelsCount++;
        }
        return VowelsCount;
    }
}
