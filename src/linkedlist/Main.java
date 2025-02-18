package linkedlist;

public class Main {
    public static void main(String[] args) {
       DLL s=new DLL();
        s.insertFirst(5);
        s.insertFirst(7);
        s.insertFirst(9);
        s.display();
        DLL s1=new DLL();
       s1.insertLast(5);
       s1.insertLast(7);
       s1.insertLast(9);
       s1.display();
    }
}
