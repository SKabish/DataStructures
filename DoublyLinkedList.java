class Node{
    int data;
    Node perv;
    Node next;
}
public class DoublyLinkedList {
    public static void main(String[] args)
    {
        Node head,middle,last;

        head=new Node();
        middle=new Node();
        last=new Node();

        head.data=10;
        middle.data=20;
        last.data=30;

        head.perv=null;
        head.next=middle;
        middle.perv=head;
        middle.next=last;
        last.perv=middle;
        last.next=null;

        Node temp=head;
        System.out.println("Forward");
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        temp=last;
        System.out.println("Backward");
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.perv;
        }
    }
}
