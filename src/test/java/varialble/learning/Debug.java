package varialble.learning;

public class Debug {
    public static void main(String[] args) {
    int add = addFromLastToOne(5);
    System.out.println(add);

    int add1 = addFromOneToLast(1,5);
    System.out.println(add1);

    int sum = 0;
    for (int i = 1 ; i <= 5 ; i++) {
        sum = sum + 1;
    }
    System.out.println(sum);
}

    private static int addFromOneToLast(int i,int limit) {
        if(i == limit) {
            return 1;
        } else {
            int i1 = addFromOneToLast(i+1,limit);
            System.out.println("Opearation " + i1);
            return i1+1;
        }
    }

    private static int addFromLastToOne(int i) {
        if(i  == 1) {
            return 1;
        } else {
            int add = addFromLastToOne(i-1);
            System.out.println("Performing operation = " + add + " +1");
            return add+1;
        }
    }
}
