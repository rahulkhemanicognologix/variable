package varialble.learning;

public class IfElseIf {
    public static void main(String[] args) {
        int marks = 80;
        if (marks < 40 && marks>50) {
            System.out.println(" Your Result is Grade D");
        } else if (marks >= 50 && marks<60) {
            System.out.println("Your Result is Grade C");
        } else if (marks >= 60 && marks<70) {
            System.out.println("Your Result is Grade B+");
        } else if (marks >= 70 && marks<80) {
            System.out.println("Your Result is Grade B ");
        } else if (marks >= 80 && marks<90) {
            System.out.println("Your Result is Grade A");
        } else if (marks >= 90 && marks<100) {
            System.out.println("Your Result is A+");
        }else {
                System.out.println("You are Fail");
            }
        }
    }


