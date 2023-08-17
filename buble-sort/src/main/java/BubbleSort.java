import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {12,-4,23,50,1,-5,0};
        int j = 0;

        do{
            int i = 0;
            int temp;
            do {
                https://github.com/Testing-Playground-1/algorithems.git
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            } while (++i < array.length -1-j);
        }while ( ++j <  array.length-1);

        System.out.println(Arrays.toString(array));
    }
}
