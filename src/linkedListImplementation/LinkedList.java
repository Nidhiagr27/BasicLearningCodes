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

    public Node search(char data){
        Node curr=head;
        while(curr!=null){
            if(curr.getData()==data){
                return curr;
            }
           curr=curr.getNext();
        }
        return null;
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

    public void deleteAtEnd(){
        if(head!=null && head.getNext()!=null){
            Node curr=head;
            while(curr.getNext().getNext()!=null){
                curr=curr.getNext();
            }
            curr.setNext(null);
        }
        else if(head!=null && head.getNext()==null){
            head=null;
        }
    }
    public void insertAtFront(char data){
        Node newNode=new Node(data,null);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.setNext(head);
            head=newNode;
        }
    }

    public void deleteAtFront(){
        if(head!=null){
            head=head.getNext();
        }
    }

    public void insertAfter(int position,char data){
        Node newNode=new Node(data,null);
        int currentIndex=0;
        Node curr=head;
        while(currentIndex<position && curr.getNext()!=null){
            curr=curr.getNext();
            currentIndex++;
        }
        if(curr!=null) {
            newNode.setNext(curr.getNext());
            curr.setNext(newNode);
        }
        else{
            head=newNode;
        }
    }

    public void deleteAfter(int position){
        int currentIndex=0;
        Node curr=head;
        if(head!=null) {
            while (currentIndex < position && curr.getNext() != null) {
                curr = curr.getNext();
                currentIndex++;
            }
            if (curr.getNext() != null) {
                curr.setNext(curr.getNext().getNext());
            }
        }


    }

}
