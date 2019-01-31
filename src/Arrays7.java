public class Arrays7 {

    // find first  element greater than 40
    public static void main(String[] args) {
        int[] array = {12, 23, -1, -6, 44, 12, - 56};
        int result = 0;

        for (int item = 0; item < array.length; item++) {
            int element = array[item];
            if (element > 40) {
                result = element;
                break;
            }
        }


        System.out.println(result);
    }
}
