import java.util.*;

public class PersonCollectionTask {

    public static void main(String[] args) {

        List<Person> Persons = new ArrayList<>() {};

        PersonHeightComparator newPersonHeightComparator = new PersonHeightComparator();
        PersonWeightComparator newPersonWeightComparator = new PersonWeightComparator();


        Persons.add(new Person("Andrzej", "Nowy", 1980, 180, 101));
        Persons.add(new Person("Jacek", "Kowalski", 1972, 179, 84));
        Persons.add(new Person("Maja", "Kochanowska", 1990, 170, 60));
        Persons.add(new Person("Wanda", "Smardzowska", 1968, 160, 69));
        Persons.add(new Person("Robert", "Tomczyk", 1983, 186, 90));

        Collections.sort(Persons, newPersonHeightComparator);
        for (Person newPerson : Persons) {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname() + " " + newPerson.height);
        }

        System.out.println();

        Collections.sort(Persons, newPersonWeightComparator);
        for (Person newPerson : Persons) {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname() + " " + newPerson.weight);
        }

        System.out.println();

        Collections.sort(Persons);
        for (Person newPerson : Persons) {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname() + " " + newPerson.yearOfBirth);
        }


    }
}
