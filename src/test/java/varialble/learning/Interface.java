package varialble.learning;
interface rahul{
   public abstract   void show();
}
 class Interface implements rahul {
    public void show() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Interface l = new Interface();
            l.show();

    }
}
