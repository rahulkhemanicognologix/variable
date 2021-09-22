package varialble.learning;

public class SwitchStatement {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 17;

        switch (a) {
            case 100:
                System.out.println("100 This data is available ");
                break;
            case 80:
                System.out.println("80 This data is not available");
                break;
            default:
                System.out.println(" Given Data is invalid ");
        }
        switch (b){
            case 70:
                System.out.println("70 This data is available");
                break;
            case 20:
                System.out.println ("20 This data is available");
                break;
            default:
                System.out.println("Given Data is invalid");

        }
        switch(c){
            case 12:
                System.out.println("This data is available");
                break;
            case 15:
                System.out.println("This data is available");
                break;
            default:
                System.out.println("Given Data is invalid");

                }

        }
    }

