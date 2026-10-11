import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class largestAndSmallestLengthWords {
    public static void main(String[] args) {
        String test = "find a largest and smallest length words in string";
        String[] split = test.trim().split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for(String s: split){
                map.put(s, s.length());
        }

        int largestWordLength =  Collections.max(map.values());
        int smallestWordLength = Collections.min(map.values());

        String largestValue = "", smallestValue ="";
        for(Map.Entry<String, Integer> e: map.entrySet()){
            if(e.getValue() == largestWordLength)
                largestValue = e.getKey();
            if(e.getValue() == smallestWordLength)
                smallestValue = e.getKey();
        }
        System.out.println(largestValue + " " + largestWordLength);
        System.out.println(smallestValue+ " "+ smallestWordLength);

    }
}
