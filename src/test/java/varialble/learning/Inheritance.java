package varialble.learning;

/*public class Inheritance {
    public static void eat () {

        System.out.println("Object 1 ");
    }

}
class Fruit extends Inheritance {
    public static void main(String[] args) {
        Fruit a = new Fruit();
        a.eat();
    }
}
*/
/*
class A {
     void Show() {
        System.out.println(" This is A");
    }
}
class B extends A{
    void ShowB() {
        System.out.println("This is B");
    }

    public static void main(String[] args) {
        A  object = new A();
        object.Show();
        B obj = new B();
        obj.Show();
        obj.ShowB();
    }
}
*/
/*
class x {
    public static void name1(){
        System.out.println("This is Rahul");
    }
}

class y extends x {
    public static void name2(){
        System.out.println("This is Himanshu");
    }
}

class z extends y {
    public static void name3 (){
        System.out.println("This is Rohit ");
    }

    public static void main(String[] args) {
        z result = new z ();
        result.name1();
        result.name2();
        result.name3();
    }

}
*/

class k {
    public static void run (){
        System.out.println("Rahul is Running");
    }
}

class m extends k {
    public static void stop(){
        System.out.println("Rahul should now stop ");
    }
}

class p extends m {
    public static void resume (){
        System.out.println("Rahul can Resume");
    }

    public static void main(String[] args) {
        p runner = new p ();
        runner.run();
        runner.stop();
        runner.resume();
    }
}