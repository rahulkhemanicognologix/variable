package varialble.learning;
public class Recurssion {
    public static void main(String[] args) {
        int a[][] = {{1, 1, 1, 1, 2, 1, 1, 1},
                {1, 1, 1, 1, 2, 1, 1, 0},
                {1, 0, 0, 2, 2, 1, 0, 0},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1}};
        replace(a, 4, 3, 3, 2);
        printMatrix(a);


       System.out.println(pwr(3,3));
        System.out.println(sum(5));
       System.out.println(way(4,4));
    }


    static int sum(int n ){
        if( n == 1 ) {
           return 1 ;
        }
       return n + sum(n-1);

   }

   static int pwr (int c , int f ){
       if (f==0){
            return 1 ;
        }
       return c*pwr(c,f-1);
  }

    static int way (int m , int n){
       if (m==1||n==1){
          return 1;
       }
        return way(n,m-1 ) + way(m, n-1);
   }

    static void replace (int a[][] ,  int r , int c , int nnew , int old) {
        int rows = a.length;
        int col = a[0].length;

        if(r<0 || r>=rows || c<0 || c> col){
            return;
        }
        if (a[r][c]!= old ){
            return;
        }
        a[r][c]=nnew;

        replace (a, r-1, c, nnew , old);
        replace(a, r+1, c, nnew, old);
        replace(a, r , c-1, nnew, old );
        replace(a,r,c+1, nnew , old );

    }
    static void printMatrix(int a[][]){
        for (int[] x:a){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();

        }
    }


}

