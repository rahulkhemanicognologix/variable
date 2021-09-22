package varialble.learning;

public class SwitchString {
    public static void main(String[] args) {
        String difficulty = "Expert";
        int level = 0;

        switch (difficulty) {
            case "Begineer":
                level = 1;
                System.out.println("This is Begineer");
                break;
            case "High":
                level = 2;
                break;
            case "Expert":
                level = 3;
                break;
            default:
                System.out.println("Begin the game to reach any level");
        }
        {
            System.out.println("Your level is:" +level );


        }
    }
}
