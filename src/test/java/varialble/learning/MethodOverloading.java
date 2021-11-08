package varialble.learning;

 class MethodOverloading {
   void hello (){
       System.out.println(" This is method 1");
   }
   void hello (int a ){
       System.out.println(" This is method 2");
   }

     public static void main(String[] args) {
        MethodOverloading x = new MethodOverloading();
        x.hello(10);

     }

}
