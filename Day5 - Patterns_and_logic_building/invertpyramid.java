public class invertpyramid {
    public static void main(String args[]){
        int n=5;
        for(int row=1; row<= n; row++){
            for(int col=1;col<=row-1;col++){
                System.out.print("  ");
            }
            for(int cols=1; cols <= 2*n-2*row+1; cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
