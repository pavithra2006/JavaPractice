import java.util.HashMap;

public class FrequencyOfWords {
    public static void main(String[] args) {
        String test = " this is a test string to a to validate";
        String[] split = test.trim().split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for(String s : split){
            if(map.containsKey(s)){
                map.put(s, map.getOrDefault(s,0)+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
    }
}
