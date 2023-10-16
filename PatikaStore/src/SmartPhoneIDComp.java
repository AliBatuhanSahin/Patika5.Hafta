import java.util.Comparator;

public class SmartPhoneIDComp implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone o1, SmartPhone o2) {
        return o1.getId() - o2.getId();
    }
}