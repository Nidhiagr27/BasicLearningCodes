package linkedListImplementation;

public class Main {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.insertAtEnd('E');
        ll.insertAtEnd('D');
        ll.insertAtEnd('C');
        ll.insertAtEnd('B');
        ll.insertAtEnd('A');

        ll.traverse();
    }
}
