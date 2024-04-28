package Lesson_Seminar4;

import java.util.ArrayList;
import java.util.List;

public class Lesson4 {
    public static void main(String[] args) {
        raw();
    }

    static void raw(){
        List list = new ArrayList();
        list.add("abx");
        list.add(123);
        System.out.println(list);
        System.err.println("Сейчас будет ошибка!");

        for(Object str : list){
            // Операцая каста
            System.out.println((String)str);
        }
    }
}
