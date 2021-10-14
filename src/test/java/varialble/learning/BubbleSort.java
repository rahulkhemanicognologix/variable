package varialble.learning;

public class BubbleSort {
    public static void main(String[] args) {
        int a [] = new int[]{1,22,33,42,5,96,75,23,12,3,9,21,14,8,6,11,12,13,14,15,16,17};
        int temp ;
        for (int i=0;i<a.length;i++){
            int flag = 0 ;
            for(int j = 0; j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            } if (flag==0){
                break;
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }
}
