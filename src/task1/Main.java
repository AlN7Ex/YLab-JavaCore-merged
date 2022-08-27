/**
 * Task 1:
 * Заполните массив случайными числами и выведите
 * максимальное, минимальное и среднее значения
 */

package task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CustomArray array = new CustomArray();

        System.out.println("Source array: ");
        array.show();
        System.out.println("Get max value: " + array.max());
        System.out.println("Get average value: " + array.average());
        System.out.println("Get min value: " + array.min());
    }
}

class CustomArray {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    String[] colors = {ANSI_RED, ANSI_GREEN, ANSI_PURPLE, ANSI_YELLOW, ANSI_BLUE};

    int[][] arr;


    public CustomArray(int[][] arr) {
        this.arr = arr;
    }

    public CustomArray() {
        arr = new int[5][5];
        Random random = new Random();

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = random.nextInt(100);
            }
        }
    }

    public int max() {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }

    public float average() {
        float avg = 0;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                avg += arr[i][j];
            }
        }
        return avg / (arr.length * arr[0].length);
    }

    public void show() {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(colors[i] + arr[i][j] + "\t" + ANSI_RESET);
            }
            System.out.print("\n");
        }
    }
}
