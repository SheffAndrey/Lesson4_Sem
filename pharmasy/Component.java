package pharmasy;
import java.util.Objects;
//import java.util.Objects;

// Создайте класс Component (лекарственный компонент) с полями String name, String weight, int power,  
// класс Medicine(лекарство) с полями List<Component> components, int index.

public class Component implements Comparable<Component> {
    @SuppressWarnings("unused")
    private String name;
    @SuppressWarnings("unused")
    private String weight;
    @SuppressWarnings("unused")
    private int power;


    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }


    

    @Override
    public String toString() {
        return "Component{" +
            "name='" + name + '\'' +
            ", weight='" + '\'' +
            ", power=" + power +
            '}';
    }




    @Override
    public int compareTo(Component o) {
        /* все эти строчки можно сократить до одной строчки ->
        if (this.power > o.power) return -1;
        if (this.power < o.power) return 1;
        return 0;
        */
        return Integer.compare(o.power, this.power);
    }
    
}
