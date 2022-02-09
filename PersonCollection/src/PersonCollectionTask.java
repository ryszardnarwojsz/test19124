import java.util.*;

public class PersonCollectionTask {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>() {};

        PersonHeightComparator newPersonHeightComparator = new PersonHeightComparator();
        PersonWeightComparator newPersonWeightComparator = new PersonWeightComparator();


        persons.add(new Person("Andrzej", "Nowy", 1980, 180, 101));
        persons.add(new Person("Jacek", "Kowalski", 1972, 179, 84));
        persons.add(new Person("Maja", "Kochanowska", 1990, 170, 60));
        persons.add(new Person("Wanda", "Smardzowska", 1968, 160, 69));
        persons.add(new Person("Robert", "Tomczyk", 1983, 186, 90));

        Collections.sort(persons, newPersonHeightComparator);
        for (Person newPerson : persons) {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname() + " " + newPerson.getHeight());
        }

        System.out.println();

        Collections.sort(persons, newPersonWeightComparator);
        for (Person newPerson : persons) {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname() + " " + newPerson.getWeight());
        }

        System.out.println();

        Collections.sort(persons);
        for (Person newPerson : persons) {
            System.out.println(newPerson.getName() + " " + newPerson.getSurname() + " " + newPerson.getYearOfBirth());
        }


    }
}
