package com.company;

public class Dom_zadanie2 {
    public static void main(String[] args) {
        int[][] matrix3=new int[][]{{1,2,3}, {4,5,6},{7,8,9}};
        int[][] matrix4=new int[][]{{10,11,12}, {13,14,15},{16,17,18}};
        for( int i=0; i<3; i++){
            int res1=matrix3[i][0]* matrix4[0][1]+matrix3[i][1]*matrix4[1][1]+matrix3[i][2]*matrix4[2][1];
            //1*11+2*14+3*17
            System.out.println(res1+ " ");
    }
}
}