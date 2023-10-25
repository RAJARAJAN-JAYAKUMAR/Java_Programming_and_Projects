// public class Arrays {

//     public static void arrayreturn() {
//         int num[] = {9, 7, 6, 5, 4, 4};
//         for (int n : num) {
//             System.out.println(n);
//         }
//     }

//     public static void main(String[] args) {
//         arrayreturn();
//     }
// }
// public class Arrays{
//     public static void main(String[] args) {
//         int num[][] = new int[3][4];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(num[i][j] + " ");
//             }
            
//         }
//     }
// }
public class Arrays{
    public static void main(String[] args) {

        int num[][] = new int[3][4];
        // int random = (int) (Math.random()*10) // type casting to int cause math class returns double value
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                num[i][j] = (int) (Math.random()*10);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println(num[i][j] + " ");
            }
        }
    }
}


