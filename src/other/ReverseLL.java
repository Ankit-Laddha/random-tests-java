package other;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLL {

    public static void main(String[] args) {
        var list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list = " + Arrays.toString(list.toArray()));

        var x = list;
    }
}
