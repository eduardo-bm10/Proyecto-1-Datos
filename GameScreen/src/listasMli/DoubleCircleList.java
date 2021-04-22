package listasMli;

public class DoubleCircleList<T> implements List<T> {
    private DoubleNode<T> head;
    private int size;
    public DoubleCircleList(){
        head = null;
        size =0;
    }



    @Override
    public void add(T value) {
        DoubleNode<T> newNode = new DoubleNode<T>();
        newNode.setValue(value);
        if(head == null){
            head = newNode;
            head.setNext(head);
            head.setPrev(head);
            ++size;
        }else{
            DoubleNode<T> current = head;
            while (current.getNext() != head){
                current = current.getNext();

            }
            current.setNext(newNode);
            newNode.setNext(head);
            newNode.setPrev(current);
            ++size;
        }

    }

    @Override
    public void remove(int index) {
        if(index ==0){
            head.getPrev().setNext(head.getNext());
            head.getNext().setPrev(head.getPrev());
            head = head.getNext();
            --size;
        }else if(index <= size/2){
            DoubleNode<T> current = head;
            for(int c =0;c<=index;c++){
                current = current.getNext();
            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());

        }else if(index > size/2){
            DoubleNode<T> current = head;
            for(int c = size; c >= index; c--){
                current = current.getPrev();

            }
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());


        }

    }

    @Override
    public T get(int index) {
        if(index ==0){
            return head.getValue();
        }else if(index<= size/2){
            DoubleNode<T> current = head;
            for(int c =0;c<=index;c++){
                current = current.getNext();
            }
            return current.getValue();
        }else if(index > size/2){
            DoubleNode<T> current = head;
            for(int c = size;c>= index;c--){
                current = current.getNext();
            }
            return current.getValue();

        }else{
            return null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;

    }

    @Override
    public void swap(int index)
    {

    }
}
