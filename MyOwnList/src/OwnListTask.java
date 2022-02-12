public class OwnListTask {

    public static void main(String[] args) {

        MyList newList = new MyList();

        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);

        System.out.println(newList);

        newList.remove(4);
        System.out.println(newList);
        newList.add(2,77);
        System.out.println(newList);

        System.out.println(newList.get(2));
        System.out.println("Number of elements:" + newList.size() );
        System.out.println(newList.isEmpty());

    }
}
