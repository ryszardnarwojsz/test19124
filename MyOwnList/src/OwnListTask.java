public class OwnListTask {

    public static void main(String[] args) {

        MyList newList = new MyList();

        newList.add(3);
        newList.add(5);
        newList.add(1);
        newList.add(13);
        newList.add(1);
        System.out.println(newList);

        newList.remove(0);
        System.out.println(newList);

        newList.add(3,99);
        System.out.println(newList);

        System.out.println(newList.get(2));
        System.out.println("Number of elements:" + newList.size() );
        System.out.println(newList.isEmpty());

    }
}
