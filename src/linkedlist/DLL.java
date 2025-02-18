package linkedlist;

public class DLL {
    Node head;

    public  void insertFirst(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        newNode.prev=null;
        if(head !=null){
            head.prev=newNode;
        }
        head=newNode;

    }

    public  void insertLast(int val){
        Node newNode=new Node(val);
         Node lasNode=head;

        if(head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }
        while (lasNode.next!=null){
            lasNode=lasNode.next;
        }
        lasNode.next=newNode;
        newNode.prev=lasNode;

    }

    public void insert(int after,int val){
        Node findNode= find(after);
        Node newNode=new Node(val);

        newNode.next=findNode.next;
        findNode.next=newNode;
        newNode.prev=findNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

    }

    public Node find(int value){
        Node node=head;
        while (node!=null){
            if (node.val==value){
                return node;

            }
            node=node.next;

        }
        return null;

    }

    public  void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }


    class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
        Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
