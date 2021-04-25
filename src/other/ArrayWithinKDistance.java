package other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

public class ArrayWithinKDistance {

    public static void main(String[] args) {
        //System.out.println("kDistance() = " + kDistance());
        //System.out.println("usingHashSet() = " + usingHashSet());
        System.out.println("anagram() = " + anagram());

    }
    static Boolean kDistance(){
        int[] a = {1, 2, 3, 4, 1, 2, 3, 4};
        int k = 4;
        for (int i=0;i<a.length-k-1;i++) {
            for(int j=i+1;j<i+k+1;j++)
                if (a[i] == a[j])
                    return false;
        }
        return true;
    }

    static Boolean anagram(){
        String str1 = "abc";
        String str2 = "acb";

        if(str1.length() != str2.length())
            return false;

        //O(n)
        var str1Arr = str1.toLowerCase().toCharArray();
        //O(n)
        var str2Arr = str2.toLowerCase().toCharArray();
        //O(n * log n)
        Arrays.sort(str1Arr);
        //O(n * log n)
        Arrays.sort(str2Arr);

        //0(n)
        return Arrays.equals(str1Arr,str2Arr);
    }

    static Boolean usingHashSet(){
        int[] a = {1, 2, 3, 4, 1, 2, 3, 4};
        int k = 4;

        var set = new HashSet<Integer>();
        for (int i=0;i< a.length ; i++){
            if(set.contains(a[i]))
                return false;

            set.add(a[i]);
            if(i>=k)
                set.remove(a[i-k]);
        }
        return true;
    }
}
