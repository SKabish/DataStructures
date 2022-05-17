class Node{
    int data;
    Node next;
}
public class AddLast {
    Node head;
    public void addlast(int val){
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=null;
        if(head==null)
            head=newNode;
        else{
            Node lastNode=head;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {

        AddLast list = new AddLast();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(40);
        System.out.println("The Last Elements Are:");
        list.print();
    }

}
