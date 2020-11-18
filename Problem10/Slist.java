package Problem10;

class Node<T>{
    T data;
    Node next;
    Node(){}
    Node(T data,Node next){
        this.data=data;
        this.next=next;
    }
    public String toString(){
        return data.toString();
    }


}
public class Slist<T> {
    Node head;
    Node current;
    Slist(){
        head = new Node();
    }
    Siterator<T> getIterator(){
        return new Siterator<>(head);
    }
    public void insert(T t){
        current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new Node(t,null);
    }
    public void delete(T t){
        current = head;
        Node prev = head;
        while(current.next!=null){
            if(current.data==t){
                prev.next = current.next;
                break;
            }
            prev=current;
            current = current.next;
        }
    }
    public String toString(){
        String s = new String();
        Siterator<T> it = new Siterator<>(head);
        it.setCurrent();
        while(it.hasNext()){
            s=s+" "+it.next().toString();
        }
        return s;
    }
    public static void main(String args[]){
        Slist<Integer> list = new Slist<>();
        list.insert(5);
        list.insert(15);
        list.insert(19);
        System.out.println(list);
        list.delete(15);
        list.insert(30);
        System.out.println(list);
    }
}
