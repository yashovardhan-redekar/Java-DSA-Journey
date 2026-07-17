// public class right_triangle {
//     public static void main(String args[]){
//         int n =5;
//         for(int rows = 1; rows<=n;rows++){
//             for(int cols=1; cols<= rows;cols++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

public class right_triangle{
        public static void main(String args[]){
            int n = 5;
            for(int row = 1; row<= n; row++){
                for(int col = 1; col<=row; col++){
                    System.out.print(row+" ");
                }
                System.out.println();
            }
        }
    }