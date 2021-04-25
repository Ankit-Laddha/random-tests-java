package other;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static int solution(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuffer result = new StringBuffer();
            if (i % 2 == 0)
                result.append("Codility");
            if (i % 3 == 0)
                result.append("other.Test");
            if (i % 5 == 0)
                result.append("Coders");
            System.out.println("result.length() = " + result.length());
            if (result.length() != 0)
                System.out.println(result);
            else
                System.out.println(i);
        }
        return 0;
    }

    public static String solution2(String[] phone_numbers, String[] phone_owners, String number) {
        if(phone_numbers.length != phone_owners.length)
            throw new IllegalArgumentException("Phone numbers and phone owners array size do not match");

        if(number == null || number.isBlank() || number.isEmpty() )
            throw new IllegalArgumentException("Please pass a non-empty number for search");

        if(phone_numbers.length == 0)
            return number;

        var numbers = new ArrayList<>(Arrays.asList(phone_numbers));
        var owners = new ArrayList<>(Arrays.asList(phone_owners));

        int index = numbers.indexOf(number);
        System.out.println("index = " + index);
        String result = index == -1 ? number : owners.get(index);
        System.out.println("result = " + result.toString());
        return result;
    }

    public static void main(String[] args) {
        String[] n = new String[]{"111", "222"};
        String[] o = new String[]{"a", "j"};

   /*     String[] n = new String[]{};
        String[] o = new String[]{};*/
        String r = solution2(n, o, "  ");
        System.out.println("r = " + r);
        //int result = solution(5);
    }
}
