import java.util.ArrayList;
import java.util.Collections;


public class WorkingOnNumber {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        int n = 10;

        for (int i = 0; i < n; i++) {
            int m = (int) (Math.random() * 10);
            numbers.add(m);
        }

        System.out.print("before sorting: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.sort(numbers);
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.print("after sorting: ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
