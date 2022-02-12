import java.util.Comparator;

public class PersonHeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getHeight(), o2.getHeight());
    }


}
