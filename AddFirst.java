class Node{
    int data;
    Node next;
}
public class AddFirst {
    Node head;
    public void addFirst(int val){
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=head;
        head=newNode;
    }
    public void print()
    {
        Node temp=head;
        while (temp!=head)
        {
            System.out.println(temp.data);
            temp=temp.data;
        }
    }
    public static void main(String[] args)
    {
        AddFirst list=new AddFirst();
        System.out.println(10);
        list.addFirst(10);
        System.out.println(20);
        list.addFirst(20);
        System.out.println(30);
        list.addFirst(30);
        System.out.println(40);
        list.addFirst(40);
        System.out.println(50);
        list.addFirst(50);
        System.out.println("The linked List Element are:");
        list.print();
    }
}
