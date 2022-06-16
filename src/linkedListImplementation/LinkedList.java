package linkedListImplementation;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head=null;
    }

    public void traverse(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.getData());
            curr=curr.getNext();
        }
    }

    public void insertAtEnd(char data){
        Node newNode=new Node(data,null);
        if(head==null){
            head=newNode;
        }
        else{
            Node curr=head;
            while(curr.getNext()!=null){
                curr=curr.getNext();
            }
            curr.setNext(newNode);
        }
    }
}
