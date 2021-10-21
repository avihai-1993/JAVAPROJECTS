public class Main {

    public static void main(String[] args) {

       System.out.println(det(new double[][] {{2,0,0,1},{3,0,0,2},{1,4,0,0},{2,0,1,3}}));
    }

    //concriet code
    private static double det(double[][] mat) {
        if(mat.length != mat[0].length) { System.out.println("not a squar mat");return 0; }
        if(mat.length == 2) { return mat[0][0]*mat[1][1] - mat[0][1]*mat[1][0]; }
        double [] arr = new double[mat.length];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) { arr[i] = mat[0][i] * det(minor(mat,0,i)); }
        for (int i = 0; i <arr.length ; i++) { sum += Math.pow(-1,i)*arr[i]; }
        return sum;
    }
    private static  double [][] minor (double [][] mat ,int i , int j){
        double [][] matMinor = new double[mat.length-1][mat.length-1];
        for (int k = 0 , x = 0; k <mat.length ; k++) {
            if(k != i){
                for (int l = 0 , y = 0; l <mat.length ; l++) {
                    if(l != j){
                        matMinor[x][y] = mat[k][l];
                        y++;
                    }
                }
                x++;
            }
        }
        return matMinor;
    }



    //utilltys
    private static void printarr(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    private static void  printMat(double [][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[0].length ;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

}
