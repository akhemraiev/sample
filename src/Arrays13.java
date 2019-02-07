public class Arrays13 {

    //find the average value
    public static void main(String[] args) {
//        int[] array = {12, 23, 0, 0, 44, 12, 56};
        int[] array = {12, 23, -1, -6, 44, 12, 56};
        int result=0;

        for (int index=0; index < array.length; index++) {
            int element = array[index];
            result= result+element;
        }
        result=result/array.length;

        System.out.println(result);

    }
}
