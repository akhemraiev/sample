package foreach;

public class ForeachConsole {

    public static void main(String[] args) {
//        for(int i = 0; i < 10; i = i + 1) {
//            System.out.println(i);
//        }
        for(int i = 0; i<100; i = i+1) {
            System.out.println("*");
        }

        for(int i = 0; i<100; i = i+1) {
            System.out.print("*");
        }
        System.out.println("\n");
        for(int i = 0; i<3; i= i+1) {
            for(int j = 0; j<3; j=j+1) {
                System.out.print("*");
            }
            System.out.print("\n");

        }

        System.out.println("I'm here");
        for(int i = 0; i<100; i=i+1) {
            for(int j = 0; j<100; j=j+1) {
                System.out.print("*");
            }
            System.out.print("\n");
        }



        for(int i = 0; i<5; i=i+1) {
            for(int j = 0; j<10; j=j+1) {
                System.out.print("\\");
            }
            System.out.print("\n");
            for(int l = 0; l<10; l=l+1) {
                System.out.print("/");
            }
            System.out.print("\n");
        }


        for(int i=0; i<20; i=i+1) {
            if (i%2==0){
                for(int j = 0; j<11; j=j+1) {
                    System.out.print("\\");
                }
                System.out.print("\n");
            } else {
                for(int j = 0; j<11; j=j+1) {
                    System.out.print("/");
                }
                System.out.print("\n");
            }
        }

        for(int i=0; i<15; i=i+1) {
            for (int j=0; j<15; j=j+1) {
                if (j%2==0) {
                    System.out.print("o");

                }
                else {
                    System.out.print("x");
                }


            }
            System.out.print("\n");

        }



    }

}
