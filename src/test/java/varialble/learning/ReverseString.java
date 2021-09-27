package varialble.learning;

public class ReverseString {
    public static void main(String[] args) {
        String a = "aaabaaa";
        String b = "";
        for (int i = a.length() - 1; i > 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println("Palendrom String");
        } else {
            System.out.println("Not a Palendrom String");
        }
    }
}

