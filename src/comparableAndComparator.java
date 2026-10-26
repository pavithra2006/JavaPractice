//import java.util.*;
//
//public class comparableAndComparator {
//    public static void main(String[] args) {
////        List<EmployeeComparable> emp = new ArrayList<>() ;
////        emp.add(new EmployeeComparable(1,"Pavi"));
////        emp.add(new EmployeeComparable(3, "x"));
////        emp.add(new EmployeeComparable(2,"Mrityunjay"));
//////
////        Collections.sort(emp, Collections.reverseOrder());
////
////        System.out.println(emp
////        );
//
//        List<EmployeeComparator> list2 = new ArrayList<>();
//        list2.add(new EmployeeComparator(2, 60000, "x"));
//        list2.add(new EmployeeComparator(1, 130000, "Pavi"));
//        list2.add(new EmployeeComparator(3, 50000, "Mritun"));
//
//        list2.sort(Comparator.comparingDouble(e->e.salary));
//        System.out.println(list2); //[3 Mritun 50000.0, 2 x 60000.0, 1 Pavi 130000.0]
//        list2.sort(Comparator.comparingInt(e->e.ID));
//        System.out.println(list2); //[1 Pavi 130000.0, 2 x 60000.0, 3 Mritun 50000.0]
//        list2.sort(Comparator.comparing(e->e.name));
//        System.out.println(list2); //[3 Mritun 50000.0, 1 Pavi 130000.0, 2 x 60000.0]
//        list2.sort(Comparator.comparingDouble((EmployeeComparator e)->e.salary).thenComparing(e->e.name));
//
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//
//        for(WebElement link : links)
//            System.out.println(link.getAttribute("href"));
//            String url = link.getAttribute("href");
//            if(Objects.nonNull(url)){
//                Response response = given().head(url);
//                if(response.getStatusCode() > 400)
//                    error;
//                else
//                    succcess;
//            }
//
//
//    }
//}
