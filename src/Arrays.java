public class Arrays {

    public static void main(String[] args) {
        int[] array = {12, 23, 44, 12};

        int number = array[1];
//        System.out.println(number);

        int x = 12;
        x++; // x = x + 1;

        boolean has44 = false;

        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            if (el == 44) {
                has44 = true;
            }
        }

        System.out.println(has44);
    }
}
