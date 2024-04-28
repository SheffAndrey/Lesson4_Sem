package Lesson4_1_Seminar.list;

public interface MyList<T extends Comparable<T>> extends Iterable<T> {
    // <T> означает обобщенный тип данных
    // Добавим метод сортировки. 
    void add(T element);
    void delete(int index);
    void delete(T element);
    T get(int index);
    int size();

}
