import com.sun.source.doctree.ParamTree;

import java.util.Arrays;

public class BubbleSortRecursion {
    static int[] array = {12, 4, 5, 3, -4, 8, -1, 0};

    public static void recursionMethod1(int x, int y, int k){
        if (y<array.length- k){
            if (array[x] > array[y]) {
                int temp = array[y];
                array[y] = array[x];
                array[x] = temp;
            }
            recursionMethod1(++x, ++y, k);
        }
    }
    public static void recursionMethod2(int i){
        recursionMethod1(0,1, i);
        i++;
        if (i<array.length){
            recursionMethod2(i);
        }
    }

    public static void main(String[] args) {
        recursionMethod2(0);
        System.out.println(Arrays.toString(array));
    }
}
