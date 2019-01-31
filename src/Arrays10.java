public class Arrays10 {

    // zero out all negative values
    public static void main(String[] args) {
//        int[] array = {12, 23, 0, 0, 44, 12, 56};
        int[] array = {12, 23, -1, -6, 44, 12, 56};

        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element < 0) {
                array[index] = 0;
            }
        }

        for (int el : array) {
            System.out.println(el);
        }
    }
}
