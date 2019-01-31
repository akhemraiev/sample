public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        boolean bool = false; //true
//        System.out.println(bool);
//        byte byte1 = 126;
//        System.out.println(byte1);
//        char symbol = 129;
//        System.out.println(symbol);
//        short short1= 128;
//        System.out.println(short1);
//        int integer = 17777777;
//        System.out.println(integer);
//        long long1 = 5645646546464646666L;
        long a = 12;
        long b = 3;
        String operation = "*";


        long result = doWork(a, b, operation);
        System.out.println(result);
    }

    public static long doWork(long a, long b, String operation) {
        long result;

        if ("-".equals(operation)) {
            result = substract(a, b);
            return result;
        } else if("+".equals(operation)) {
            result = sum(a, b);
            return result;
        } else if("*".equals(operation)) {
            result = multiply(a, b);
            return result;
        } else if("/".equals(operation)) {
            result = devide(a, b);
            return result;
        } else if("pow".equals(operation)) {
            result = pow(a, b);
            return result;
        }

        throw new RuntimeException("illegal values");
    }

    private static long pow(long a, long b) {
        long powResult = (long) Math.pow(a, b);
        return powResult;
    }

    public static long sum(long first, long second) {
        long result1 = first + second;
        return result1;
    }


    public static long substract(long frist1, long second2) {
        long result2;
        result2 = frist1 - second2;
        return result2;
    }

    public static long multiply(long pervyi, long vtoroi) {
        long result3 = pervyi * vtoroi;
        return result3;
    }

    public static long devide(long premier, long deuxieme) {
        long result4 = premier / deuxieme;
        return result4;
    }

    public static int getMaxInt() {
        return Integer.MAX_VALUE;
    }
}
