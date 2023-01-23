package Lists;

import java.util.ArrayList;
import java.util.List;

public class ParentList<T> {

    private List<T> values = new ArrayList<>();

    public ParentList(List<T> values) {
        this.values = values;
    }

    public int getSize() {
        return this.values.size();
    }

    public T get(int i) {
        return values.get(i);
    }

}
