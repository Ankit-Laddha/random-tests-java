package other;

import java.util.Arrays;

public class LongestCommonPrefixJava {


    public static void main(String[] args) {
        String[] s = {"card", "care","caddd"};
        String answer = longestCommonPrefixNew(s);
        System.out.println("answer = " + answer);
    }

    public static int findLeastArraySize(String[] strs) {
        int min = strs[0].toCharArray().length;
        for (int i = 1; i < strs.length; i++) {
            min = Math.min(min, strs[i].toCharArray().length);
        }
        return min;
    }

    public static String longestCommonPrefixNew(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        System.out.println("prefix = " + prefix);
        for (int i = 1; i < strs.length; i++){
            System.out.println("strs[i].indexOf(prefix) = " + strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("prefix = " + prefix);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    
    public static String longestCommonPrefix(String[] strs) {
        // abd, abde, abdeed, ab
        if(strs.length == 0)
            return "";

        if(strs.length ==1 )
            return strs[0];

        StringBuilder prefix = new StringBuilder("");
        var len = findLeastArraySize(strs);
        System.out.println("len = " + len);

        for (int i = 0; i < len; i++) {
            Character ch = strs[0].charAt(i);
            System.out.println("ch = " + ch);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != ch) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }
        return prefix.toString();
    }
}
