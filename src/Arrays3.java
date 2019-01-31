public class Arrays3 {

    public static void main(String[] args) {
        int[] array = {12, 23, 44, 12};

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            int el = array[i];
            int rem = el*el;
            if (rem == 144) {
                result++;
            }
//            System.out.println(el);
        }

        System.out.println(result);
    }
}
