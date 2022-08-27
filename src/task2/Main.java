/**
 * Task 2:
 * Отсортируйте массив [5, 6, 3, 2, 5, 1, 4, 9]
 */

package task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        CustomArray array1 = new CustomArray(new int[]{5, 6, 3, 2, 5, 1, 4, 9});
        System.out.println("Source array: ");
        array1.show();
        System.out.println("Sorting...");
        array1.sort();
        array1.show();

    }
}

class CustomArray {
    int[] arr;

    public CustomArray(int[] arr) {
        this.arr = arr;
    }

    public CustomArray() {
        arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt(100);
        }
    }

    public void show() {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Insert sort
    public int[] sort() {
        int min, inner, outer;

        for (inner = 0; inner < arr.length - 1; ++inner) {
            min = inner;

            for (outer = inner + 1; outer < arr.length; ++outer) {
                if (arr[min] > arr[outer]) {
                    swap(min, outer);
                }
            }
        }
        return arr;
    }

    public void swap(int one, int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}
