class Node{
    int data;
    Node perv;
    Node next;
}
public class DoublyLinkedListAddLast {
    Node head;
    public void addLast(int val)
    {
        Node newNode=new Node();
        newNode.data=val;

        if(head==null){
        newNode.perv=null;
        newNode.next=null;
        head=newNode;
        }
        else {
            Node last=head;
            while (last.next!=null){
                last=last.next;
            }
            last.next=newNode;
            newNode.perv=last;
            newNode.next=null;
        }
    }
    public void print(){
        Node temp=head;
        Node last=null;
        System.out.println("Forward");
        while (temp!=null){
            System.out.println(temp.data);
            if (temp.next==null)
            last=temp;
            temp=temp.next;
        }
        System.out.println("Backward");
        temp=last;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.perv;
        }
    }
    public static void main(String[] args){
        DoublyLinkedListAddLast list=new DoublyLinkedListAddLast();
        System.out.println(10);
        list.addLast(10);
        System.out.println(20);
        list.addLast(20);
        System.out.println(30);
        list.addLast(30);
        System.out.println(40);
        list.addLast(40);
        System.out.println(50);
        list.addLast(50);
        System.out.println(60);
        list.addLast(60);
        list.print();
    }
}
