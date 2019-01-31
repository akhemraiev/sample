public class Arrays9 {

    // set to array all module values
    public static void main(String[] args) {
//        int[] array = {12, 23, 1, 6, 44, 12, 56};
        int[] array = {12, 23, -1, -6, 44, 12, 56};

        for (int index = 0; index < array.length; index++) {
            int element = array[index];
            if (element < 0) {
                array[index] = element * -1;
            }
        }

        for (int el : array) {
            System.out.println(el);
        }
    }
}
