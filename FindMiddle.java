class Node{
    int data;
    Node next;
}
public class FindMiddle{
    public static void main(String[] args) {
        Node head,middle,last;

        head=new Node();
        middle=new Node();
        last=new Node();

        head.data=10;
        middle.data=20;
        last.data=30;


        head.next = middle;
        middle.next = last;
        last.next=null;

        Node temp =head;
        System.out.print("LinkedList: " );
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        Node temp2 =head;
        Node temp3 =head;

        while (temp2.next != null) {
            temp2 = temp2.next;
            if(temp2.next !=null) {
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
        }

        System.out.println("Middle Element: " + temp3.data);

    }
}