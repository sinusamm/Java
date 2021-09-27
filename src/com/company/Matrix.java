package com.company;

public class Matrix {
    public static void main(String[] args) {
//        int [] [] massive= new int[] []  {{1,3,5}, {2,4,6}, {7,8,9}};
// {{1,3,5}, {2,4,6}, {7,8,9,2,5,6,}, {2,4,3,2,6,15,7}};----------mojet bit tak
// System.out.print(massive [6][5]);----------{2,4,3}-------15
      int[][] matrix1=new int[][]{{1,2}, {3,4}};
        int[][] matrix2=new int[][]{{5,6}, {7,8}};
        int[][] matrix3=new int[][]{{1,2,3}, {4,5,6},{7,8,9}};
        int[][] matrix4=new int[][]{{10,11,12}, {13,14,15},{16,17,18}};
        for(int i=0; i<2; i++){
            //vivodim stroku
             int result1=matrix1[i][0]* matrix2[0][0]+matrix1[i][1]*matrix2[1][0];
                     //1*5+2*7
            //pri umnoj matritsi drug a druga mi umn stochki na stolbiki
//            System.out.print(result1 + " ");

//            int result2=matrix1[i][0]* matrix2[0][1]+matrix1[i][1]*matrix2[1][1];
            // 1*6+2*8
//            System.out.print(result2);
//            System.out.println();
            //  System.out.println();------------- s novoi stroki
        }
        for( int i=0; i<3; i++){
            int res1=matrix3[i][0]* matrix4[0][0]+matrix3[i][1]*matrix4[1][0]+matrix3[i][2]*matrix4[2][0];
            //1*10+2*13+3*16
            int res2=matrix3[i][0]* matrix4[0][1]+matrix3[i][1]*matrix4[1][1]+matrix3[i][2]*matrix4[2][1];
            //1*11+2*14+3*17
            int res3=matrix3[i][0]* matrix4[0][2]+matrix3[i][1]*matrix4[1][2]+matrix3[i][2]*matrix4[2][2];
            //1*12+2*15+3*18
            System.out.print(res1 + "\t");
            System.out.print(res2 + "\t");
            System.out.print(res3);
            System.out.println();
        }
    }
}
