public class Arrays6 {

    // find first negative element
    public static void main(String[] args) {
        int[] array = {12, 23, -1, -6, 44, 12, - 56};
        int result = 0;

        for (int item = 0; item < array.length; item++) {
            int element = array[item];
            if (element < 0) {
                result = element;
                break;
            }
        }


        System.out.println(result);
    }
}
