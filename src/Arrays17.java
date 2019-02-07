public class Arrays17 {

    //8. Write a Java program to reverse an array
    public static void main(String[] args) {
        int[] array = {12, 23, -1, -6, 44, 12, 56};
        for (int index = 0; index < array.length; index++) {
            int interel = array[index];
            array[index]=array[array.length-1-index];
            array[array.length-1-index]=interel;
        }

        System.out.println(java.util.Arrays.toString(array));


    }
}
