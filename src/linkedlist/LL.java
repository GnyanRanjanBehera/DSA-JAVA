package linkedlist;

public class LL {
    private  Node head;
    private Node tail;

    private  int size;

//    display the node
    public  void display(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");

    }





//    insert element in linked list
    public  void insertFirst(int val){
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        if(tail==null){
            tail=head;
        }
        size++;

    }

    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node newNode=new Node(val);
        tail.next=newNode;
        tail=newNode;
        size++;

    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node newNode=new Node(val, temp.next);
       temp.next=newNode;
       size++;

    }

    public void deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
    }

    public void deleteLast(){
        if(size==1){
            deleteFirst();
        }else{
            Node secondlast=get(size-2);
            tail=secondlast;
            secondlast.next=null;
            size--;
        }

    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }
        Node node=get(index-1);
        node.next=node.next.next;
        size--;
    }

    public Node find(int val){
        Node node=head;
        while (node != null){
            if(node.value==val){
                return node;
            }
            node=node.next;

        }
        return  null;

    }

    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }






    class  Node {
        private int value;
        private  Node next;
        Node(int value){
            this.value=value;
            this.next=null;
        }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }


    }
}
