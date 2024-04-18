package pharmasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//mport java.util.Objects;
import java.util.List;


// В этом классе будет список компонентов, 
// в классе Pharmasy создайте метод addComponent(Component component) 
// и имплементируйте ему интерфейс Iterator<Component>,  переопределив методы hasNext() и next().
public class Pharmasy implements Iterator<Component> {
    private int index;
    private List<Component> components;          // components - это в нашем случае состав леккарств.


    public Pharmasy() {
        this.index = 0;
        this.components = new ArrayList<>();

    }

    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("Вы ни чего не добавили!");
        else Collections.addAll(this.components, components);

    }


    @Override
    public boolean hasNext() {
        return index < components.size();
    }


    @Override
    public Component next() {
        // component c =  components.get(index);
        // index++;
        // return c;
        return components.get(index++);
    }


    
}
