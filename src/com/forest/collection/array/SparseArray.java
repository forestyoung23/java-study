package com.forest.collection.array;

/**
 * 稀疏数组
 *
 * @author dongyang
 * @date 2020年05月11日 12:17
 */
public class SparseArray {

    public static void main(String[] args) {
        int[][] array = new int[11][11];
        array[1][3] = 2;
        array[2][4] = 2;
        array[4][7] = 3;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.err.print(array[i][j] + " ");
            }
            System.err.println();
        }
        int validNumber = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (0 != anInt) {
                    validNumber++;
                }
            }
        }
        int[][] sparseArray = new int[validNumber + 1][3];
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = validNumber;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.err.print(sparseArray[i][j] + " ");
            }
            System.err.println();
        }
    }

}
