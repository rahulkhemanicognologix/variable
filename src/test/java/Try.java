public class Try {
    public static void main(String[] args) {

        int a = 100;
        int b = 0;
      try {
          int c = a / b;

          System.out.println(c);
      }
      catch (ArithmeticException e){
          System.out.println(e ); // will provide type or error and description but not line of error
          e.printStackTrace(); // will provide description , line of error and type of error
          System.out.println("You cannot ");
      }

    }
}
