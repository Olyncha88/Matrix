package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][][] ThreeArray = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12},
                        {13, 14, 15}
                }
        };
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число, на которое необходимо увеличить элементы массива");
        int num = scan.nextInt();
        for (int[][] array2D : ThreeArray) {
            for (int[] array1D : array2D) {
                for (int item : array1D) {
                    System.out.print((item + num) + " ");
                }
            }

        }
        System.out.println();
        String[][] Shess = new String[8][8];
        for (int k = 0; k < Shess.length; k++) {
            for (int l = 0; l < Shess[0].length; l++) {
                if ((k + l) % 2 == 0) Shess[k][l] = "W";
                else Shess[k][l] = "B";
                System.out.print((Shess)[k][l] + " ");
            }
            System.out.println();
        }
    }
}

