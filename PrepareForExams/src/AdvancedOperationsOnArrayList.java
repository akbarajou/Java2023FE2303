import java.util.ArrayList;

public class AdvancedOperationsOnArrayList {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Harry", 20));
        people.add(new Person("Ron", 19));
        people.add(new Person("Hermione", 20));
        people.add(new Person("Hagrid", 55));
        people.add(new Person("Snape", 60));
        people.add(new Person("Dumbledore", 150));
        System.out.println(people);


//        2. Implement a method to find the oldest person in the ArrayList.
        Person oldestPerson = findOldestPerson(people);
        System.out.println("The oldest person is " + oldestPerson.getName() + " and is " + oldestPerson.getAge() + " years old.");

        
//        3. Implement a method to calculate and print the average age of all persons in the ArrayList.
        System.out.println("Average age: " + averageAge(people));


//        4. Remove all persons under the age of 25 from the ArrayList.
        people.removeIf(person -> person.getAge() < 25);
        System.out.println(people);

    }


    public static Person findOldestPerson(ArrayList<Person> people) {
        Person oldestPerson = people.get(0);
        for (Person person : people)
            if (person.getAge() > oldestPerson.getAge()) oldestPerson = person;
        return oldestPerson;
    }

    public static double averageAge(ArrayList<Person> people) {
        double age = 0.0;
        for (Person person : people)
            age += person.getAge();
        return age / people.size();
    }


}
