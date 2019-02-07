import java.util.Scanner;

public class UserInput2 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("type any number");

            if(myScanner.hasNextInt()) {
                int anynumber = myScanner.nextInt();
                System.out.println("You typed: "+anynumber);
            } else if (myScanner.next().equalsIgnoreCase("no")){
                System.out.println("heeeyy it's No!!!!");
                break;
            }
        }

    }
}
