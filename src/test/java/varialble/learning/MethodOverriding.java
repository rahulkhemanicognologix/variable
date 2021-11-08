package varialble.learning;

 class MethodOverriding {
   void show (int a , String b ){
       System.out.println("HI this is Rahul");
   }
}
class Methodoverriding1 extends MethodOverriding {
    void show( int a, String b ) {
        System.out.println("Hi this is Khushi");
    }

    public static void main(String[] args) {
        Methodoverriding1 x = new Methodoverriding1();
        x.show(5,"Rahul");

        MethodOverriding y = new MethodOverriding();
        y.show(8,"Khushi");

    }
}

