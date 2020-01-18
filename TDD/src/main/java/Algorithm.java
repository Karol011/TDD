import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Algorithm {
    public int find(List<Integer> list) {

        if (list == null || list.isEmpty()) {
            return 1;
        }
        Set<Integer> set = new HashSet<>();
        for (Integer element : list) {
            if (element > 0) {
                set.add(element);
            }
        }
        for (int i = 1; i < list.size(); i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return list.size() + 1;

    }
}
