import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManipulationArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            firstList.add(((int) (Math.random() * 10)));
            secondList.add(((int) (Math.random() * 10)));
        }

//        Combine the two ArrayLists into a new ArrayList.
        ArrayList<Integer> combinedList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            combinedList.add(firstList.get(i));
            combinedList.add(secondList.get(i));
        }

//        System.out.println(firstList);
//        System.out.println(secondList);
        System.out.println(combinedList);

//        Remove all duplicates from the combined ArrayList.
        for (int i = 0; i < combinedList.size(); i++) {
            for (int j = i+1; j < combinedList.size(); j++) {
                if (combinedList.get(j).equals(combinedList.get(i))) {
                    combinedList.remove(j);
                    j--;
                }
            }
        }

//        Sort the elements of the combined ArrayList in ascending order.
        combinedList.sort(Comparator.naturalOrder());

//        Create a sublist from the sorted ArrayList, including elements from index 2 to 5.
        List<Integer> subList = combinedList.subList(1, 4);
        System.out.println(subList);

        System.out.println(combinedList);

    }
}
