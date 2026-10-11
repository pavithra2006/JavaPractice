public class CheckIfStringContainsOnlyDigit {
    public static void main(String[] args) {
        String test = "1234dd5";
        boolean isOnlyDigit = true;
        for(Character c : test.toCharArray()){
            if(!Character.isDigit(c)){
                isOnlyDigit = false;
                break;
            }
        }
        System.out.println(isOnlyDigit);
    }
}

