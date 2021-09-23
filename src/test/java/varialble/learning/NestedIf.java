package varialble.learning;

public class NestedIf {
    public static void main(String[] args) {
        int age = 20;
        int weight = 57;
        if (age > 19) {
            if (weight >= 58) {
                System.out.println("You are healthy");
            } else {
                System.out.println("You need healthy diet plan");
            }
        } else {
            System.out.println("You are under age for treatment");
        }
    }
}