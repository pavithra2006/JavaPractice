public class CountWordsInSTring {
    public static void main(String[] args) {
        String test = " count words in string test";
        String[] split = test.trim().split(" ");
        System.out.println(split.length);
    }
}
