package com.company;

public class Matrix {
    public static void main(String[] args) {
//        int [] [] massive= new int[] []  {{1,3,5}, {2,4,6}, {7,8,9}};
//        System.out.print(massive [1][1]);
      int[][] matrix1=new int[][]{{1,2,}, {3,4,}};
        int[][] matrix2=new int[][]{{5,6,}, {7,8,}};
        for(int i=0; i<2; i++){
            //vivodim stroku
             int result1=matrix1[i][0]* matrix2[0][0]+matrix1[i][1]*matrix2[1][0];
                     //1*5+2*7
            //pri umnoj matritsi drug a druga mi umn stochki na stolbiki
            System.out.println(result1);
//            for(int j=0;j<2;j++){
//            }
            System.out.println();
        }
    }
}
