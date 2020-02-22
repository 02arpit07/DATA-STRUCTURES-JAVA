package LinkedList;

public class LinkedListDelete {
    Node head;
    public static void main(String [] args)
    {
        LinkedListDelete llist = new LinkedListDelete();
        llist.push(1);
        llist.push(4);
        llist.push(1);
        llist.push(12);
        llist.push(1);

        System.out.println("Deleting the list");
        llist.display();
        llist.deleteList();
    }
    public void push(int data)
    {
     Node node=new Node(data);
     node.next=head;
     head=node;
    }
    public void deleteList()
    {
        head=null;
        System.out.println("Linked list deleted");

    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
