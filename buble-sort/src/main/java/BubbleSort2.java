import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] array = {12, 4, 5, 3, -4, 8, -1, 0};
        int j=0;
        do {
            int i = 0;
            do {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }

            } while (++i < array.length - 1-j);
        }while (++j < array.length);
        System.out.println(Arrays.toString(array));
    }
}
