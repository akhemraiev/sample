public class Arrays5 {

    // find sum of array elements, less than 0
    public static void main(String[] args) {
        int[] array = {12, 23, -1, -6, 44, 12, - 56};
        int result = 0;

        for (int item = 0; item < array.length; item++) {
            int element = array[item];
            if (element < 0) {
//                result = result + array[item];
                result = result+element;
            }
        }


        System.out.println(result);
    }
}
