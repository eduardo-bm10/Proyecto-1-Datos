package listasMli;

public interface List<T>
{
    void add(T value);
    void remove(int index);
    T get(int index);
    int size();
    void clear();
    void swap(int index);
}
