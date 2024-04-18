package pharmasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//mport java.util.Objects;
import java.util.List;

public class IterablePharmasy implements Iterable<Component>{
    private int index;
    private final  List<Component> components;          // components - это в нашем случае состав леккарств.


    public IterablePharmasy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }

    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("Вы ни чего не добавили!");
        else Collections.addAll(this.components, components);

    }


    public List<Component> getComponents() {
        return this.components;
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>(){


            @Override
            public boolean hasNext(){
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    
    /*
    @SuppressWarnings("unchecked")
    @NotNull
    @Override
    public Iterator<Component> iterator() {

        return new ComponentIterator(this);


    }

    */
}


 