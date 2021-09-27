package varialble.learning;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Rahul";
        String name2 = "Khemani";
        String name3 = " Data Engineer";

        String fullname = name.concat(name2).concat(name3);
        System.out.println(fullname);

        System.out.println(name.charAt(3));
        System.out.println(name.equals(name2));
        System.out.println(name.contains("Rahul"));
        System.out.println(name3.substring(3));
        System.out.println(name2.substring(0,4));
        System.out.println(fullname.length());


    }
}
