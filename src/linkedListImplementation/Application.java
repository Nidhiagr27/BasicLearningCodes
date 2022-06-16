package linkedListImplementation;

public class Application {
    public static void main(String[] args){
        //creating linked list manually
        Node e=new Node('E',null); //it is last node
        Node d=new Node('D',e);
        Node c=new Node('C',d);
        Node b=new Node('B',c);
        Node a=new Node('A',b);
        Node head=a;

        Node curr=head;
        while(curr!=null){
            System.out.println(curr.getData());
            curr=curr.getNext();
        }
    }
}
