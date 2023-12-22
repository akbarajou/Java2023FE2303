import java.util.ArrayList;

public class BasicOperationsOnArrayLIst {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        add element to list
        for (int i = 1; i <= 10; i++)
            list.add(i);

        System.out.println(list);

//        remove the element at index 3
        list.remove(3);

        System.out.println(list);

//        check if list contains the element 7
        if (list.contains(7)) System.out.println(true);

//        print the element at index 5
        System.out.println(list.get(5));

//        clear all elements
        list.clear();

        System.out.println(list);

    }


}
