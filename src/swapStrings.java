public class swapStrings {
    public static void main(String[] args) {
//        String test1 = "test1", test2="test2";
//        String temp ;
//        temp = test1;
//        test1 = test2;
//        test2 = temp;
//
//        System.out.println(test1 + " " + test2);

        String test1 = "test1", test2 = "test2";
        test1 = test1+test2; //test1test2
        test2 = test1.substring(0, test1.length() - test2.length()); // test1
        test1 = test1.substring(test2.length());
        System.out.println(test1 + " " + test2);
    }
}
