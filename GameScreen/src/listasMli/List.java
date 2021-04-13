package listasMli;

public interface List<T>{
    public void add(T value);
    public void remove(int index);
    public T get(int index);
    public int size();
    public void clear();
    public void swap(int index1,int index2);
}
