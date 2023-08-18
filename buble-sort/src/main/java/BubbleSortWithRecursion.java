import java.util.Arrays;

public class BubbleSortWithRecursion {
    static int[] array = {53, 87, 32, -45, 56, -34, 0, 58, -4};

    public static void bubbleSort(int i, int j, int k){

            if (j < array.length-k) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                bubbleSort(++i, ++j, k);
            }

    }

    public static void main(String[] args) {
        int k = 0;
        while (k < array.length-1) {
            int i = 0;
            int j = 1;
            bubbleSort(i, j, k);
            k++;
        }
        System.out.println(Arrays.toString(array));
    }
}
