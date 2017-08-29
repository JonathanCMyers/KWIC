import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shifter implements ListenerShifter {

    MessageManager manager;

    public Shifter(MessageManager manager){
            this.manager = manager;
            manager.shiftItAdd(this);
    }

    @Override
    public void shift(Set<String[]> sets) {
        System.out.println("Shifter Here Yo");

    }
}
