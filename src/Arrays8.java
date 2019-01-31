public class Arrays8 {

    // print out all elements, grater than 40
    public static void main(String[] args) {
        int[] array = {12, 23, -1, -6, 44, 12, 56};

        for (int item = 0; item < array.length; item++) {
            int element = array[item];
            if (element > 40) {
                System.out.println(element);
            }
        }
    }
}
