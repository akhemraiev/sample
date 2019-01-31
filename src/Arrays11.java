public class Arrays11 {

    //find the greatest value
    public static void main(String[] args) {
//        int[] array = {12, 23, 0, 0, 44, 12, 56};
        int[] array = {12, 23, -1, -6, 44, 12, 56};

        int max = array[0];

        for (int index = 1; index < array.length; index++) {
            if (array[index] > max) {
                max = array[index];
            }
        }

        System.out.println(max);

    }
}
