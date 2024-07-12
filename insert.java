import java.util.Arrays;

class SecondLargest {
    public static int[] insertElement(int array[], int position, int element) {
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }
        array[position] = element;
        return array;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int k = 2;
        int ele = 10;
        int res[] = insertElement(a, k, ele);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
