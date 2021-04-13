package listasMli;

public class CircleList<T> implements List<T>{
    private Node<T> head;
    private int size;

    public CircleList(){
        head = null;
        size =0;

    }


    @Override
    public void add(T value) {
        Node<T> newNode = new Node<T>();
        newNode.setValue(value);
        if(head == null){
            head = newNode;
            head.setNext(head);
            ++size;
        }else{
            Node<T> current = head;
            while(current.getNext()!=head){
                current = current.getNext();
            }
            current.setNext(newNode);
            newNode.setNext(head);
            ++size;
        }

    }

    @Override
    public void remove(int index) {
        if (index ==0 && index<size){
            head = head.getNext();
            --size;

        }else{
            Node<T> current = head;
            int count =0;
            while(count < index-1){
                current = current.getNext();
                count++;
            }
            current.setNext(current.getNext().getNext());
            --size;
        }

    }

    @Override
    public T get(int index) {
        Node<T> current = head;
        for(int i =0;i<index;i++){
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {
        this.head=null;
        this.size =0;

    }

    @Override
    public void swap(int index1, int index2) {

    }
}
