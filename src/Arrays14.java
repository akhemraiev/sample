public class Arrays14 {

    //Write a Java program to find the index of an array element
    public static void main(String[] args) {
//        int[] array = {12, 23, 0, 0, 44, 12, 56};
        int[] array = {12, 23, -1, -6, 44, 12, 56};
        int el = 12;

        int result=-1;

        for (int index=0; index< array.length; index++) {
            int element = array[index];
            if (element==12) {
                result=index;
                break;
            }
        }
        System.out.println(result);


    }
}
