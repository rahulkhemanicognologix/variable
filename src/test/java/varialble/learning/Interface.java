package varialble.learning;
/*interface rahul{
   public abstract   void show();
}
 class Interface implements rahul {
    public void show() {
        System.out.println("One Love");
    }
    public static void main(String[] args) {
        Interface l = new Interface();
            l.show();

    }*/
  interface Khushi {
      public abstract void hello();
  }
  interface Jayati {
      public abstract void world ();
  }
  class Bond implements Khushi  , Jayati {
      public void hello (){
          System.out.println("Hello World");
      }
      public void world () {
          System.out.println("Hello World Bond");
      }

      public static void main(String[] args) {
          Bond b = new Bond();
          b.hello();
          b.world();
      }
  }