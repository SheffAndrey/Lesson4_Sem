package pharmasy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


// Comparable/ Реализовать сортировку лекарств по силе.

@SuppressWarnings("unused")
public class PharmasyMain{
    public static <list> void main(String[] args){
        Component pineceline = new Component("Pineceline", "10mg", 100);
        Component salt = new Component("Salt", "15mg", 10);
        Component water = new Component("Water", "1000mg", 40);

        Pharmasy pharmasy1 = new Pharmasy();
        pharmasy1.addComponents(salt, pineceline);

        IterablePharmasy pharmasy2 = new IterablePharmasy();
        pharmasy2.addComponents(water, salt);


        for (Component c : pharmasy2){
            System.out.println(c);
        }

        List<Component> list = new ArrayList<>();
        list.add(pineceline);
        list.add(salt);
        list.add(water);
        Collections.sort(list);
        System.out.println(list);
        

    }
}
