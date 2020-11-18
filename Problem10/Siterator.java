package Problem10;

public class Siterator<T>{
    Node head;
    Node current;
    Siterator(Node node){
        head = node;
    }
    public boolean hasNext(){
        if(current==null || current.next==null){
            return false;
        }
        return true;
    }

    public void setCurrent(){
        current=head;
    }
    public Node<T> next(){
        current = current.next;
        return current;
    }

}
