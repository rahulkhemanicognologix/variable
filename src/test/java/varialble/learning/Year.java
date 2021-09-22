package varialble.learning;

public class Year {
    public static void main(String[] args) {
        int year = 2000;
        if (year % 400 == 0) {
            System.out.println(year + " Year is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + "year is a leap year");
        } else {
            System.out.println(year + "Year is not a leap year");
        }
    }
}






