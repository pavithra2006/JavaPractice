import java.util.*;
import java.util.stream.Collectors;

public class java8 {
    public static void main(String[] args){
//        List<String> names = Arrays.asList("Apple","Banana","Strawberry","Papaya");
//        names.forEach(System.out::println);
//
//        names.stream().filter(name->name.startsWith("P")|| name.startsWith("A") || name.endsWith("a"))
//                .map(String::toUpperCase).forEach(System.out::println);

//        List<String> fruits = Arrays.asList("Apple","Banana","Strawberry","Papaya");
//        List<String> veggies = Arrays.asList("Carrot", "Beans", "Potato", "Onion","Onion");
//
//        List<String> intermediate = new ArrayList<String>();
//
//        List<List<String>> groceries = Arrays.asList(fruits, veggies);
//        List<String> stream = groceries.stream().flatMap(List::stream).filter(item->item.endsWith("n") || item.startsWith("B") || item.startsWith("P"))
//                .peek(item->intermediate.add(item)).map(String::toLowerCase).distinct().sorted()
//                .toList();
//
//        stream.forEach(System.out::println);
//        intermediate.forEach(System.out::println);
//
//        long count = stream.stream().count();
//        System.out.println(count);
//
//        String concatenatedNames = stream.stream().reduce("Prefix", (a,b) -> a + " " + b );
//        System.out.println(concatenatedNames);

//        List<Integer> nos = Arrays.asList(10,40,20,50);
////        int sum = nos.stream().reduce(0,(a,b)->a+b);
////        int product = nos.stream().reduce(1,(a,b)->a*b);
////        System.out.println(sum);
////        System.out.println(product);
//
//        Optional<Integer> elm = nos.stream().findFirst();
//        System.out.println(elm.get());
//        Optional<Integer> elm2 = nos.stream().findAny();
//        System.out.println(elm2.get());
//
//        Optional<Integer> max = nos.stream().filter(no -> no> 25).findFirst();
//        System.out.println(max.get());

//        List<Integer> nos = Arrays.asList(10,20,50,420);
//        boolean res = nos.stream().noneMatch(no -> no >1000); // all greater than 1
//        System.out.println(res);


        List<String> list = Arrays.asList("VISA", "MASTERCARD","VISA","VISA","MASTERCARD","RUPAY");
        Map<Integer, List<String>> map = list.stream().collect(Collectors.groupingBy(card-> card.length()));
        System.out.println(map); //{4=[VISA, VISA, VISA], 5=[RUPAY], 10=[MASTERCARD, MASTERCARD]}

        Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(card->card,Collectors.counting()));
        System.out.println(map2);
    }
}
