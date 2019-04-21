package foreach;

public class ForeachHW {

    public static void main(String[] args) {

        /*
        * X0X0X
        * 0X0X0
        * X0X0X
        * 0X0X0
        * X0X0X
        * */

        /*
        * xxxxx
        * x   x
        * x   x
        * x   x
        * xxxxx
        * */




        /*
         * 100000
         * 010000
         * 001000
         * 000100
         * 000010
         * 000001
         * */

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (j==i){
                    System.out.print("1");

                }  else {
                    System.out.print("0");
                }

            }
            System.out.print("\n");
        }
        System.out.print("\n");
        /*
         * 00001
         * 00010
         * 00100
         * 01000
         * 10000
         * */
        for (int i = 1; i <=5; i++)
        {
            for (int j = i; j <5; j++)
            {
                System.out.print("0");
            }
            System.out.print("1");
            for (int k = 1; k < i; k++)
            {
                System.out.print("0");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int i = 0; i <=6; i++)
        {
            for (int j = 0; j <=6; j++)
            {
                if (j==6-i) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }

            }
            System.out.print("\n");
        }

        /*
         * 10001
         * 01010
         * 00100
         * 01010
         * 10001
         * */

        for (int i = 0; i <=6; i++)
        {
            for (int j = 0; j <=6; j++)
            {
                if (j==i || j==6-i) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.print("\n");
        }

        /*
         * X0X0X
         * 0X0X0
         * X0X0X
         * 0X0X0
         * X0X0X
         * */
        for (int i = 0; i <=6; i++)
        {
            for (int j = 0; j <=6; j++)
            {
                if ((j%2==0 && i%2==0) || (j%2!=0 && i%2!=0))
                {
                    System.out.print("2");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        /*
         * xxxxx
         * x   x
         * x   x
         * x   x
         * xxxxx
         * */

        for (int i = 0; i <=6; i++)
        {
            for (int j=0 ; j <=6; j++)
            {
                if (i==0 || j==0 || i==6 || j==6)
                {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }


        /*
         * x
         * xx
         * xxx
         * xxxx
         * xxxxx
         * xxxxxx
         * xxxxxxx
         * */

        for(int i=0; i<7; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.print('\n');
        }

    }
}
