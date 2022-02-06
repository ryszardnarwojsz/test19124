import java.util.ArrayList;
import java.util.List;

public class MyList implements OwnList {

    List<Integer> MyList = new ArrayList<>();

    @Override
    public int size() {
        return MyList.size();
    }

    @Override
    public boolean isEmpty() {
        return MyList.isEmpty();
    }

    @Override
    public void add(Integer element) {
        MyList.add(element);
    }

    @Override
    public Integer get(int i) {
        return MyList.get(i);
    }

    @Override
    public void add(int index, Integer element) {
        MyList.add(index,element);
    }

    @Override
    public Integer remove(int index) {
        return MyList.remove(index);
    }

    @Override
    public String toString() {
        return "MyList" + MyList;
    }
}
