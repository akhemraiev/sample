public class Arrays15 {

    //8. Write a Java program to copy an array by iterating the array.
    public static void main(String[] args) {
//        int[] array = {12, 23, 0, 0, 44, 12, 56};
        int[] array = {12, 23, -1, -6, 44, 12, 56};
        int[] newArray = new int[array.length];

        for (int index=0; index < array.length; index++) {
            newArray[index] = array[index];
        }

        System.out.println(java.util.Arrays.toString(newArray));


    }
}
