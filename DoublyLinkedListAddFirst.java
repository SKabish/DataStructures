class Node{
    int data;
    Node perv;
    Node next;
}
public class DoublyLinkedListAddFirst {
    Node head;
    public void addFist(int val)
    {
        Node newNode=new Node();
        newNode.data=val;

        if(head==null){
        newNode.perv=null;
        newNode.next=null;
        head=newNode;
        }
        else {
            newNode.perv=null;
            newNode.next=head;
            head.perv=newNode;
            head=newNode;
        }
    }
    public void print(){
        Node temp=head;
        Node last=null;
        System.out.println("Forward");
        while (temp!=null){
            System.out.println(temp.data);
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
        DoublyLinkedListAddFirst list=new DoublyLinkedListAddFirst();
        System.out.println(10);
        list.addFist(10);
        System.out.println(20);
        list.addFist(20);
        System.out.println(30);
        list.addFist(30);
        System.out.println(40);
        list.addFist(40);
        System.out.println(50);
        list.addFist(50);
        System.out.println(60);
        list.addFist(60);
        list.print();
    }
}
