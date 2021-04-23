package listasMli;



/**
 * Class List
 * Permite agregar,remover,obtener, obtener tamaño, dejar valores en cero e intercambiar (index1,index2) en la lista
 *
 * @author Melisa Oviedo
 * @version 1.0
 * @see CircleList
 */
public interface List<T>
{
    void add(T value);
    void remove(int index);
    T get(int index);
    int size();
    void clear();
    void swap(int index);
}
