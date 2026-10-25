import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InterviewPrograms {
    public static void main(String[] args) {
        //find max sum subarray
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            System.out.println(Math.max(arr[i], currentSum +arr[i]));
            maxSum = Math.max(currentSum, maxSum);
        }

        System.out.println(maxSum);

        ClassC obj = new ClassC();
        obj.intAMethod();

        List<Integer> list = new ArrayList<>();
        list.add(2); list.add(232);list.add(23);list.add(2);

        HashSet<Integer> set = new HashSet<>();
        Set<Integer> duplicate = list.stream().filter(n->!set.add(n)).collect(Collectors.toSet());
        System.out.println(duplicate);

    }
}

