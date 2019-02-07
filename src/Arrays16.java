public class Arrays16 {

    //8. Write a Java program to copy and reverse an array by iterating the array.
    public static void main(String[] args) {
        int[] array = {12, 23, -1, -6, 44, 12, 56};
        int[] newArray = new int[array.length];

//        for (int index = 0, newArrayIndex = array.length-1; index < array.length; index++, newArrayIndex--) {
//            newArray[index] = array[newArrayIndex];
//        }

        for (int index=0; index<array.length; index++) {
            newArray[index] = array[array.length-1-index];
        }

        System.out.println(java.util.Arrays.toString(newArray));


    }
}
