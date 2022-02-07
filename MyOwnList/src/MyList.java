
import java.util.Arrays;

public class MyList implements OwnList {

    private int i;
    int[] myList = new int[1];

    @Override
    public int size() {
        return myList.length;
    }

    @Override
    public boolean isEmpty() {
        return myList.length == 0;
    }

    @Override
    public void add(Integer element) {

       if (i > myList.length-1){
            int numOfElements = myList.length + 1;
            int[] temporaryTable = new int[numOfElements];

            for (int i = 0; i < myList.length; i++) {
                temporaryTable[i] = myList[i];
            }
            myList = temporaryTable;
        }
        myList[i] = element;
        i++;
    }

    @Override
    public Integer get(int i) {
        return myList[i];
    }

    @Override
    public void add(int index, Integer element) {

        if(index > myList.length-1 || index <0) throw new IllegalArgumentException("Index does not exist on list");

        int[] temporaryTable = new int[myList.length+1];
        int j =0;

        for (int i = 0; i < myList.length+1; i++) {

            if (i == index){
                temporaryTable[i] = element;
                i = i+1;
            }
            temporaryTable[i] = myList[j];
        j++;
        }
        myList = temporaryTable;
    }

    @Override
    public Integer remove(int index) {

        if(index > myList.length-1 || index <0) throw new IllegalArgumentException("Index does not exist on list");

        int[] temporaryTable = new int[myList.length-1];
        int j = 0;

        for (int i = 0; i < myList.length-1; i++) {

            if (i == index){j++;
                temporaryTable[i] = myList[j];
            }
            temporaryTable[i] = myList[j];
            j++;
        }
        myList = temporaryTable;

    return index;
    }


    @Override
    public String toString() {
        return "myList" + Arrays.toString(myList);
    }
}
