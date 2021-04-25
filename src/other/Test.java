package other;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // you can also use imports, for example:

    public int solution(int[] A) {
        // write your code in Java SE 11
        Set testedSet = new TreeSet();
        Set perfectSet = new TreeSet();

        for(int i=0; i<A.length; i++) {
            testedSet.add(A[i]);   //convert array to set to get rid of duplicates, order int's
            perfectSet.add(i+1);  //create perfect set so can find missing int
        }

        for(Object current : perfectSet) {
            if(!testedSet.contains(current)) {
                return (int)current;
            }
        }

        if(perfectSet.size() == testedSet.size()) {
            return perfectSet.size() + 1;  //e.g. {1, 2, 3} should return 4
        }

        return 1;
    }

}

