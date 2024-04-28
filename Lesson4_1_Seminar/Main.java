package Lesson4_1_Seminar;

import Lesson4_1_Seminar.list.MyArrayList;
import Lesson4_1_Seminar.list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyArrayList<>();
        list.add(970);
        list.add(666);
        list.add(870);
        System.out.println(list);
        list.add(888999000);
        System.out.println(list);
        list.delete(1);
        System.out.println(list);

    }
}
