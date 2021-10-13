package varialble.learning;

public class RunnerL {
    Node head;

    public void insert(int data) {
        Node r = new Node();
        r.data = data;
        r.next = null;

        if (head == null) {
            head = r;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = r;
        }
    }

    public void insertAtStart(int data){
        Node r = new Node();
        r.data=data;
        r.next=head;
        head = r;


    }
    public void show(){
        Node r = head;
        while (r!=null){
            System.out.println(r.data);
            r=r.next;
    }
    }
}
