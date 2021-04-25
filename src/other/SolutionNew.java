package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionNew {
    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here
        List<Integer> result = new ArrayList<>();

        for(int i=0;i<startIndices.size();i++){
            int si = startIndices.get(i);
            int ei = endIndices.get(i);

            int prod= 0;
            Boolean read= false;

            for(int j = si-1; j<=ei-1;j++){
                if(!read && s.charAt(j)== '|')
                    read=true;
                else if(read && s.charAt(j)=='|')
                    read = false;
                else if(read && s.charAt(j)=='*')
                    prod++;
            }
            if(prod>0 && read == false)
                result.add(prod);

        }
        return result;
    }



    public static List<Integer> foo(int flightDuration, List<Integer> movieDuration) {
        List<Integer> duration = movieDuration;
        List<Integer> result = Arrays.asList(-1,-1);
        int time = flightDuration - 30;  //60
        if(time<=0 || movieDuration.size()<2)
            return result;

        Collections.sort(movieDuration);

        List<Integer> output = movieDuration.stream().filter(d -> d < time).collect(Collectors.toList());

        int left = 0;
        int right = output.size()-1;
        int firstIndex = -1;
        int lastIndex= -1;
        while(left < right){
            int leftValue = output.get(left);
            int rightValue = output.get(right);
            if(leftValue+rightValue> time)
                right--;
            else{
                firstIndex = left;
                lastIndex = right;
                if(leftValue + rightValue == time)
                    break;
                left++;
            }
        }
        if(firstIndex==-1 || lastIndex == -1)
            return result;

        int firstNumber = output.get(firstIndex);
        int lastNumber = output.get(lastIndex);


        result = Arrays.asList(duration.indexOf(firstNumber),duration.indexOf(lastNumber));
        Collections.sort(result);
        return result;

    }

    public static void main(String[] args) {
        //foo(110, Arrays.asList(20,70,90,30,60,110));
        var x = numberOfItems("*|*|", Arrays.asList(1), Arrays.asList(3));
        System.out.println("x = " + x);
    }
}
