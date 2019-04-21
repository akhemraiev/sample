package foreach;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {34, 12, 44, 2, 3, 6, 1, 23, 48, 13};


        for(int j = 0; j < arr.length; j++) {
            int imin = j;
            for (int i = j; i < arr.length; i++) {
                if (arr[i] < arr[imin]) {
                    imin = i;
                }
            }
            int inter = arr[imin];
            arr[imin] = arr[j];
            arr[j] = inter;
        }

        // bubble sort from the greatest to the lowest








        for (int i = 0; i <arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
