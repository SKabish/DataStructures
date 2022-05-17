class Node{
    int data;
    Node next;
        }
public class DeteNode {
    Node head;
    public void addLast(int val){
        Node newNode=new Node();
        newNode.data=val;
        newNode.next=null;
        if(head==null)
        head=newNode;
        else{
            Node lastNode=head;
            while (lastNode.next!=null){
                lastNode=lastNode.next;
            }
            lastNode.next=newNode;
        }
    }
    public void delete(int key){
        if(head.data==key)
        {
            head=head.next;
        }
        else{
            Node temp=head;
            while (temp.next!=null){
                if(temp.next.data==key){
                    temp.next=temp.next.next;
                    break;
                }
                else
                    temp=temp.next;
            }
        }
    }
    public void print(){
        Node temp1=head;
        while(temp1!=null){
            System.out.println(temp1.data);
            temp1=temp1.next;
        }}
        public static void main(String[] args)
        {

            DeteNode list = new DeteNode();
            list.addLast(10);
            list.addLast(20);
            list.addLast(30);
            list.addLast(40);
            System.out.println("Before Deletion:");
            list.print();
            System.out.println("Deleting Element: "+30);
            list.delete(30);
            System.out.println("After Deletion:");
            list.print();
        }

    }

