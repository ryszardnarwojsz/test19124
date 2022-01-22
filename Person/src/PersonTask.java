public class PersonTask {

    public static void main(String[] args) {

        Person Rysiek = new Person("Rysiek", "Narwojsz",56081245329L);
        Person RysiekN = new Person("Rysiek","Narwojsz", 56081245329L);

        System.out.println(Rysiek.equals(RysiekN));
        System.out.println(Rysiek.hashCode());
        System.out.println(RysiekN.hashCode());


    }

}
