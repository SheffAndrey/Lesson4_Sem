package pharmasy;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ComponentIterator implements Iterator{
    private int index = 0;
    private IterablePharmasy pharmasy;

    public ComponentIterator(IterablePharmasy pharmasy){
        this.pharmasy = pharmasy;
    }   

    
    @Override
    public boolean hasNext() {
        return index < pharmasy.getComponents().size();
    }


    @Override
    public Component next() {
        // component c =  components.get(index);
        // index++;
        // return c;
        return pharmasy.getComponents().get(index++);
    }
}
