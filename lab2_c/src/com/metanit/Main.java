package com.metanit;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * задачи с матрицей
 *
 *Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения
 * элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
 * @author Надя
 */
public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        fillRandom(arr, size);//заполнение случ
        printArr(arr);
       /*moveToLeft(arr); //циклич сдвиг
        printArr(arr);
        moveToRight(arr);
        printArr(arr);
        moveToUp(arr);
        printArr(arr);
        moveToDown(arr);
        printArr(arr); */
        System.out.println("Нули сдвинуты вправо:");
        zeroToRight(arr);//нули в строках-после всех остальных
        printArr(arr);
        System.out.println();
    }

    public static void fillRandom(int a[][], int d) {
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[j][i] = random.nextInt(2 * d + 1) - d;
            }
        }
    }

    public static void printArr(int[][] a) {

        for (int[] x : a) {
            for (int z : x) {
                System.out.print(z + "  ");
            }
            System.out.println();
        }

    }

    /**Преобразовать строки матрицы таким образом, чтобы элементы, равные нулю, располагались после всех остальных
     *
     * @param b
     */
    public static void zeroToRight(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            int n = 0;
            int[] c = new int[b.length];
            for (int j = 0; j < b.length; j++) {
                if (b[i][j] != 0) {
                    c[n++] = b[i][j];
                }
            }
            b[i] = Arrays.copyOf(c, c.length);
        }
    }
}

        /*Выполнить циклический сдвиг заданной матрицы на k позиций вправо
        (влево, вверх, вниз)*/

    /*public static void moveToLeft(int[][] b) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сдвиг влево");
        int step = sc.nextInt();
        if (step > b.length || step < 1) {
            System.out.println("Сдвиг невозможен");
            return;
        }
        int buff, i, j;
        for (int r = 0; r < step; r++) {
            for (i = 0; i < b.length; i++) {
                buff = b[i][0];
                for (j = 0; j < b.length - 1; j++) {
                    b[i][j] = b[i][j + 1];
                }
                b[i][j] = buff;
            }
        }
    }

     public static void moveToRight(int[][] b) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Введите сдвиг вправо");
         int step = sc.nextInt();
         if (step > b.length || step < 1) {
             System.out.println("Сдвиг невозможен");
             return;
         }
         int buff, i, j;
         for (int r = 0; r < step; r++) {
             for (i = 0; i < b.length; i++) {
                 buff = b[i][b.length - 1];
                 for (j = b.length - 1; j > 0; j--) {
                     b[i][j] = b[i][j - 1];
                 }
                 b[i][j] = buff;
             }
         }
     }

     public static void moveToDown(int[][] b) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Введите сдвиг вниз");
         int step = sc.nextInt();
         if (step > b.length || step < 1) {
             System.out.println("Сдвиг невозможен");
             return;
         }
         int buff, i, j;
         for (int r = 0; r < step; r++) {
             for (i = 0; i < b.length; i++) {
                 buff = b[b.length - 1][i];
                 for (j = b.length - 1; j > 0; j--) {
                     b[j][i] = b[j - 1][i];
                 }
                 b[j][i] = buff;
             }
         }
     }

     public static void moveToUp(int[][] b) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Введите сдвиг вверх");
         int step = sc.nextInt();
         if (step > b.length || step < 1) {
             System.out.println("Сдвиг невозможен");
             return;
         }
         int buff, i, j;
         for (int r = 0; r < step; r++) {
             for (i = 0; i < b.length; i++) {
                 buff = b[0][i];
                 for (j = 0; j < b.length - 1; j++) {
                     b[j][i] = b[j + 1][i];
                 }
                 b[j][i] = buff;
             }
         }
     }*/

