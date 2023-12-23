import java.util.ArrayList;

public class AdvancedOperationsOnArrayList {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Harry", 20));
        people.add(new Person("Ron", 19));
        people.add(new Person("Hermione", 20));


//        2. Implement a method to find the oldest person in the ArrayList.
        Person oldestPerson = findOldestPerson(people);
        System.out.println("The oldest person is " + oldestPerson.getName() + " and is " + oldestPerson.getAge() + " years old.");

    }


    public static Person findOldestPerson(ArrayList<Person> people) {
        Person oldestPerson = people.get(0);
        for (Person person : people)
            if (person.getAge() > oldestPerson.getAge()) oldestPerson = person;
        return oldestPerson;
    }


}
