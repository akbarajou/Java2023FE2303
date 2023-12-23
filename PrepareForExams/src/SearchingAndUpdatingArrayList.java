import java.util.ArrayList;


public class SearchingAndUpdatingArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();


//        1. Create an ArrayList of strings with five different names.
        names.add("Jane");
        names.add("Peter");
        names.add("Mary");
        names.add("Michael");
        names.add("John");
        System.out.println(names);


//        2. Search for a specific name in the ArrayList and print whether it exists or not.
        System.out.println("#Search");
        if (names.contains(args[0])) System.out.println(args[0]);


//        3. Update the second element of the ArrayList with a new name.
        names.set(1, "Sevval");
        System.out.println(names);


//        4. Swap the positions of the first and last elements in the ArrayList.
        String firstElement = names.get(0);
        String lastElement = names.get(names.size()-1);
        names.set(0, lastElement);
        names.set(names.size()-1, firstElement);
        System.out.println(names);


//        5. Replace all occurrences of a specific name with another name in the ArrayList.
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("John")) names.set(i, "Akbar");
        }
        System.out.println(names);

    }
}
