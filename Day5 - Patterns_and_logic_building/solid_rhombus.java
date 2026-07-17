public class solid_rhombus {
    public static void main(String args[]){
        int n = 5;

        for(int rows = 1; rows <= 5; rows++){
            for(int cols = 1; cols<=n-rows; cols++){
                System.out.print("  ");
            }
            for(int cols =1; cols<=n; cols++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}
