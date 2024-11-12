package exercicios;

public class arrayMult {
    public static void main(String[] args) {
        int [][] dias = new int[2][3];
        dias[0][0] = 111;
        dias[0][1] = 112;
        dias[0][2] = 113;

        dias[1][0] = 221;
        dias[1][1] = 222;
        dias[1][2] = 223;
        System.out.println(dias[0][1]);

//        for (int i = 0 ; i < dias.length ; i++){
//            for (int j = 0; j < dias[i].length ; j++){
//                System.out.println(dias[i][j]);
//            }
//
//        }

        for (int[]i: dias ){
             for (int arr: i){
                 System.out.println(arr);
             }
        }
        System.out.println(dias.length);
    }
}
