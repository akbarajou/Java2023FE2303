import java.util.ArrayList;

public class IterationAndPrintingArraylist {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();

//        add elements to list
        for (int i = 1; i < 11; i++)
            numberList.add(i);

        displayOddNumbersInArrayList(numberList);


//        add five different words.
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

//        Use a for-each loop to iterate over the ArrayList and print each element.
        for (String i : list)
            System.out.print(i + " ");
        System.out.println(

        );

//        Print the elements of the ArrayList in reverse order
//        without modifying the original ArrayList.
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }


    }


//    Create a method that takes an ArrayList of integers as a parameter
//    and prints only the even numbers.
    public static void displayOddNumbersInArrayList(ArrayList<Integer> list) {
        for (int i : list) if (i % 2 == 1) System.out.print(i + " ");
        System.out.println();
    }
}
