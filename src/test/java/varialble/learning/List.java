package varialble.learning;
public class List {
    public static void main(String[] args) {
        RunnerL x = new RunnerL();
        x.insert(5);
        x.insert(4);
        x.insert(3);
        x.insert(8);
        x.insertAtStart(32);
        x.insertatany(1,6);
        x.insertatany(0,2);
        x.delete(2);
        x.show();

    }
}
