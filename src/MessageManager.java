import java.util.HashSet;
import java.util.Set;

public class MessageManager {

    Set<ListenerParser> parseItListeners = new HashSet<>();
    Set<ListenerShifter> shiftItListeners = new HashSet<>();

    public void parseItEvent(String filename){
        for(ListenerParser lp : parseItListeners){
            lp.parse(filename);
        }
    }

    public void parseItAdd(Listenerparseer listener){
        parseItListeners.add(listener);
    }

    public boolean shiftItRemove(ListenerShifter listener){
        if(shiftItListeners.contains(listener)){
            shiftItListeners.remove(listener);
            return true;
        }
        return false;
    }

    public void shiftItEvent(Set<String[]> sets){
        for(ListenerShifter ls : shiftItListeners){
            ls.shift(sets);
        }
    }

    public void shiftItAdd(ListenerShifter listener){
        shiftItListeners.add(listener);
    }

    public boolean shiftItRemove(ListenerShifter listener){
        if(shiftItListeners.contains(listener)){
            shiftItListeners.remove(listener);
            return true;
        }
        return false;
    }




}
