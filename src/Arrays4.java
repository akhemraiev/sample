public class Arrays4 {

    // find sum of array elements
    public static void main(String[] args) {
        int[] array = {12, 23, 44, 12};

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            result = result+array[i];

//            System.out.println(el);
        }

        System.out.println(result);
    }
}
