class Node{
    int data;
    Node next;
}
public class Basic {
    public static void main(String[] args){
        Node head,middle,last;
        head=new Node();
        middle=new Node();
        last=new Node();

        head.data=10;
        middle.data=20;
        last.data=30;

        head.next=last;
        last.next=middle;
        middle.next=null;

        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
