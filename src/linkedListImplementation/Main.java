package linkedListImplementation;

public class Main {
    public static void main(String[] args){
        LinkedList ll=new LinkedList();

        //testing insert at end
        ll.insertAtEnd('E');
        ll.insertAtEnd('D');
        ll.insertAtEnd('C');
        ll.insertAtEnd('B');
        ll.insertAtEnd('A');

        //testing insert at front
        ll.insertAtFront('a');

        //testing insert after particular index
        ll.insertAfter(1,'5');
        ll.insertAfter(0,'8');

        ll.traverse();
    }
}
