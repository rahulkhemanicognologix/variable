package varialble.learning;

public class Searching {
    public static void main(String[] args) {

        int [] a =  new int [] {4,5,6,8,9,1,5,7};
        int c=1;
    for (int i = 0; i<a.length;i++){
        if (a[i]==c){
            System.out.println("This is the number at " + i + "th index position" );
        }

        }

    int [] b = new int [] {1,2,3,4,5,6,7,8,9,};
    int d = 8;
    int l = 0;
    int h= b.length-1;
    int m = (l+h)/2;
    while (l<=h){
        if (b[m]==d){
            System.out.println("This Value Found at index value " + m);
            break;
        }
        else if(a[m]<d){
            l=m+1;
        }
        else {
            l=m-1;
        }
        m = (l+h)/2;
        }

    }
}
