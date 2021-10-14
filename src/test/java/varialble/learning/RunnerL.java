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
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = r;
        }
    }

    public void insertAtStart(int data) {
        Node r = new Node();
        r.data = data;
        r.next = head;
        head = r;
    }

    public void insertatany(int index, int data) {
        Node r = new Node();
        r.data = data;
        if (index == 0) {
            insertAtStart(data);
            return;
        }
        Node n = head;
        for (int i = 0; i < index - 1; i++) {
            n = r.next;
        }
        r.next = n.next;
        n.next = r;

    }
    public void delete (int index) {
        if (index==0){
            head = head.next;
        }
        else{
            Node temp = head;
            Node temp1 = null;
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
            temp1=temp.next;
            temp.next=temp1.next;
           // System.out.print(" "+ temp1.data);

        }

    }

    public void show(){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
    }
    }
}
