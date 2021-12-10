package az.iktlab.group_j4.home_work.lesson8;

import java.util.Scanner;

public class find_middle_num {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();
        System.out.print("The middle character in the string: " + Middle_character(str));
    }
    public static String Middle_character(String str)
    {
        int a;
        int length;
        if (str.length() % 2 == 0)
        {
            a = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            a = str.length() / 2;
            length = 1;
        }
        return str.substring(a, a + length);
    }
}
