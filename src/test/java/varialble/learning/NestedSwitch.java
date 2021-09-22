package varialble.learning;

public class NestedSwitch {
    public static void main(String[] args) {
        int year = 2;
        char section = 'b';
        switch (year) {
            case 1:
                System.out.println("English , Maths, Hindi,Sanskrit");
                break;
        }
        switch (section) {
            case 'a':
                System.out.println("Your Syllabus = Maths, Hindi");
                break;
            //case 'b':
             //   System.out.println("Your Syllabus = English, Sanskrit");
               // break;
        }
        switch (year) {
            case 2:
                //System.out.println("Your Syllabus = R , Big Data, Java, Python");
                break;
        }
        switch (section) {
            case 'a':
                System.out.println("Your Syllabus = Python, R");
                break;
            case 'b':
                System.out.println("Your Syllabus = \n Big Data , Java");
                break;
            default:
                System.out.println("You are from other department");
        }
    }
}