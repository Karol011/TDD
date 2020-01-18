import java.util.List;

public class ArrayMethod {
    public int checkDuplicates(int[] array, List<Integer> integerList) {
        int counter=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == integerList.get(i)) {
                counter++;
            }
        }
        return counter;
    }
}
