import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String test = "This is a test string";
//        HashMap<Character, Integer> charCounter = new HashMap();
//        test = test.toLowerCase();
//        for( char c: test.toCharArray()){
//            if(charCounter.containsKey(c)){
//                charCounter.put(c, charCounter.getOrDefault(c,0)+1);
//            }else{
//                charCounter.put(c,1);
//            }
//        }
//        System.out.println(charCounter);
//        for(char c: test.toCharArray()){
//            if(charCounter.get(c) == 1) {
//                System.out.println("First non-repeating character is: " + c);
//                break;
//            }
//        }
//        for(char c : test.toCharArray()){
//            if(charCounter.get(c) > 1){
//                System.out.println("First repeating character is: " + c);
//                break;
//            }
//        }

        String test = "This is test string";
        test = test.toLowerCase();

        HashSet<Character> hashSet = new HashSet<>();
        for(Character c : test.toCharArray()) {
            System.out.println(hashSet.add(c)); // returns false if element already exist
            if (!hashSet.add(c))
                System.out.println("1st repeating character: " + c);
            break;
        }
    }
}