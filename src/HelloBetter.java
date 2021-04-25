import java.util.HashMap;
import java.util.stream.Collectors;

public class HelloBetter {
    public static void main(String[] args) {

        String s = "amar singh amar amar singh";
        stringssss(s);
       /* int[] a = { 1 , 40 ,20 ,6 ,8, 9};


        int max = -1;
        int max2 = -1;

        for(int i = 0 ; i<a.length ; i++ ){
            if (a[i] > max2 && a[i] < max)
                 max2 = a[i];
            if(a[i]> max) {
                max2 = max;
                max = a[i];
            }
        }

        System.out.println("max2 = " + max2  + " max: " + max);*/
    }

    public static void stringssss(String s) {
        var words = s.split(" ");

        var map = new HashMap<String, Integer>();
        for (String w : words) {
            var w1 = w.toLowerCase();
            if (map.containsKey(w1))
                map.put(w1, map.get(w1) + 1);
            else
                map.put(w1, 1);
        }

        var result = map.keySet().stream()
                .filter( w -> map.get(w) > 1)
                .map( w -> w + "|" + map.get(w ))
                .collect(Collectors.toList());
        System.out.println("result = " + result);


    }


}
