class Node{
    int data;
    Node next;
}
public class BasicCircularLinkedList{
    public static void main(String[] args){
        Node head=new Node();
        Node middle=new Node();
        Node last=new Node();

        head.data=10;
        middle.data=20;
        last.data=30;

        head.next=middle;
        middle.next=last;
        last.next=head;

        System.out.println("Circular Linked List Elements Are:");
        Node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
}