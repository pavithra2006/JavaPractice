import java.util.*;
import java.util.stream.Collectors;

public class JAVA8programs {
    public static void main(String[] args) {
        //convert List<String> to List<Integer>
        List<String> list = Arrays.asList("23","32","32");
        List<Integer> listInt = list.stream().map(Integer::parseInt).toList();
        System.out.println(listInt);

        //list to set
        Set<Integer> set = listInt.stream().collect(Collectors.toSet()); //to set automatically removes duplicates
        System.out.println(set);

        //list to map
        List<String> fruit = Arrays.asList("Apple", "oranges", "banana");
        Map<Integer, String> map = fruit.stream().collect(Collectors.toMap(String::length,f->f));
        System.out.println(map);

        //partition by odd or even
        List<Integer> no = Arrays.asList(32,232,1,1,2,34,43);
        Map<Boolean, List<Integer>> b = no.stream().collect(Collectors.partitioningBy((n->n/2==0)));
        System.out.println(b);

        //common elm in two list
        List<Integer> list1 = Arrays.asList(10,20,30,40);
        List<Integer> list2 = Arrays.asList(30,40,50,60);

        List<Integer> common = list1.stream().filter(list2::contains).toList();
        // filter(n->list2.contains(n)
        System.out.println(common);

        //elm list 1 not in list 2
        List<Integer> unique = list1.stream().filter(n->!list2.contains(n)).toList();
        System.out.println(unique);
    }

}
