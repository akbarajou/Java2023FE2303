public class MaxMinInArray {

    public static void main(String[] args) {
        int[] array = {10, 2, 3, 4, 15, 6, 7, 8, 9};
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
