package com.forest.collection.array;

/**
 * 稀疏数组
 *
 * @author Forest
 * @date 2020年05月11日 12:17
 */
public class SparseArray {

    public static void main(String[] args) {
        int[][] array = new int[8][8];
        array[1][3] = 1;
        array[2][4] = 2;
        array[4][7] = 3;
        int[][] ints = array2SparseArray(array);
        sparseArray2Array(ints);
    }

    /**
     * 数组转稀疏数组
     *
     * @param array
     * @return
     * @author Forest
     * @date 2020/5/14 12:57 上午
     */
    private static int[][] array2SparseArray(int[][] array) {
        // 打印原数组
        System.err.println("原数组：");
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.err.print(anInt + "  ");
            }
            System.err.println();
        }
        // 获取非零数字个数
        int validCount = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (0 != anInt) {
                    validCount++;
                }
            }
        }
        int[][] sparseArray = new int[validCount + 1][3];
        sparseArray[0][0] = array.length;
        sparseArray[0][1] = array[0].length;
        sparseArray[0][2] = validCount;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (0 != array[i][j]) {
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = array[i][j];
                    count++;
                }
            }
        }
        System.err.println("转换后的稀疏数组：");
        for (int[] ints : sparseArray) {
            for (int anInt : ints) {
                System.err.print(anInt + " ");
            }
            System.err.println();
        }
        return sparseArray;
    }

    /**
     * 稀疏数组转数组
     *
     * @param array
     * @return
     * @author Forest
     * @date 2020/5/14 1:13 上午
     */
    private static void sparseArray2Array(int[][] array) {
        int[][] newArray = new int[array[0][0]][array[0][1]];
        for (int a = 1; a <= array[0][2]; a++) {
            newArray[array[a][0]][array[a][1]] = array[a][2];
        }
        System.err.println("转换后的原数组");
        for (int[] ints : newArray) {
            for (int anInt : ints) {
                System.err.print(anInt + "  ");
            }
            System.err.println();
        }
    }

}
