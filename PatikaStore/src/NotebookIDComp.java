import java.util.Comparator;

public class NotebookIDComp implements Comparator<Notebooks> {
    @Override
    public int compare(Notebooks o1, Notebooks o2) {
        return o1.getId() - o2.getId();
    }
}